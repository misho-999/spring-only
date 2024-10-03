package com.example.training.boot.config;

import com.example.training.boot.aspect.LoginAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AspectConfig {
//    @Bean
//    LoginAspect messageAspect() {
//        return new LoginAspect();
//    }
}
