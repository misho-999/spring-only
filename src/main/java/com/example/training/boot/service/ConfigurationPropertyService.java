package com.example.training.boot.service;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

@Service
@ConfigurationProperties(prefix="db")
public class ConfigurationPropertyService {
    private final String url;
    /* Does not work correctly!!! */
    public ConfigurationPropertyService(String url) {
        this.url = url;
        System.out.println();
    }
}
