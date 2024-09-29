package com.example.training.boot.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcRepository {

    private final JdbcTemplate jdbcTemplate;

    public JdbcRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public String getUsername(Integer userId) {
        String sql = "SELECT username FROM users where user_id = ? ";
        return jdbcTemplate.queryForObject(sql, String.class, userId);  //No try / catch needed (unchecked exceptions)
    }
}
