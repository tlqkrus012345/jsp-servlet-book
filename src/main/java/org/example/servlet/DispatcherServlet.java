package org.example.servlet;

import org.example.servlet.controller.Controller;
import org.example.servlet.controller.RequestMethod;
import org.example.servlet.view.JspViewResolver;
import org.example.servlet.view.ModelAndView;
import org.example.servlet.view.View;
import org.example.servlet.view.ViewResolver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

@WebServlet("/")
public class DispatcherServlet extends HttpServlet {
    private static final Logger log = LoggerFactory.getLogger(DispatcherServlet.class);
    private HandlerMapping hm;
    // 서블릿이 초기화될 때 rmhm 또한 초기화 되도록 하는 메서드
    private List<ViewResolver> viewResolvers;
    private List<HandlerAdapter> handlerAdapters;
    @Override
    public void init() throws ServletException {
        RequestMappingHandlerMapping rmhm = new RequestMappingHandlerMapping();
        rmhm.init();
        hm = rmhm;

        viewResolvers = Collections.singletonList(new JspViewResolver());
        handlerAdapters = List.of(new SimpleControllerHandlerAdapter());
    }
    /*
    예를 들어 회원가입을 하는 순간(form.jsp) usrs라는 곳으로 post 요청이 들어온다.
    그러면 DispatcherServlet이 요청을 받고 findHandler를 통해 httpMethod가 post이면서 경로가 users인 핸들러가 있는지 handlerMapping이 찾는다.
    handlerMapping이 users에 해당하는 핸들러인 UserCreateController를 생성하고 리턴해준다.
    핸들러는 handlerRequest를 호출하여 유저를 저장하고 리다이렉트하는 응답을 보낸다.
    그러면 get요청으로 DispatcherServlet이 받아서 handlerMapping에게 다시 핸들러를 찾고 반환해준다.
     */
    /*
    요청이 들어오면 디스패치서블릿이 핸들러매핑을 통해 컨트롤러를 검색하고 찾으면 핸들러어댑터를 통해 컨트롤러를 실행해주는 어댑터를 찾아
    어댑터 내부에서 핸들러를 실행한다 그러면 모델앤뷰 클래스에서 해당 컨트롤러를 실행하고 뷰네임을 받아서 리턴해준다.
    그러면 모델앤뷰 값을 디스패치서블릿에게 리턴해주고 뷰리졸버에서 뷰를 선택하고 랜더링해준다.
     */
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        log.info("DispatcherServlet Started");
        //handlerMapping을 통해 handler를 찾고 handler에게 작업을 위임한다.
        try {
            Object handler = hm.findHandler(new HandlerKey(RequestMethod.valueOf(request.getMethod())
                    ,request.getRequestURI()));

            HandlerAdapter handlerAdapter = handlerAdapters.stream()
                    .filter(ha -> ha.supports(handler))
                    .findFirst()
                    .orElseThrow(() -> new ServletException("No adapter for handler [" + handler + "]"));

            ModelAndView modelAndView = handlerAdapter.handle(request, response, handler);

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
