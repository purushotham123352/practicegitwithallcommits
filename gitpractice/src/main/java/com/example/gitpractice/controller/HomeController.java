package com.example.gitpractice.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/get")
    public String get(){
        System.out.println("Hello from intelij ...  ");
        return "Hello .....";
    }
}
