package com.example.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.Annotation;

@SpringBootApplication
public class Di05Application {

    public static void main(String[] args) {
        SpringApplication.run(Di05Application.class, args);

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);

        // helloBean1 - BeanConfig 파일의 메서드명
        // POJO(BeanConfig)
        HelloBean1 helloBean1 = (HelloBean1)ctx.getBean("helloBean1");
        helloBean1.sayHello("홍길동");
        
        HelloBean2 helloBean2 =  (HelloBean2)ctx.getBean("helloBean2");
        helloBean2.sayHello("박문수");

        // 다형성 & POJO을 이용함
        Hello hello = (Hello) ctx.getBean("hello1");
        hello.sayHello("홍길동");

        hello = (Hello)ctx.getBean("hello2");
        hello.sayHello("박문수");

        HelloBean1 helloBean3 = (HelloBean1)ctx.getBean("helloBean");
        helloBean3.sayHello("박문수");

        // 이렇게 쓸 수도 있음
        HelloBean1 helloBean41 = ctx.getBean("helloBean1", HelloBean1.class);
        HelloBean2 helloBean42 = ctx.getBean("helloBean2", HelloBean2.class);
        helloBean41.sayHello("홍길동");
        helloBean42.sayHello("박문수");

        ctx.close();
    }

}
