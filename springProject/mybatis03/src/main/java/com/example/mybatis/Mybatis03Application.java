package com.example.mybatis;

import com.example.mybatis.service.DeptMyBatisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Mybatis03Application implements CommandLineRunner {

    @Autowired
    private DeptMyBatisService deptMyBatisService;

    public static void main(String[] args) {
        SpringApplication.run(Mybatis03Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        deptMyBatisService.select();
        deptMyBatisService.findAll();
        // deptMyBatisService.insert();
        // deptMyBatisService.update();
        deptMyBatisService.delete();
    }
}
