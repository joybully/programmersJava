package com.lang1;

public class WrapperEx01 {
    public static void main(String[] args) {
        // 자료형의 크기
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        // 형변환
        Integer i1 = Integer.valueOf(10);
        Integer i2 = Integer.valueOf("10");
        // Auto Boxing
        Integer i3 = 345;
        // 형변환
        byte b = i1.byteValue();
        short s= i1.shortValue();
        System.out.println(b);
        System.out.println(s);
        String str  = i1.toString();
        System.out.println(str);
        // 문자열에서 형변환
        int i4 = Integer.parseInt("10");
        System.out.println(i4);
    }
}
