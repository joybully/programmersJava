package com.example.di03;

import org.springframework.context.annotation.Bean;

public class BeanConfig {
    @Bean
    public HelloBean helloBean1(){
        return new HelloBean();
    }

    @Bean
    public HelloBean helloBean2(){
        return new HelloBean("홍길동");
    }
}
