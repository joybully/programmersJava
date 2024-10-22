package com.util1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapEx02 {
    public static void main(String[] args) {
        Student s1 = new Student("1001", "박문수");
        Student s2 = new Student("1002", "홍길동");
        Student s3 = new Student("1003", "임꺽정");

        HashMap<String, Student> map = new HashMap<>();
        map.put("a",s1);
        map.put("b",s2);
        map.put("c",s3);

        System.out.println(map);

        // key
        Set<String> keys = map.keySet();
        for(String key: keys){
            System.out.println(map.get(key));
        }
        // value
        Collection<Student> values = map.values();
        for(Student s:values){
            System.out.println(s.toString());
        }
    }
}
