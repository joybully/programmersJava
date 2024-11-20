package com.example.jdbc;

import com.example.jdbc.model.DeptDAO;
import com.example.jdbc.model.JdbcDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Jdbc02Application implements CommandLineRunner {

    @Autowired
    private JdbcDAO dao;

    @Autowired
    private DeptDAO dao2;

    public static void main(String[] args) {
        SpringApplication.run(Jdbc02Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        dao.selectTime();
        dao2.listDepts();
    }
}
