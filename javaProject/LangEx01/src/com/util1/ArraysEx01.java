package com.util1;

import java.util.Arrays;

public class ArraysEx01 {
    public static void main(String[] args) {
        String[] arrs = {"aaa", "bbb", "ccc"};
        // for
        System.out.println(Arrays.toString(arrs));
        // 내용 채우기
        Arrays.fill(arrs, "xxx");
        System.out.println(Arrays.toString(arrs));
        String[] arrs1 = {"aaa", "bbb", "ccc"};
        String[] arrs2 = {"aaa", "bbb", "ccc"};

        System.out.println(arrs1==arrs2);
        // 배열의 내용값 비교
        System.out.println(Arrays.equals(arrs1, arrs2));
        int[] intArrs = {5,2,3,1,4};
        System.out.println(Arrays.toString(intArrs));
        // 배열의 내용값 정렬
        Arrays.sort(intArrs);
        System.out.println(Arrays.toString(intArrs));

    }
}
