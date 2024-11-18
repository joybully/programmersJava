package com.example.aop.model;

import org.springframework.stereotype.Service;

@Service("list")
public class ListAction implements Action {
    @Override
    public void execute() {
        System.out.println("ListAction execute() called");
    }
}
