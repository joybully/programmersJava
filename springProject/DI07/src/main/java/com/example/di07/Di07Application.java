package com.example.di07;

import com.example.di07.service.DatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class Di07Application implements CommandLineRunner {

    @Autowired
    private ApplicationContext ctx;

    public static void main(String[] args) {
        SpringApplication.run(Di07Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        DatabaseService databaseService = ctx.getBean("service", DatabaseService.class);
        List<String> list = databaseService.getList();
        for (String str:list){
            System.out.println(str);
        }
    }


}
