package com.example.eureka.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


/**
 * @Description
 * @Author hgm
 * @Time 2020/9/16 11:59
 */
@RestController
public class OrderConsumerService {

        @Autowired
        private RestTemplate restTemplate;

        @RequestMapping("/getOrder")
        public String getOrder(){
            String url = "http://ENURKA-CLIENT/test?name=han";
            return restTemplate.getForObject(url, String.class);
        }
}
