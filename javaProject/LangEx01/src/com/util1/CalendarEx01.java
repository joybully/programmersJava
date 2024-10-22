package com.util1;

import java.util.Calendar;

public class CalendarEx01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);

        // 연도
        System.out.println(calendar.get(Calendar.YEAR));
        // 월 -> 0부터 시작해서 1을 더해줘야한다
        System.out.println(calendar.get(Calendar.MONTH)+1);
        // 일
        System.out.println(calendar.get(Calendar.DATE));
        // 요일, 일요일이 1이다
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        // switch문 이용해 요일 출력
        /*
        String DayOfWeek = "";
        switch(calendar.get(Calendar.DAY_OF_WEEK)){
            case 1:
                DayOfWeek = "일요일";
                break;
            case 2:
                DayOfWeek = "월요일";
                break;
            case 3:
                DayOfWeek = "화요일";
                break;
            case 4:
                DayOfWeek = "수요일";
                break;
            case 5:
                DayOfWeek = "목요일";
                break;
            case 6:
                DayOfWeek = "금요일";
                break;
            default:
                DayOfWeek = "토요일";
                break;    
        }
        System.out.println(DayOfWeek);
        */
        // 배열을 이용해 요일 출력
        String[] weekNames = {"일", "월", "화", "수", "목", "금", "토", "일"};
        System.out.println(weekNames[calendar.get(Calendar.DAY_OF_WEEK)-1]);
        System.out.println(calendar.getTimeInMillis());
        // 그 달의 마지막 날
        System.out.println(calendar.getActualMaximum(Calendar.DATE));
        // 그 달의 첫째 날
        System.out.println(calendar.getActualMinimum(Calendar.DATE));

    }
}
