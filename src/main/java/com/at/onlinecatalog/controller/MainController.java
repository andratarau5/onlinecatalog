package com.at.onlinecatalog.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class MainController {

    @GetMapping("/")
    public String index() {

        return "index";
    }
}
