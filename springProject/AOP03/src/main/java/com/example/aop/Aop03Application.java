package com.example.aop;

import com.example.aop.model.Target;
import com.example.aop.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class Aop03Application implements CommandLineRunner {

    @Autowired
    private ApplicationContext ctx;

    public static void main(String[] args) {
        SpringApplication.run(Aop03Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Target target = ctx.getBean("target", Target.class);
        // target.sayHello();

        Todo todo = ctx.getBean("todo", Todo.class);
        List<String> list = todo.todoList();
        System.out.println(list);
    }
}
