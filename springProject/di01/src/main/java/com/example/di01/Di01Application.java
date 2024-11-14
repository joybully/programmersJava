package com.example.di01;

import com.example.di01.model2.Hello;
import com.example.di01.model2.HelloBean1;
import com.example.di01.model2.HelloBean2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

@SpringBootApplication
public class Di01Application {

    public static void main(String[] args) {
        SpringApplication.run(Di01Application.class, args);
        // System.out.println("Hello Spring1");
        /*
        //객체의 생성, 사용, 소명 - 개발자가 직접 코딩
        HelloBean1 helloBean1 = new HelloBean1();
        HelloBean2 helloBean2 = new HelloBean2();

        helloBean1.sayHello("박문수");
        helloBean2.sayHello("홍길동");

        helloBean1 = null;
        helloBean2 = null;
        */

        GenericApplicationContext ctx = new GenericXmlApplicationContext("classpath:context.xml");

/*
        HelloBean1 helloBean1 = (HelloBean1) ctx.getBean("helloBean1");
        helloBean1.sayHello("홍길동");

        HelloBean2 helloBean2 = (HelloBean2) ctx.getBean("helloBean2");
        helloBean2.sayHello("박문수");
*/

        // 인터페이스의 다형성을 이용
        // 부모의 인터페이스로 바꿔서 호출해버림
        Hello hello = (Hello)ctx.getBean("helloBean1");
        hello.sayHello("홍길동");
        hello = (Hello)ctx.getBean("helloBean2");
        hello.sayHello("박문수");

        ctx.close();
    }
}
