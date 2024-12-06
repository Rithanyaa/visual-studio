package com.demo;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.NoHandlerFoundException;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class HelloController {

    @GetMapping("/")
    public String greet(HttpServletRequest request) {
        return "Welcome to Spring Framework! Session ID: " + request.getSession().getId();
    }

    @ExceptionHandler(NoHandlerFoundException.class)
    public String handleNotFound() {
        return "Oops! Resource not found.";
    }
}
