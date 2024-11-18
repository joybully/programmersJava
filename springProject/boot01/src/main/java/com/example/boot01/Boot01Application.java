package com.example.boot01;

import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class Boot01Application implements CommandLineRunner {

    public static void main(String[] args) {
        // Spring Boot 시작

        // 1. 기본적인 Spring Boot 시작법
        SpringApplication.run(Boot01Application.class, args);

        // 2. SpringApplication의 리턴값을 받아서 시작시 환경설정
        // SpringApplication app = new SpringApplication(Boot01Application.class);
        // 시작시 환경 설정
        // app.setBannerMode(Banner.Mode.OFF);
        // app.run(args);

        // 3. SpringApplicationBuilder를 이용
        /*
        new SpringApplicationBuilder()
                .sources(Boot01Application.class)
                .bannerMode(Banner.Mode.OFF)
                .run(args);
        */

        // 프로그램 시작 초기값
        // 다른 클래스에서도 활용 가능
        System.out.println("Hello Spring 1");
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello Spring 2");
    }
}
