package com.exam;

public class EnumEx01 {
    public static void main(String[] args) {
        Week monday = Week.MONDAY; // 생성자 호출 7번
        System.out.println(monday);
        // Week.MONDAY는 객체형태
        System.out.println(Week.MONDAY);

        // 메서드
        // name
        // name은 문자형태
        String name = monday.name();
        System.out.println(name);

        // ordinal
        Week friday = Week.FRIDAY;
        int weekNum = monday.ordinal();
        System.out.println(weekNum);
        weekNum = friday.ordinal();
        System.out.println(weekNum);

        // compareTO
        Week day1 = Week.MONDAY;
        Week day2 = Week.FRIDAY;
        int result1 = day1.compareTo(day2);
        int result2 = day2.compareTo(day1);
        System.out.println(result1);
        System.out.println(result2);

        // valueOf
        Week day = Week.valueOf("SUNDAY");
        System.out.println(day);

        // values()
        Week[] days = Week.values();
        for(Week week : days){
            System.out.println(week);
        }
    }
}
