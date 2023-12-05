package com.first.springboot.firstspringboot.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    // expose "/" that rerturn "Hello World"
    @GetMapping("/")
    public String sayHello() {
        return "Hello World!!! Auto-reload";
    }

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run, run and run";
    }
}
