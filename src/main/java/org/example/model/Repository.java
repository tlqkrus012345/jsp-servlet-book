package org.example.model;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Repository {
    private static Map<String, User> users = new HashMap<>();
    public static void save(User user) {
        users.put(user.getUserEmail(), user);
    }

    public static Collection<User> findAll() {
        return users.values();
    }
}
