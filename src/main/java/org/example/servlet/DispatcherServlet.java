package org.example.servlet;

import org.example.servlet.controller.Controller;
import org.example.servlet.controller.RequestMethod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/")
public class DispatcherServlet extends HttpServlet {
    private static final Logger log = LoggerFactory.getLogger(DispatcherServlet.class);
    private RequestMappingHandlerMapping rmhm;
    // 서블릿이 초기화될 때 rmhm 또한 초기화 되도록 하는 메서드
    @Override
    public void init() throws ServletException {
        rmhm = new RequestMappingHandlerMapping();
        rmhm.init();
    }
    /*
    예를 들어 회원가입을 하는 순간(form.jsp) usrs라는 곳으로 post 요청이 들어온다.
    그러면 DispatcherServlet이 요청을 받고 findHandler를 통해 httpMethod가 post이면서 경로가 users인 핸들러가 있는지 handlerMapping이 찾는다.
    handlerMapping이 users에 해당하는 핸들러인 UserCreateController를 생성하고 리턴해준다.
    핸들러는 handlerRequest를 호출하여 유저를 저장하고 리다이렉트하는 응답을 보낸다.
    그러면 get요청으로 DispatcherServlet이 받아서 handlerMapping에게 다시 핸들러를 찾고 반환해준다.
     */
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        log.info("DispatcherServlet Started");
        //handlerMapping을 통해 handler를 찾고 handler에게 작업을 위임한다.
        try {
            Controller handler = rmhm.findHandler(new HandlerKey(RequestMethod.valueOf(request.getMethod())
                    ,request.getRequestURI()));
            String viewName = handler.handleRequest(request, response);

            /* 전달받은 viewName에 해당하는 JSP 페이지로 요청을 포워딩하여 뷰를 표시하는 역할을 수행한다.
            RequestDispatcher requestDispatcher = request.getRequestDispatcher(viewName);
            requestDispatcher.forward(request, response);
            */


        } catch (Exception e) {
            log.error("exception occurred: [{}]", e.getMessage(), e);
        }
    }
}
