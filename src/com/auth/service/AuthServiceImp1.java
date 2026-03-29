package com.auth.service;

import com.auth.exception.InvalidUserException;
import com.auth.model.User;
import com.auth.util.FileUtil;
import java.util.HashMap;

public class AuthServiceImp1 implements AuthService {

    private HashMap<String, String> users = new HashMap<>();

    public AuthServiceImp1() {
        users = FileUtil.loadUsers();
    }
    public boolean userExists(String username) 
    {
        return users.containsKey(username);
    }
      @Override
    public void register(User user) throws Exception {
        if (user.getUsername() == null || user.getUsername().isEmpty()) 
        {
        throw new InvalidUserException("Username cannot be empty");
        }

        if (users.containsKey(user.getUsername())) 
        {
        throw new InvalidUserException("User already exists");
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