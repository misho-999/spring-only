package com.example.training.boot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class PrototypeBeanConfig {

    @Bean
    @Scope("prototype")
    String testPrototype() {
        return new String("testPrototype");
    }
}
