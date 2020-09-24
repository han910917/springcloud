package com.example.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author hgm
 * @Time 2020/9/22 19:24
 */
@RestController
@RefreshScope
public class testController {

    @Value("${user}")
    public String user;

    @RequestMapping("/configClient")
    public Object configClient(){
        return "hi " + user;
    }
}
