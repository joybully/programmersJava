package com.example.mybatis;

import com.example.mybatis.service.EmpMyBatisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Mybatis04Application implements CommandLineRunner {
    @Autowired
    EmpMyBatisService empMyBatisService;

    public static void main(String[] args) {
        SpringApplication.run(Mybatis04Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        empMyBatisService.findAll();
    }
}
