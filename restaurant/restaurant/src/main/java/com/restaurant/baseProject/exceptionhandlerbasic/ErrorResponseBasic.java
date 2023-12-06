package com.restaurant.baseProject.exceptionhandlerbasic;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ErrorResponseBasic {
    private Date time;
    private int statusCode;
    private String message;

    public ErrorResponseBasic(String message) {
        super();
        this.message = message;
    }

}
