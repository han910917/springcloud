package com.example.feign.service.impl;

import com.example.feign.service.SchedualService;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author hgm
 * @Time 2020/9/17 18:35
 */
@Component
public class SchedualServiceHiHystric implements SchedualService {

    @Override
    public String home(String name) {
        return "sorry " + name;
    }
}
