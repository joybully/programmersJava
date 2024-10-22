package com.util1;

import java.util.Calendar;

public class CalendarEx02 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2024, 10-1, 1-1);
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH)+1);
        System.out.println(calendar.get(Calendar.DATE));
        System.out.println(calendar.getTime().toLocaleString());
        // add
        calendar.add(Calendar.DATE, 1);
        System.out.println(calendar.getTime().toLocaleString());
        calendar.add(Calendar.DATE, -2);
        System.out.println(calendar.getTime().toLocaleString());
    }
}
