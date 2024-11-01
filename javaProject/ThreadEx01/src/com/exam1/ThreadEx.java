package com.exam1;

public class ThreadEx {
    public static void main(String[] args) {
        Go g = new Go();
        Come c = new Come();

        // 순차처리
        g.run();
        c.run();
    }
}
