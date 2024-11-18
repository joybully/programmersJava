package com.example.aop.model;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service( "todo" )
public class TodoAction implements Todo {
    @Override
    public List<String> todoList() {
        System.out.println("todoList() called");
        return Arrays.asList("Spring Framework", "Spring Boot");
    }
}
