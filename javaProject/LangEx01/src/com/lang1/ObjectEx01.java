package com.lang1;

public class ObjectEx01 {
    public static void main(String[] args) {
        // Object클래스 생성
        Object obj1 = new Object();
        // java.lang.Object(자료형)@4c873330(해쉬코드, 16진수)
        System.out.println(obj1);
        System.out.println(obj1.toString());
        // 자료형만 분리
        System.out.println(obj1.getClass().getName());
        String className = obj1.getClass().getName();
        System.out.println(className);
        // 1283928880 -> 해쉬코드만 분리 -> 10진수
        System.out.println(obj1.hashCode());
        // 10->16진수 출력
        System.out.printf("%x\n",obj1.hashCode());
        // Person person = new Person();

        // System.out.println(person);
        // System.out.println(person.toString());

    }
}
