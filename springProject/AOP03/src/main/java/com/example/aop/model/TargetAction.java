package com.example.aop.model;

import org.springframework.stereotype.Service;

@Service("target")
public class TargetAction implements Target {
    @Override
    public void sayHello() {
        System.out.println("sayHello() called");
    }
}
