package com.lang1;

public class StringEx02 {
    public static void main(String[] args) {
        String str1 = "Hello String Hello String";
        // 문자열의 길이
        System.out.println(str1.length());
        System.out.println("Hello".length());
        // 문자열 -> 문자추출
        // 들어가는 파라미터는 String의 인덱스(순서)
        char ch1 = str1.charAt(0);
        System.out.println(ch1);
        // 맨 마지막 글자
        char ch2 = str1.charAt(str1.length()-1);
        System.out.println(ch2);
        // 문자열 -> 부분문자열 추출
        String pstr1 = str1.substring(2);
        System.out.println(pstr1);
        String pstr2 = str1.substring(2, 4);
        System.out.println(pstr2);
        String pstr3 = str1.substring(13, 19);
        System.out.println(pstr3);
        // 문자열/문자 위치 검색
        int pos1 = str1.indexOf("ll");
        System.out.println(pos1);
        int pos2 = str1.indexOf('o',5);
        System.out.println(pos2);
        int pos3 = str1.indexOf('z');
        System.out.println(pos3);
        // 문자열 존재 여부(대소문자 구별)
        // endsWith, contains
        boolean b1 = str1.startsWith("He");
        boolean b2 = str1.startsWith("he");
        System.out.println(b1);
        System.out.println(b2);
        // 문자열 치환
        String rstr = str1.replaceAll("Hello", "안녕");
        System.out.println(rstr);
        // 문자열 연결
        String jstr = str1.concat("안녕");
        System.out.println(jstr);
        // 대소문자 변환
        System.out.println("hello".toUpperCase());
        System.out.println("HELLO".toLowerCase());
        // 공백제거(문자열의 앞, 뒤)
        String ostr = "     Hello String     ";
        System.out.println(ostr);
        String ostr2 = ostr.trim();
        System.out.println(ostr2);


    }
}
