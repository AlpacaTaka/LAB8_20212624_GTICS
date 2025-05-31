package com.example.neo_lab8_gtics_20212624.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/test")
    public String test() {
        // This method is just for testing purposes
        return "test"; // This should correspond to a view named 'test.html' or 'test.jsp'
    }
}
