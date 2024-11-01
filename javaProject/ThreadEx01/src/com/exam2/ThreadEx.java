package com.exam2;

public class ThreadEx {
    public static void main(String[] args) {
        Go g = new Go();
        Come c = new Come();

        // g.run();
        // c.run();

        // Thread 실행용 메서드
        // start() -> run()
        g.start();
        c.start();
    }
}
