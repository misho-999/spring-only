package com.example.training.boot.service;


import com.example.training.boot.model.User;

import java.util.List;

public interface UserService {
    List<User> findAllUsers();
}
