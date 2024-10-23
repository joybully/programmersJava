package com.exception;

public class ExceptionEx01 {
    public static void main(String[] args) {
        System.out.println("시작");
        int num1 = 0;
        int num2 = 100;
        // 에러난다
        // 실행 exception 발생
        // int result = num2/num1;
        // 실행 시 발생할 수 있는 에러(실행예외) - if문 이용
        if(num1!=0){
            int result = num2/num1;
            System.out.println("결과 : "+result);
        }
        else System.out.println("0으로 나눌 수 없습니다.");
        System.out.println("끝");
    }
}
