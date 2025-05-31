package edu.pucp.lab8_20212624_gtics.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/test")
    public String test() {

        return "test";
    }
    @GetMapping("/")
    public String index() {
        return "dashboard";
    }
}
