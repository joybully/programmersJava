package com.example.aop.config;

import org.aspectj.lang.annotation.Pointcut;

public class CustomPointcutConfig {
    @Pointcut("execution( public * say*(..))")
    public void myTarget() {

    }
    @Pointcut("bean(*todo*)")
    public void myTodo(){}
}
