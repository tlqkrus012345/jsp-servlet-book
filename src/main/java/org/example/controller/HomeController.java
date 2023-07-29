package org.example.controller;

import org.example.mapper.UserMapper;
import org.example.model.User;
import org.example.mvc.controller.Controller;
import org.example.utils.MyBatisUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// 홈 컨트롤러가 호출되면 home.jsp 화면을 제공
public class HomeController implements Controller {
    @Override
    public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        User user = (User) request.getSession().getAttribute("user");
        if (user != null) {
            request.setAttribute("userNickName", user.getUserNickName());
        }
        return "home";
    }
}
