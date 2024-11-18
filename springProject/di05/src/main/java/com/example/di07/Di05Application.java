package com.example.di07;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Di05Application {

    public static void main(String[] args) {
        SpringApplication.run(Di05Application.class, args);

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig2.class, BeanConfig1.class);

        HelloBean1 helloBean1 = ctx.getBean("helloBean1", HelloBean1.class);
        HelloBean2 helloBean2 = ctx.getBean("helloBean2", HelloBean2.class);
        // "helloBean"이라는 이름의 빈이 HelloBean1과 HelloBean2 모두에 적혀있다
        // 하지만 BeanConfig1이 나중에 쓰여서 BeanConfig2의 HelloBean이 BeanConfig1에 의해서 Overwritting이 되었다
        // 따라서 HelloBean1의 helloBean이 호출되면 에러가 없지만 helloBean2의 HelloBean이 호출되면 에러가 발생한다
        HelloBean1 helloBean3 = ctx.getBean("helloBean", HelloBean1.class);

        AnnotationConfigApplicationContext ctx1 = new AnnotationConfigApplicationContext(BeanConfig.class);
        HelloBean1 helloBean4 = ctx1.getBean("helloBean", HelloBean1.class);
        //HelloBean2 helloBean5 = ctx1.getBean("helloBean", HelloBean2.class);

        ctx.close();
        ctx1.close();
    }
}