package com.example.aop.model;

import org.springframework.stereotype.Service;

@Service("target")
public class TargetService implements Target {
    // 핵심 사항
    @Override
    public String sayEcho(String name) {
        System.out.println("sayEcho(String name) called");
        return "Hi1 " + name;
    }

    @Override
    public String sayEcho1(String name) {
        System.out.println("sayEcho1(String name) called");
        return "Hi2 " + name;
    }

    @Override
    public String sayEcho2(String name) {
        System.out.println("sayEcho2(String name) called");
        return "Hi3 " + name;
    }
}
