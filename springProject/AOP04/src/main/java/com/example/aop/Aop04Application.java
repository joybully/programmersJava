package com.example.aop;

import com.example.aop.model.ListAction;
import com.example.aop.model.WriteAction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Aop04Application implements CommandLineRunner {

    @Autowired
    private ApplicationContext ctx;

    public static void main(String[] args) {
        SpringApplication.run(Aop04Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        WriteAction action1 = ctx.getBean("write", WriteAction.class);
        action1.execute();

        ListAction action2 = ctx.getBean("list", ListAction.class);
        action2.execute();
    }
}
