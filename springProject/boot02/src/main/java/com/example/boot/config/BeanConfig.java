package com.example.boot.config;

import com.example.boot.model.User;
import com.example.boot.model.User2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource(value = "classpath:data.properties")
public class BeanConfig {

    @Autowired
    private Environment env;

    @Bean
    public User2 user2() {
        return new User2(env.getProperty("user.fullname"),Integer.parseInt(env.getProperty("user.age")));
    }
}
