package com.example.di05;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.HashMap;

@SpringBootApplication
public class Di04Application {
    public static void main(String[] args) {
        SpringApplication.run(Di04Application.class, args);

        /*HashMap<String, String> userMaps = new HashMap<>();
        userMaps.put("1", "제목1");
        userMaps.put("2", "제목2");

        BoardMapTO mapTO = new BoardMapTO();
        mapTO.setUserMaps(userMaps);*/

        /*GenericApplicationContext ctx = new GenericXmlApplicationContext("classpath:context3.xml");
        BoardMapTO mapTO = (BoardMapTO) ctx.getBean("mapTO");

        for(String value: mapTO.getUserMaps().values()){
            System.out.println(value);
        }*/

        GenericApplicationContext ctx = new GenericXmlApplicationContext("classpath:context3.xml");
        BoardMapTO boardMapTO = (BoardMapTO) ctx.getBean("boardMapTO");

        for(String value: boardMapTO.getUserMaps().values()){
            System.out.println(value);
        }

        for(BoardTO to: boardMapTO.getBoardMaps().values()){
            System.out.println(to);
        }

        ctx.close();
    }
}
