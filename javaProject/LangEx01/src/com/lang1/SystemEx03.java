package com.lang1;

public class SystemEx03 {
    public static void main(String[] args) {
        // 실행 시간
        // 1970년 1월 1일 00:00:00 부터 현재까지 시간을 millisecond로 표시
        long startTime = System.currentTimeMillis();
        System.out.println(startTime);
        System.out.println("hello");
        System.lineSeparator();
        System.out.println("hello");
        //환경값
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("user.home"));
        System.out.println(System.getenv("PATH"));

    }
}
