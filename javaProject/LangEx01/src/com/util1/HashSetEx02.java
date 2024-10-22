package com.util1;

import java.util.HashSet;

public class HashSetEx02 {
    public static void main(String[] args) {
        Person p1 = new Person("홍길동", 31);
        Person p2 = new Person("박문수", 33);
        Person p3 = new Person("임꺽정", 35);
        HashSet<Person> hs = new HashSet<>();
        hs.add(p1);
        hs.add(p2);
        hs.add(p3);
        System.out.println(hs);
        
        // class는 같은 값 비교안한다
        // 하지만 Person클래스에 equals 메소드를 추가하면 추가가 안된다
        Person p4 = new Person("홍길동", 31);
        hs.add(p4);
        System.out.println(hs);
    }
}
