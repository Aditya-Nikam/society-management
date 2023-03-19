package com.societymanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controller {
    @GetMapping("/aditya")
    public String layoutpg() {
        return "layout.html";
    }
}
