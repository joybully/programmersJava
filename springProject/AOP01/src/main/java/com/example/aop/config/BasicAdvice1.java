package com.example.aop.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class BasicAdvice1 {
    // @Pointcut("execution(public * says*(..))")
    @Pointcut("execution(public * say*(..))")
    public void myTarget() {

    }

    /*
    @Around("myTarget()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        Object obj = null;
        System.out.println("BeforeProcess1");
        // 핵심 사항 실행
        obj = joinPoint.proceed();
        System.out.println("AfterProcess1");
        return obj;
    }
    */

    @Before("myTarget()")
    public void before(JoinPoint joinPoint){
        System.out.println("BeforeProcess : " + joinPoint.getSignature().getName());
    }

    @After("myTarget()")
    public void after(JoinPoint joinPoint){
        System.out.println("AfterProcess : " + joinPoint.getSignature().getName());
    }
}
