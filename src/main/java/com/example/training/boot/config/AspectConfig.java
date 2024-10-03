package com.example.training.boot.config;

import com.example.training.boot.aspect.MessageAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AspectConfig {
    @Bean
    MessageAspect messageAspect() {
        return new MessageAspect();
    }
}
