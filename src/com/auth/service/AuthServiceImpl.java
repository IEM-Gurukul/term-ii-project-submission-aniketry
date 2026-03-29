package com.auth.service;

import com.auth.model.User;
import com.auth.util.FileUtil;
import java.util.HashMap;

public class AuthServiceImpl implements AuthService {

    private HashMap<String, String> users = new HashMap<>();

    public AuthServiceImpl() {
        users = FileUtil.loadUsers();
    }

    @Override
    public void register(User user) throws Exception {
        if (users.containsKey(user.getUsername())) {
            throw new Exception("User already exists!");
        }

        users.put(user.getUsername(), user.getPassword());
        FileUtil.saveUsers(users);
    }

    @Override
    public boolean login(String username, String password) {
        return users.containsKey(username) &&
               users.get(username).equals(password);
    }
}