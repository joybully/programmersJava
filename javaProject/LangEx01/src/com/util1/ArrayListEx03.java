package com.util1;

import java.util.ArrayList;

public class ArrayListEx03 {
    public static void main(String[] args) {
        // 내부 데이터의 자료형을 일치
        // Generic
        ArrayList al = new ArrayList();
        // data안정성이 안좋다
        al.add("A");
        al.add("B");
        al.add(10);
        al.add(20);
        al.add('a');
        al.add('b');
        System.out.println(al);

        // 에러난다
        // for(int i=0; i<al.size(); i++){
        //     String data = (String)al.get(i);
        //     System.out.println(data);
        // }
        ArrayList<String> al2 = new ArrayList();
        al2.add("aa");
        al2.add("bb");
        al2.add("cc");

        for(int i=0;i<al2.size();i++){
            String data = al2.get(i);
            System.out.println(data);
        }
    }
}
