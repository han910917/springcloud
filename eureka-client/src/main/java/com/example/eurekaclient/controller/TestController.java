package com.example.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author hgm
 * @Time 2020/9/16 9:46
 */
@RestController
public class TestController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/test")
    public String home(@RequestParam(value = "name", defaultValue = "han") String name){
        return "hi " + name + ", I am from port: " + port;
    }
}
