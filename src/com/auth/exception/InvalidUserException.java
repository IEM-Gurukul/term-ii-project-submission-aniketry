package com.auth.exception;

public class InvalidUserException extends Exception {

    public InvalidUserException(String message) {
        super(message);
    }
    public InvalidUserException() 
    {
        super("Invalid user details");
    }
}