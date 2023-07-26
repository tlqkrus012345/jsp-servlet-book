package org.example.controller;

import org.example.mapper.UserMapper;
import org.example.model.User;
import org.example.mvc.controller.Controller;
import org.example.utils.MyBatisUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class UserListController implements Controller {
    @Override
    public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        UserMapper userMapper = MyBatisUtils.getSqlSession().getMapper(UserMapper.class);
        List<User> users = userMapper.selectAllUser();

        request.setAttribute("users", users);
        return "/user/list";
    }
}
