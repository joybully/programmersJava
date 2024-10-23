package com.exception;

public class ExceptionEx06 {
    public static void main(String[] args) {
        String name = null;
        int num1 = 0;
        int num2 = 10;

        /*
        // try-catch문 -> 너무 길다
        // nullPointerException
        try{
            System.out.println("문자열의 길이 : " + name.length());
        }
        catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
        // arithmetic Exception
        try{
            System.out.println("결과 : " + (num2/num1));
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        */
        
        // 하나의 try문에 2가지 예외가 일어나기 때문에 catch문을 2개 만듬
        try{
            System.out.println("문자열의 길이 : " + name.length());
            System.out.println("결과 : " + (num2/num1));
        }
        catch(NullPointerException e){
            System.out.println(e.getMessage());
        }// NullPointerException을 제외한 전부다
        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
