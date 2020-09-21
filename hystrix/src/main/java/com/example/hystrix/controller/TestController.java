package com.example.hystrix.controller;

import com.netflix.hystrix.HystrixCommandProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Description
 * @Author hgm
 * @Time 2020/9/18 16:37
 */
@RestController
public class TestController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/tests")
    @HystrixCommand(fallbackMethod = "fallbackMethodTest", ignoreExceptions={NullPointerException.class},
            commandProperties = {
                    @HystrixProperty(value = "1000", name="execution.isolation.thread.timeoutInMilliseconds")
            }
    )
    public Object tests(Integer index){
        if(index == 0){
            throw new IndexOutOfBoundsException();
        }else if(index == 1){
            throw new NullPointerException();
        }
        String url = "http://ENURKA-CLIENT/test?name=han";
        String object = restTemplate.getForObject(url, String.class);
        return object;
    }

    public Object fallbackMethodTest(Integer index){
        return "hystrix is success !";
    }
}
