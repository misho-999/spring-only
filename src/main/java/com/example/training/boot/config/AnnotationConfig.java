package com.example.training.boot.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.training.boot.config") //Find component annotated classes with designed (sub) packages
public class AnnotationConfig {
    // No bean definition needed anymore
}

