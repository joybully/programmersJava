package com.example.di02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Di05Application {

    public static void main(String[] args) {
        SpringApplication.run(Di05Application.class, args);

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);

        HelloBean1 helloBean1 = ctx.getBean("helloBean1", HelloBean1.class);
        HelloBean1 helloBean2 = ctx.getBean("helloBean2", HelloBean1.class);

        System.out.println(helloBean1);
        System.out.println(helloBean2);

        // 다른 이름으로 인스턴스를 만들고 같은 이름의 싱글톤 Bean을 호출하면 같은 인스턴스의 Bean이 나온다
        // 하지만 다른 이름의 인스턴스가 같은 이름의 prototype Bean을 호출하면 다른 인스턴스의 Bean이 나온다
        HelloBean1 helloBean3 = ctx.getBean("helloBean1", HelloBean1.class);
        System.out.println(helloBean3);

        HelloBean1 helloBean4 = ctx.getBean("helloBean2", HelloBean1.class);
        System.out.println(helloBean4);
        ctx.close();
    }

}
