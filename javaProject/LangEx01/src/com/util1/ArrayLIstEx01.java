package com.util1;

import java.util.ArrayList;
import java.util.List;

public class ArrayLIstEx01 {
    public static void main(String[] args) {
        ArrayList ar1 = new ArrayList();
        ArrayList ar2 = new ArrayList(100);
        List list = new ArrayList();
        // Object로 들어간다
        ar1.add("홍길동");
        String str = "박문수";
        Object obj = str;
        // 똑같이 Object로 들어간다
        ar1.add(obj);
        ar1.add("임꺽정");
        System.out.println(ar1.size());
        System.out.println(ar1);
        ar1.add("이몽룡");
        System.out.println(ar1);

        //
        String str1 = (String)ar1.get(0);
        System.out.println(str1);

        for(int i=0;i<ar1.size();i++){
            System.out.println((String)ar1.get(i));
        }
        for(Object data: ar1){
            System.out.println((String)data);
        }
    }
}
