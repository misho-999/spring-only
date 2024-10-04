package com.example.training.boot.service;

import com.example.training.boot.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    List<User> users;

    public UserServiceImpl() {
        users = initUsers();
    }

    @Override
    public List<User> findAllUsers() {
        return users;
    }

    private List<User> initUsers() {
        List<User> users = new ArrayList<>();
        User user1 = new User(1, "Ivan");
        User user2 = new User(2, "Dragan");
        User user3 = new User(3, "Petkan");
        User user4 = new User(4, "Gosho");
        User user5 = new User(5, "Pesho");
        User user6 = new User(6, "Misho");
        User user7 = new User(7, "Maria");

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        users.add(user6);
        users.add(user7);

        return users;
    }
}
