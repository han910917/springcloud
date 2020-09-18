package com.example.feign.controller;

import com.example.feign.service.SchedualService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author hgm
 * @Time 2020/9/17 18:13
 */
@RestController
public class FeignController {

    @Autowired
    private SchedualService schedualService;

    @RequestMapping("/feignTest")
    public String feignTest(){
        return schedualService.home("han");
    }
}
