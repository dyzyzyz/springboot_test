package com.example.demov.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther yzDi
 * @date 2019/12/14 -15:41
 */
@RestController
@EnableAutoConfiguration
public class Hellocontroller {
    @RequestMapping("Hello")
    public String Hello(){
        return "这是我的第一个springboot项目";
    }
}
