package com.example.training.boot.service;

import org.springframework.stereotype.Service;

@Service
public class AspectService {

    public AspectService() {
        printLogs();
    }

    public void printLogs(){
        System.out.println("Print method........................");
    }

}
