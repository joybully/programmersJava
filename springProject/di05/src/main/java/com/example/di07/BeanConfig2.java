package com.example.di07;

import org.springframework.context.annotation.Bean;

public class BeanConfig2 {
    @Bean
    public HelloBean2 helloBean2(){
        return new HelloBean2();
    }
    @Bean
    public HelloBean2 helloBean(){
        return new HelloBean2();
    }
}
