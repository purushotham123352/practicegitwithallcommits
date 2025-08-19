package com.example.gitpractice.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/hi")
    public String get(){
        return "Hello .....";
    }
}
