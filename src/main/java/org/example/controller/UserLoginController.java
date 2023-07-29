package org.example.controller;

import org.example.mapper.UserMapper;
import org.example.model.User;
import org.example.mvc.controller.Controller;
import org.example.utils.MyBatisUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserLoginController implements Controller {
    @Override
    public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String userEmail = request.getParameter("userEmail");
        String userPassword = request.getParameter("userPassword");

        UserMapper userMapper = MyBatisUtils.getSqlSession().getMapper(UserMapper.class);
        User user = userMapper.findUserByUserEmail(userEmail);

        if (user == null || !user.getUserPassword().equals(userPassword)) {
            request.setAttribute("loginError", "아이디 또는 비밀번호가 틀렸습니다.");
            return "/user/login";
        } else {
            request.getSession().setAttribute("user", user);
            return "redirect:/";
        }
    }
}
