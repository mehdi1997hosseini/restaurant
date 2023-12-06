package com.restaurant.baseProject.exceptionhandlerbasic;

public class BusinessException extends RuntimeException{
    private String message;

    public BusinessException() {}

    public BusinessException(String message) {
        super(message);
        this.message = message;
    }
}
