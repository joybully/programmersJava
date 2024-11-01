package com.exam;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class ConsumerEx01 {
    public static void main(String[] args) {
        // 매개변수 -> X
        Consumer<String> c1 = t -> System.out.println("매개변수 : " + t);
        c1.accept("홍길동");

        BiConsumer<String, Integer> c2 = (a,b)-> System.out.println(a+"/"+b);
        c2.accept("홍길동" , 10);

        // 특정 자료형
        // XXXConsumer
        IntConsumer c3 = a -> System.out.println(a);
        c3.accept(10);
    }
}
