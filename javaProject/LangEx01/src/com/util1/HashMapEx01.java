package com.util1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapEx01 {
    public static void main(String[] args) {
        HashMap<String, String> hm1 = new HashMap<>();
        hm1.put("a", "홍길동");
        hm1.put("b", "박문수");
        hm1.put("c", "임꺽정");
        System.out.println(hm1);
        System.out.println(hm1.size());
        hm1.put("d", "장길산");
        System.out.println(hm1);
        //추가 -> 수정
        hm1.put("c", "이몽룡");
        System.out.println(hm1);

        System.out.println(hm1.get("a"));

        System.out.println(hm1.get("b"));
        // 키 -> 데이터
        Set<String> keys = hm1.keySet();
        System.out.println(keys);
        for(String key: keys){
            System.out.println(hm1.get(key));
        }
        // 데이터
        Collection<String> values = hm1.values();
        for(String value:values){
            System.out.println(value);
        }
    }
}
