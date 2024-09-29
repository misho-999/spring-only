package com.example.training.boot.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy    //Configures Spring to recognize and use @Aspect
@ComponentScan(basePackages="com.example.training.boot")
public class AspectConfig {


}
