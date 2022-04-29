package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class DivideByZero extends IllegalArgumentException {
    public DivideByZero() {
        super("divide by zero");
    }
}
