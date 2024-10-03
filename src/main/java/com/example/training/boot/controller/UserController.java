package com.example.training.boot.controller;

import com.example.training.boot.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users/all")
    public String getAllUsers() {
        return "Ivan, Petkan, Dragan, Pesho, Gosho" + userService.getRegisteredUsers();
    }
}
