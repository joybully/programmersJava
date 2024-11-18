package com.example.lifecycle;

import com.example.di05.BoardMapTO;
import com.example.di05.BoardTO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

@SpringBootApplication
public class Di04Application {
    public static void main(String[] args) {
        SpringApplication.run(Di04Application.class, args);

        GenericApplicationContext ctx = new GenericXmlApplicationContext("classpath:lifecycle.xml");

        Action action = (Action) ctx.getBean("writeAction");
        action.execute();

        ctx.close();
    }
}
