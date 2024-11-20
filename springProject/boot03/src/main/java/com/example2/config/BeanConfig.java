package com.example2.config;

import com.example3.model.DatabaseService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    // DI
    @Bean
    public DatabaseService service(){
        return new DatabaseService();
    }
}
