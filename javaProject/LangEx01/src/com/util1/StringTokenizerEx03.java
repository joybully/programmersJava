package com.util1;

import java.util.StringJoiner;

public class StringTokenizerEx03 {
    public static void main(String[] args) {
        // 문자열 연결 방법
        // case1
        String str1 = "사과" + ",수박" + ",딸기" + ",참외";
        System.out.println(str1);
        // case2
        String str2 = "사과".concat(",수박").concat(",딸기").concat(",참외");
        System.out.println(str2);
        // case3
        String str3 = String.format("%s,%s,%s,%s", "사과", "수박", "딸기", "참외");
        System.out.println(str3);
        // case4
        String[] arr = {"사과", "수박", "딸기", "참외"};
        String str4 = String.join(",",arr);
        System.out.println(str4);
        // case5
        StringJoiner joiner = new StringJoiner(",");
        joiner.add("사과");
        joiner.add("수박");
        joiner.add("딸기");
        joiner.add("참외");
        System.out.println(joiner.toString());
    }
}
