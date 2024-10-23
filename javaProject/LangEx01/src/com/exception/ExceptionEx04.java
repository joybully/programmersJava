package com.exception;

public class ExceptionEx04 {
    public static void main(String[] args) {
        System.out.println("시작");
        int num1 = 10;
        int num2 = 100;
        
        // arithmetic exception
        try{
            int result = num2/num1;
            System.out.println("결과 : " + result);
        }
        catch (ArithmeticException e){
            System.out.println("Exception 발생");
        }

        System.out.println("끝");
    }
}
