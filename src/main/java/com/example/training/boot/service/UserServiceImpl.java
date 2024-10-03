package com.example.training.boot.service;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public String getRegisteredUsers() {
        return "Pencho, Ganco, Ivancho";
    }
}
