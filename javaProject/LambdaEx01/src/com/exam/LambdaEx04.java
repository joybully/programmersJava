package com.exam;

public class LambdaEx04 {
    public static void main(String[] args) {
        // 중괄호와 return도 생략
        LambdaInter4 f = (x,y)-> x+y;
        System.out.println(f.method(10,20));
    }
}
