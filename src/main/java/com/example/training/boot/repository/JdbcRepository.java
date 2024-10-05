package com.example.training.boot.repository;

import com.example.training.boot.model.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class JdbcRepository {
    public static final RowMapper<User> USER_ROW_MAPPER = (resultSet, rowNum) -> {
        User user = new User();
        user.setId(resultSet.getInt("user_id"));
        user.setEmail(resultSet.getString("email"));
        user.setUsername(resultSet.getString("username"));
        return user;
    };

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

    public Map<String, Object> getUserAsMap(Integer userId) {
        String sql = "SELECT * FROM users where user_id = ?";
        return jdbcTemplate.queryForMap(sql, userId);
    }

    /* Using RowMapper */
    public List<User> getAllUser() {
        String sql = "SELECT * FROM users";//Returns a List of Domain objects
        return jdbcTemplate.query(sql, USER_ROW_MAPPER);  //Define RowMapper using Lambda
    }

    public User findById(Integer id) {
        String sql = "SELECT * FROM users where user_id = ? ";
            return jdbcTemplate.queryForObject(sql,USER_ROW_MAPPER, id);
    }
}
