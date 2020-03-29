package com.xinhe.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @RequestMapping("/hellomaven-0.0.1-SNAPSHOT")
    public String hello(){
        return "hello maven!";
    }
}
