package com.example.awsprac.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {
    @GetMapping("/test")
    public String hello() {
        return "Hello World";
    }
}
