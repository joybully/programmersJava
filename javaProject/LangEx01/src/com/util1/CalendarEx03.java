package com.util1;

import java.util.Calendar;

public class CalendarEx03 {
    public static void main(String[] args) {
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int month = Calendar.getInstance().get(Calendar.MONTH)+1+2;
        Calendar startCalendar = Calendar.getInstance();
        Calendar endCalendar = Calendar.getInstance();
        // 1일
        startCalendar.set(year, month-1, 1);
        // 마지막날 정보
        endCalendar.set(year, month, 1-1);
        // 요일
        int startDayOfWeek = startCalendar.get(Calendar.DAY_OF_WEEK);
        // 날짜
        int endDate = endCalendar.get(Calendar.DATE);
        System.out.println(startDayOfWeek);
        System.out.println(endDate);
        System.out.println(" SU MO TU WE TH FR SA");
        for(int i=1; i<startDayOfWeek; i++){
            // 3개
            System.out.print("   ");
        }
        // i: 날짜
        // n: 달력 디자인
        for(int i=1, n=startDayOfWeek;i<=endDate;i++,n++){
            System.out.print((i<10)? "  " + i : " " + i);
            if(n%7==0){
                System.out.println();
            }
        }
    }
}
