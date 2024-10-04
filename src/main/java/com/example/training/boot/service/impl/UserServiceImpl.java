package com.example.training.boot.service.impl;

import com.example.training.boot.model.User;
import com.example.training.boot.repository.JdbcRepository;
import com.example.training.boot.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    List<User> users;

    private final JdbcRepository jdbcRepository;

    public UserServiceImpl(JdbcRepository jdbcRepository) {
        this.jdbcRepository = jdbcRepository;
    }

    @Override
    public List<User> findAllUsers() {
        return jdbcRepository.getAllUser();
    }
}
