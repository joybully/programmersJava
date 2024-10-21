package com.lang1;

import java.sql.SQLOutput;

public class MathEx02 {
    public static void main(String[] args) {
        // 난수 - 임으의 수 (로또 : Random)
        // 0<= 임의의 값 <1 인 double형 실수가 나온다
        System.out.println(Math.random());
        System.out.println(Math.random());

        // 0에서 9까지 정수를 뽑는다
        // 10을 곱하고 정수로 형변환
        // 0<= 임의의 값 <10 인 정수값
        System.out.println((int)(Math.random()*10));
        System.out.println((int)(Math.random()*10));

        // 1에서 45까지 정수
        System.out.println((int)(Math.random()*45+1));
        System.out.println((int)(Math.random()*45+1));
        System.out.println((int)(Math.random()*45+1));
    }
}
