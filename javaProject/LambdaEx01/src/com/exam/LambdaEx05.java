package com.exam;

public class LambdaEx05 {
    public static void main(String[] args) {
        LambdaInter5 lambdaInter5 = (x,y)-> (x>y)?x:y;
        System.out.println(lambdaInter5.max(200,100));
    }
}
