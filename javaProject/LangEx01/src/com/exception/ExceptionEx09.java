package com.exception;

public class ExceptionEx09 {
    public void method1(int num){
        // 메서드 안에서 exception 처리까지 함
        // 보통 이렇게 메서드에서 exception 처리 안 한다
        System.out.println("시작");
        try {
            // 입력값에 대한 검사
            if (num >= 100) System.out.println("정상 입력");
            else {
                //System.out.println("비정상 입력");
                throw new Exception("비정상 입력");
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("끝");
    }
    // 처리에 대한 위임 (메소드는 exception 던지기만 한다)
     public void method2(int num) throws Exception{
        System.out.println("시작");
            // 입력값에 대한 검사
            if (num >= 100) System.out.println("정상 입력");
            else {
                //System.out.println("비정상 입력");
                throw new Exception("비정상 입력");
            }
        System.out.println("끝");
    }

    public static void main(String[] args) {
        ExceptionEx09 ex = new ExceptionEx09();
        ex.method1(10);
        try {
            ex.method2(10);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        // 에러난다
        // method2가 exception을 던지는데 처리 안해주니까
        // ex.method2(10);
    }
}
