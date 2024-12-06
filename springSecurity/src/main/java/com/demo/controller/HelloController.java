package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class HelloController {

    @GetMapping("/index.html")
    public String greet(HttpServletRequest request) {
        return "Welcome to Spring Framework! Session ID: " + request.getSession().getId();
    }

}
