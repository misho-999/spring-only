package com.example.training.boot.config;

import com.example.training.boot.aspect.MessageAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AspectConfig {
    @Bean
    MessageAspect messageAspect() {
        return new MessageAspect();
    }
}
