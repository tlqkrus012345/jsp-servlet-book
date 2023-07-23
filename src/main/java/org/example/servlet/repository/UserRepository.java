package org.example.servlet.repository;

import org.example.servlet.model.User;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class UserRepository {
    private static Map<String, User> users = new HashMap<>();

    public static void save(User user) {
        users.put(user.getUserId(), user);
    }
    public static Collection<User> findAll() {
        return users.values();
    }
}
