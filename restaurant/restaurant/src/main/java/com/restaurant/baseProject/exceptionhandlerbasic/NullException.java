package com.restaurant.baseProject.exceptionhandlerbasic;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class NullException extends RuntimeException{
    private String message;

    public NullException() {}

    public NullException(String message) {
        super(message);
        this.message = message;
    }

}
