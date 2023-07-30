package org.example.model;

import org.example.mapper.UserMapper;
import org.example.utils.MyBatisUtils;

public class UserDAO {
    private final UserMapper userMapper;
    public UserDAO() {
        userMapper = MyBatisUtils.getSqlSession().getMapper(UserMapper.class);
    }
    public User findUserByUserEmail(String email) {
        return userMapper.findUserByUserEmail(email);
    }
    public void insertUser(User user) {
        try {
            userMapper.insertUser(user);
            MyBatisUtils.getSqlSession().commit();

        } catch (Exception e) {
            MyBatisUtils.getSqlSession().rollback();
            throw e;

        } finally {
            MyBatisUtils.getSqlSession().close();
        }
    }
}
