package com.example.restaurant_manager.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MenuController {

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}