package com.example.aop.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@Configuration @Aspect
public class BasicAdvice {
    @Before("bean(*write*)")
    public void before(JoinPoint joinPoint){
        System.out.println("BeforeProcess : " + joinPoint.getSignature().getName());
    }

    @After("bean(*list*)")
    public void after(JoinPoint joinPoint){
        System.out.println("AfterProcess : " + joinPoint.getSignature().getName());
    }
}
