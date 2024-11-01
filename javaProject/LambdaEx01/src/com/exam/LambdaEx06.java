package com.exam;

public class LambdaEx06 {
    public static void main(String[] args) {
        LambdaInter6 lambdaInter6 = (arr)->{int sum = 0;for(int i : arr) sum+=i; return sum;};
        System.out.println(lambdaInter6.sumArr(new int[] {1,2,3,4,5,6,7,8,9}));
    }
}
