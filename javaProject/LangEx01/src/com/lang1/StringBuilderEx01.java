package com.lang1;

public class StringBuilderEx01 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder(100);
        StringBuilder sb3 = new StringBuilder("Hello StringBuilder");

        System.out.println(sb1.capacity()); // 16->디폴트 용량
        System.out.println(sb2.capacity()); // 100
        System.out.println(sb3.capacity()); // 데이터 길이 + 16

        // 문자열의 길이
        System.out.println(sb1.length());
        System.out.println(sb3.length());

        // 문자열 추출
        // chatAt
        // substring
        // indexOf
        // replace <- replaceAll

        // 버퍼의 문자열 조작
        // append -> 추가
        // insert -> 중간에 추가
        // delete -> 제거
        System.out.println(sb3);
        System.out.println(sb3.append(" 안녕"));
        System.out.println(sb3.insert(3,"추가"));
        System.out.println(sb3.delete(0,4));
        System.out.println(sb3.reverse());
    }

}
