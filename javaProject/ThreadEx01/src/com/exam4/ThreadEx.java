package com.exam4;

public class ThreadEx {
    public static void main(String[] args) {
        Gugudan g1 = new Gugudan(4);
        Gugudan g2 = new Gugudan(6);

        g1.setName("4단");
        g2.setName("6단");

        g1.start();
        g2.start();
    }
}
