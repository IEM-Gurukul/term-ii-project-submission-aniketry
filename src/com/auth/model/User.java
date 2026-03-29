package com.auth.model;

public class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

public void setUsername(String username) {
        if (username == null || username.isEmpty()) {
            System.out.println("Username cannot be empty");
            return;
        }
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() < 6) {
            System.out.println("Password must be at least 6 characters");
            return;
        }
        this.password = password;
    }

    public String toString() {
        return username;
    }
}