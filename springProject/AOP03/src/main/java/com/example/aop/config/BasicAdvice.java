package com.example.aop.config;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

@Aspect @Configuration
public class BasicAdvice {
    /*@Around("com.example.aop.config.CustomPointcutConfig.myTarget()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable{
        Object obj = null;
        System.out.println("BeforeProcess Part");
        obj = pjp.proceed();
        System.out.println("AfterProcess Part");
        return obj;
    }*/

    @Around("com.example.aop.config.CustomPointcutConfig.myTodo()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable{
        Object obj = null;
        System.out.println("BeforeProcess Part");
        obj = pjp.proceed();
        System.out.println("AfterProcess Part");
        return obj;
    }
}
