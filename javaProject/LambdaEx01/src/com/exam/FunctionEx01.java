package com.exam;

import java.util.function.Function;

public class FunctionEx01 {
    public static void main(String[] args) {
        // formatting하는 느낌
        Function<Integer, String> intToStr = t -> "해답은 " + String.valueOf(t);
        // System.out.println(intToStr.apply(5));
        String data = intToStr.apply(5);
        System.out.println(data);

    }
}
