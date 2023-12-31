package org.example.controller;

import org.example.mapper.UserMapper;
import org.example.model.User;
import org.example.model.UserDAO;
import org.example.mvc.controller.Controller;
import org.example.utils.MyBatisUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class UserCreateController implements Controller {
    private final Logger log = LoggerFactory.getLogger(UserCreateController.class);
    @Override
    public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

        String userEmail = request.getParameter("userEmail");
        String userPassword = request.getParameter("userPassword");
        String userNickName = request.getParameter("userNickName");
        User user = new User(userEmail, userPassword, userNickName);

        UserDAO userDAO = new UserDAO();
        userDAO.insertUser(user);

        request.getSession().setAttribute("user", user);

        // 클라이언트에게 /users 로 get 요청으로 다시 요청을 보내라고 한다
        return "redirect:/";
    }
}
