package com.example.training.boot.service.impl;

import com.example.training.boot.service.CarService;
import org.springframework.stereotype.Service;

@Service
public class Audi implements CarService {
    @Override
    public void printName() {
        System.out.println("BMW");
    }
}
