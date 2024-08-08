package com.springboot.coffee.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coffee")
public class CoffeeController {
    public String getCoffee(){
        return "Hello, Coffee World!";
    }
}
