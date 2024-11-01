package com.exam6;

public class ThreadEx {
    public static void main(String[] args) {
        Gugudan g1 = new Gugudan(4);
        Gugudan g2 = new Gugudan(6);
        System.out.println("시작");

        g1.setDaemon(true);
        g2.setDaemon(true);

        g1.setName("4단");
        g2.setName("6단");

        g1.start();
        g2.start();

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            System.out.println("[에러] : " + e.getMessage());
        }

        System.out.println("끝");
    }
}
