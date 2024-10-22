package com.lang1;

public class WrapperEx02 {
    public static void main(String[] args) {
        // Wrapper class 생성
        // 요즘에는 이렇게 만듬 -> 이렇게 쓰셈
        Integer i1 = Integer.valueOf(10);
        // 예전에는 이렇게 만듬 -> 쓰지마셈
        // Integer i2 = new Integer(10);
        // Auto Boxing
        Integer i2 = 10;
        // i1(참조자료형)이 i3(기본자료형)이 되었다
        // UnBoxing
        int i3 = i1;
        int sum = i1+i2;
        System.out.println(sum);
    }
}
