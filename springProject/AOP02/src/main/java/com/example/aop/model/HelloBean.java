package com.example.aop.model;

import org.springframework.stereotype.Service;

@Service("target")
public class HelloBean implements Hello {
    @Override
    public void sayHello() {
        System.out.println("Method start");
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += i;
        }
        System.out.println("Result : " + sum);
        System.out.println("Method end");
    }
}
