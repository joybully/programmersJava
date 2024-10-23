package com.exception;

public class ExceptionEx07 {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 10;
        
        try{
            int result = num2/num1;
            System.out.println("결과는 : " + result);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("finally - 무조건 실행");
        }
    }
}
