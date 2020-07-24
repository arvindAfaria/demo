package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome";
    }

    @GetMapping("/")
    public String home() {
        return "HomePage";
    }
}
