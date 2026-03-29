package com.auth.service;

import com.auth.model.User;

public interface AuthService {

    void register(User user) throws Exception;

    boolean login(String username, String password) throws Exception;
}