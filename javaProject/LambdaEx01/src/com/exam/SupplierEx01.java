package com.exam;

import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierEx01 {
    public static void main(String[] args) {
        Supplier<Object> s1 = () -> new Object();
        System.out.println(s1.get());

        Supplier<String> s2 = () -> "Hello 함수형 인터페이스";
        System.out.println(s2.get());

        // 정수값 난수를 리턴
        IntSupplier s3 = ()->{
            int num = (int)(Math.random() * 6) +1;
            return num;
        };
        System.out.println(s3.getAsInt());
    }
}
