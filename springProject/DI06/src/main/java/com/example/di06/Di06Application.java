package com.example.di06;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Di06Application implements CommandLineRunner {

    private ApplicationContext ctx;

    public static void main(String[] args) {
        SpringApplication.run(Di06Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("ctx : " + ctx);

        WriteAction writeAction = ctx.getBean("writeAction", WriteAction.class);
        System.out.println("writeAction : " + writeAction);

        writeAction.getDAO();
    }


}
