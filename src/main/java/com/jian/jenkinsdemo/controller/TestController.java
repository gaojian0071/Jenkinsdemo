package com.jian.jenkinsdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/")
public class TestController {

    @GetMapping("/test")
    public String test(){

        return "hello world！"+ LocalDateTime.now();
    }
}
