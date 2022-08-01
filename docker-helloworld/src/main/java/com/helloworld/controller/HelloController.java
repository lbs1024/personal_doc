package com.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lbs
 */
@RestController
public class HelloController {

    @GetMapping(value = "/index")
    public String helloWorld() {
        return "This is my first docker application!";
    }
}
