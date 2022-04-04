package com.example.springboottimeout.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    @GetMapping("/test")
    public String getResult(){
        return "test";
    }
}
