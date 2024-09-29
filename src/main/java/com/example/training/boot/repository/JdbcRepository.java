package com.example.training.boot.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

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

    public int insertUser(Integer userId, String email, String username) {
        String sql = "INSERT INTO `my_rest_demo_db`.`users` (`user_id`, `email`, `username`) VALUES (?,?,?);";
        return jdbcTemplate.update(sql, userId, email, username);
    }

    public Map<String,Object> getserAsMap(Integer userId) {
        String sql = "SELECT * FROM users where user_id = ?";
        return jdbcTemplate.queryForMap(sql, userId);
    }
}
