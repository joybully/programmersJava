package com.lang1;

public class StringEx03 {
    public static void main(String[] args) {
        // 구분자(' ',',') 중심의 문자열 분리
        String sstr1 = "apple,banana,pineapple,kiwi";
        String[] strArr1 = sstr1.split(",");
        for(String str:strArr1){
            System.out.println(str);
        }
        String[] strArr2 = sstr1.split(",", 2);
        for(String str:strArr2){
            System.out.println(str);
        }
        String jstr = String.join(",", strArr1);
        System.out.println(jstr);
        // format
        String jstr2 = String.format("%s,%s,%s", strArr1[0], strArr1[1], strArr1[2] );
        System.out.println(jstr2);
    }
}
