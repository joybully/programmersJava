package com.util1;

import java.util.ArrayList;

public class ArrayListEx04 {
    public static void main(String[] args) {
        Student s1 = new Student("1001","홍길동");
        Student s2 = new Student("1002","박문수");
        Student s3 = new Student("1003","임꺽정");

        ArrayList<Student> al = new ArrayList<>();
        al.add(s1);
        al.add(s2);
        al.add(s3);
        System.out.println(al);
        for(int i=0; i<al.size();i++){
            Student s = al.get(i);
            System.out.printf("%s %s ", s.getHakbun(), s.getName());
        }
        System.out.println();
        // 향상된 for문
        for(Student s: al){
            System.out.printf("%s %s ", s.getHakbun(), s.getName());
        }
        System.out.println();
    }
}
