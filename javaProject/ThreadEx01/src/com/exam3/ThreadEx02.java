package com.exam3;

public class ThreadEx02 {
    // 익명 내부 클래스로 처리
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            public void run () {
                for (int i = 1; i <= 10; i++) {
                    System.out.println("Go : " + i);
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run () {
                for (int i = 1; i <= 10; i++) {
                    System.out.println("Come : " + i);
                }
            }
        });

        t1.start();
        t2.start();

    }
}
