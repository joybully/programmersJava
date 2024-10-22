package com.util1;

import java.util.Date;

public class DateEx01 {
    public static void main(String[] args) {
        // Date 객체 생성
        // 현재 시간을 표시
        java.util.Date date1 = new java.util.Date();
        // toString() 오버라이딩
        System.out.println(date1);
        System.out.println(date1.toString());
    
        // 현재 시간을 표시
        Date date2 = new Date();
        // 다국어에 맞춰서 출력한다
        System.out.println(date2.toLocaleString());

        String strDate = date2.toLocaleString();

        //연도
        System.out.println(date1.getYear()+1900);
        // 월
        System.out.println(date1.getMonth()+1);
        // 일
        System.out.println(date1.getDate());
        // 요일(0: 일요일)
        System.out.println(date1.getDay());
        // 밀리세컨드로 환산된 시간
        System.out.println(date1.getTime());

        Date date3 = new Date(2024-1900, 10-1, 1);
        System.out.println(date3.toLocaleString());
        // date를 0으로
        Date date4 = new Date(2024-1900, 10-1, 0);
        System.out.println(date4.toLocaleString());

    }
}
