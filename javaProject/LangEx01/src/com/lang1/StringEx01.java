package com.lang1;

public class StringEx01 {
    public static void main(String[] args) {
        // String 객체 생성
        String str1 = "Hello World";
        String str2 = new String("Hello World");
        char[] charArray = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'};
        String str3 = new String(charArray);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        // 문자열 비교
        String str11 = new String("Hello World");
        String str12 = new String("Hello World");
        // 주소값 비교
        System.out.println(str11 == str12);
        // 내용값 비교
        System.out.println(str11.equals(str12));

    }
}
