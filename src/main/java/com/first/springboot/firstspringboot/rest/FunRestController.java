package com.first.springboot.firstspringboot.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @Value("${user.other}")
    private String userName;

    @Value("${user.age}")
    private String userAge;

    // expose "/" that rerturn "Hello World"
    @GetMapping("/")
    public String sayHello() {
        return "Hello World!!! Auto-reload";
    }

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run, run and run";
    }

    @GetMapping("/props")
    public String getProps(){
        return this.userName + this.userAge;
    }
}
