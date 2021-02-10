package com.example.demo.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class Controller {

    @RequestMapping("/names/{name}")
    public String demoTest(@PathVariable String name) {

        System.out.println("This is a Git Lesson 1");
        System.out.println("This is a Git Lesson 2");

        return "Hello Hello Hello " + name;

    }

}
