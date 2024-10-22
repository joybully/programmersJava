package com.util1;

import java.util.ArrayList;

public class ArrayListEx02 {
    public static void main(String[] args) {
        ArrayList ar = new ArrayList();

        // 기본 자료형
        // arraylist는 Object만 받음
        // 근데 10, 20이 들어간다
        Integer i = Integer.valueOf(30);
        Object obj = i;
        ar.add(obj);
        // AutoBoxing, 형변환
        ar.add(10);
        ar.add(20);

        System.out.println(ar);
        // 형변환, unBoxing
        int i1 = (Integer)ar.get(0);
        System.out.println(i1);

        // for문을 통해서 출력
        for(Object obj1:ar){
            System.out.printf("%s, ",(int)obj1);
        }
    }
}
