package com.lang1;

public class ObjectEx03 {
    public static void main(String[] args) {
        // 동등비교 ( == )
        int a = 10;
        int b = 10;

        // 내용값을 비교
        System.out.println(a == b); // true
        Object o1 = new Object();
        Object o2 = new Object();

        // 내용값 -> 참조값을 비교 => 주소값을 비교
        System.out.println(o1 == o2); // false
        
        // 내용값 -> 데이터비교
        System.out.println(o1.equals(o2)); // false
        String s1 = new String("Hello");
        String s2 = new String("Hello");

        // 참조값 비교
        System.out.println(s1 == s2); // false
        // 내용값 비교 - 오버라이딩
        System.out.println(s1.equals(s2)); // true
        Person p1 = new Person(1001, "박문수", 40);
        Person p2 = new Person(1001, "박문수", 40);
        System.out.println(p1 == p2); // false
        // Person 클래스에 대한 equals에 대해 오버리이딩해야한다
        System.out.println(p1.equals(p2)); // true

        System.out.println(p1.equals(p2)); // true
    }
}
