package com.example.di01.model;

public class HelloBean1 {
    public HelloBean1(){
        System.out.println("HelloBean1 생성자 호출");
    }
    public void sayHello(String name){
        System.out.println(name + "님 안녕하세요");
    }
}
