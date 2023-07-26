package org.example.mapper;

import org.example.model.User;

import java.util.List;

public interface UserMapper {
    void insertUser(User user);
    List<User> selectAllUser();
}