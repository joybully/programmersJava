package com.exam3;

public class ThreadEx {
    public static void main(String[] args) {
        Go g = new Go();
        Come c = new Come();

        // Runnable에는 start메서드가 없어서 Thread화 시키고 실행시켜야한다
        Thread t1 = new Thread(g);
        Thread t2 = new Thread(c);
        Thread t3 = new Thread(new Go());
        Thread t4 = new Thread(new Come());

        t1.start();
        t2.start();
    }
}
