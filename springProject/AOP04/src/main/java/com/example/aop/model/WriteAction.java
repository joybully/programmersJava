package com.example.aop.model;

import org.springframework.stereotype.Service;

@Service("write")
public class WriteAction implements Action {
    @Override
    public void execute() {
        System.out.println("WriteAction execute() called");
    }
}
