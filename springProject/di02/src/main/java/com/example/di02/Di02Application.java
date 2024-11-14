package com.example.di02;

import com.example.model.HelloBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

@SpringBootApplication
public class Di02Application {

    public static void main(String[] args) {
        SpringApplication.run(Di02Application.class, args);
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:context.xml");
        /*// prototype
        HelloBean helloBean11 = (HelloBean) ctx.getBean("helloBean11");
        HelloBean helloBean12 = (HelloBean) ctx.getBean("helloBean12");
        System.out.println("helloBean11: "+helloBean11);
        System.out.println("helloBean12: "+helloBean12);

        // new가 또 일어난다
        HelloBean helloBean13 = (HelloBean) ctx.getBean("helloBean11");
        System.out.println("helloBean13: "+helloBean13);
        helloBean11.sayHello("홍길동");
        helloBean12.sayHello("박문수");

        System.out.println();
        System.out.println();

        // singleton (static)
        HelloBean helloBean21 = (HelloBean) ctx.getBean("helloBean21");
        HelloBean helloBean22 = (HelloBean) ctx.getBean("helloBean22");
        System.out.println("helloBean21: "+helloBean21);
        System.out.println("helloBean22: " + helloBean22);

        // new가 또 안 일어난다
        HelloBean helloBean23 = (HelloBean) ctx.getBean("helloBean21");
        System.out.println("helloBean23: " + helloBean23);*/
        ctx.close();


    }

}
