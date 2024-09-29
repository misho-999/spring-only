package com.example.training.boot.service;

import org.springframework.stereotype.Service;

@Service
public class AspectService {
    private int cacheSize;

    public void setCacheSize(int size) {
        cacheSize = size;
    }

}
