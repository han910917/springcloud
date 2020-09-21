package com.example.zuul.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description
 * @Author hgm
 * @Time 2020/9/21 17:38
 */
@Configuration
public class BalancerConfig {

    @Bean
    public IRule myRule(){
        return new RoundRobinRule();
    }
}
