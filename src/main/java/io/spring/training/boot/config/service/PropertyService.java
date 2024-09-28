package io.spring.training.boot.config.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class PropertyService {

    private final String user;

    private final String password;

    /* !!!The two ways ${db.user} and #{environment['db.password'] are equivalent!!! */
    public PropertyService(@Value("${db.user}") String user, @Value("#{environment['db.password']}") String password) {
        this.user = user;
        this.password = password;
        System.out.println();
    }
}
