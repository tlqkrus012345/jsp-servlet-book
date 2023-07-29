package org.example.mvc;

import org.example.mvc.adapter.HandlerAdapter;
import org.example.mvc.adapter.SimpleControllerHandlerAdapter;
import org.example.mvc.controller.RequestMethod;
import org.example.mvc.view.JspViewResolver;
import org.example.mvc.view.ModelAndView;
import org.example.mvc.view.View;
import org.example.mvc.view.ViewResolver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/*
톰캣이 해당 파일을 실행하기 위해 서블릿이어야 한다. 따라서 HttpServlet을 상속받는다.
 */
@WebServlet("/") // 모든 경로의 요청은 DispatcherServlet으로 들어온다.
public class DispatcherServlet extends HttpServlet {
    private static final Logger log = LoggerFactory.getLogger(DispatcherServlet.class);
    private HandlerMapping hm;
    private List<HandlerAdapter> handlerAdapters;
    private List<ViewResolver> viewResolvers;

    @Override
    public void init() throws ServletException {
        log.info("init");
        RequestMappingHandlerMapping rmhm = new RequestMappingHandlerMapping();
        rmhm.init();

        hm = rmhm;

        handlerAdapters = List.of(new SimpleControllerHandlerAdapter());
        viewResolvers = Collections.singletonList(new JspViewResolver());
    }

    /*
    예를 들어 회원가입을 하는 순간(form.jsp) action="/users/" 라는 곳으로 post 요청이 들어온다.
    그러면 DispatcherServlet이 요청을 받고 findHandler를 통해 httpMethod가 post이면서 경로가 users인 핸들러가 있는지 handlerMapping이 찾는다.
    handlerMapping이 users에 해당하는 핸들러인 UserCreateController를 생성하고 리턴해준다.
    핸들러는 handlerRequest를 호출하여 유저를 저장하고 리다이렉트하는 응답을 보낸다.
    그러면 get요청으로 DispatcherServlet이 받아서 handlerMapping에게 다시 핸들러를 찾고 반환해준다.
     */
    /*
    요청이 들어오면 디스패치서블릿이 핸들러매핑을 통해 컨트롤러를 검색하고 찾으면 핸들러어댑터를 통해 컨트롤러를 실행해주는 어댑터를 찾아
    어댑터 내부에서 핸들러를 실행한다 그러면 심플컨틀로러핸들러어댑터에서 컨트롤러를 실행하고
    뷰네임을 모델앤뷰 객체로 감싸서 디스패치서블릿에게 리턴해주고 뷰리졸버에서 뷰를 선택하고 랜더링해준다.
     */
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        log.info("DispatcherServlet Started");

        try {
            //핸들러매핑을 통해 핸들러를 찾는다
            Object handler = hm.findHandler(new HandlerKey(RequestMethod.valueOf(request.getMethod()), request.getRequestURI()));

            //핸들러를 수행할 수 있는 어댑터를 찾는다
            HandlerAdapter handlerAdapter = handlerAdapters.stream()
                    .filter(ha -> ha.supports(handler))
                    .findFirst()
                    .orElseThrow(() -> new ServletException("No adapter for handler [" + handler + "]"));

            //핸들러어댑터 내부에서 핸들러를 실행하면 모델앤뷰가 디스패처서블릿으로 리턴이 되고
            ModelAndView modelAndView = handlerAdapter.handle(request, response, handler);

            //뷰리졸버에서 뷰를 선택한다 그리고 뷰를 랜더링해준다.
            for (ViewResolver viewResolver : viewResolvers) {
                View view = viewResolver.resolveView(modelAndView.getViewName());
                view.render(modelAndView.getModel(), request, response);
            }
        } catch (Exception e) {
            log.error("exception occurred: [{}]", e.getMessage(), e);
            throw new ServletException(e);
        }
    }
}
