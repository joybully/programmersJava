package com.example.di07.config;

import com.example.di07.model.MySQLDatabaseDAO;
import com.example.di07.model.OracleDatabaseDAO;
import com.example.di07.service.DatabaseService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Bean("mysql")
    public MySQLDatabaseDAO mySQLDatabaseDAO(){
        return new MySQLDatabaseDAO();
    }

    @Bean("oracle")
    public OracleDatabaseDAO oracleDatabaseDAO(){
        return new OracleDatabaseDAO();
    }

    @Bean
    public DatabaseService service(){
        return new DatabaseService();
    }
}
