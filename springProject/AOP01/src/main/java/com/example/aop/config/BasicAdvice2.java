package com.example.aop.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class BasicAdvice2 {
    @Pointcut("execution(public * says*(..))")
    // @Pointcut("execution(public * say*(..))")
    public void myTarget() {

    }

    @Around("myTarget()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        Object obj = null;
        System.out.println("BeforeProcess2");
        // 핵심 사항 실행
        obj = joinPoint.proceed();
        System.out.println("AfterProcess2");
        return obj;
    }
}
