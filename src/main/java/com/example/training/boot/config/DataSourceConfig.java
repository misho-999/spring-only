package com.example.training.boot.config;


import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;

@Configuration
@PropertySource("application.properties")
public class DataSourceConfig {

    @Bean(name = "dataSource")
    public DataSource dataSourceTest(Environment env) {    //Inject Environment Bean like any other Spring Bean
        BasicDataSource ds = new BasicDataSource();
        ds.setDriverClassName(env.getProperty("db.driver"));
        ds.setUrl(env.getProperty("db.url"));
        ds.setUsername(env.getProperty("db.user"));
        ds.setPassword(env.getProperty("db.password"));
        return ds;
    }
}