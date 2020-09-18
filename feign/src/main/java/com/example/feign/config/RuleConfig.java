package com.example.feign.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description
 * @Author hgm
 * @Time 2020/9/17 18:27
 */
@Configuration
public class RuleConfig {

    @Bean
    public IRule myRule(){
        return new RoundRobinRule();
    }
}
