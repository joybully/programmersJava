package com.example.di03;

import com.example.model.HelloBean;
import com.example.model2.WriteAction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.GenericXmlApplicationContext;

@SpringBootApplication
public class Di03Application {

    public static void main(String[] args) {
        SpringApplication.run(Di03Application.class, args);

        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:context.xml");

        HelloBean helloBean1 = (HelloBean) ctx.getBean("helloBean1");
        helloBean1.sayHello();

        HelloBean helloBean2 = (HelloBean) ctx.getBean("helloBean2");
        helloBean2.sayHello();

        HelloBean helloBean3 = (HelloBean) ctx.getBean("helloBean3");
        helloBean3.sayHello();

        WriteAction writeAction1 = (WriteAction) ctx.getBean("writeAction1");
        writeAction1.excute();

        WriteAction writeAction2 = (WriteAction) ctx.getBean("writeAction2");
        writeAction2.excute();

        ctx.close();
    }
}
