package com.exam;

public class LambdaEx01 {
    public static void main(String[] args) {
        // 1번 생성과 동시에 메소드 호출
        new LambdaInter1(){
            @Override
            public void method() {
                System.out.println("Hello Lambda");
            }
        }.method();

        // 2번 생성하고 메소드 호출
        LambdaInter1 f = new LambdaInter1() {
            @Override
            public void method() {
                System.out.println("Hello Lambda");
            }
        };
        f.method();

        // 3번 2번을 람다로 변환
        // 메서드의 내용이 간단할 때 람다를 사용
        f = () -> {System.out.println("Hello Lambda");};
        f.method();
        
        // 4번 3번을 더 생략
        f = () -> System.out.println("Hello Lambda");
        f.method();

    }
}
