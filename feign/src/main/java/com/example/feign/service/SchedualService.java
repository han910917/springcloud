package com.example.feign.service;

import com.example.feign.service.impl.SchedualServiceHiHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description
 * @Author hgm
 * @Time 2020/9/17 18:10
 */
@FeignClient(value = "ENURKA-CLIENT",  fallback= SchedualServiceHiHystric.class)
public interface SchedualService {

    @RequestMapping(value = "/test")
    String home(@RequestParam(value = "name", defaultValue = "han") String name);
}
