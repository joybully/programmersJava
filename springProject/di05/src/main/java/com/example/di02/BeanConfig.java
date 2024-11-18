package com.example.di02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@Scope(value = "prototype")
public class BeanConfig {

    //@Scope(value = "prototype")
    @Bean
    public HelloBean1 helloBean1(){
        return new HelloBean1();
    }

    @Bean
    public HelloBean1 helloBean2(){
        return new HelloBean1();
    }
}
