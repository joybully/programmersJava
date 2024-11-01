package com.exam;

public class BoxMainEx01 {
    public static void main(String[] args) {
        // List와 유사
        // type safe가 없음
        Box1 box1 = new Box1();

        // 문자열
        box1.setObject(new String("홍길동"));

        String name = (String)box1.getObject();
        System.out.println(name);

        box1.setObject(Integer.valueOf(10));
        int data = (int)box1.getObject();
        System.out.println(data);
    }
}
