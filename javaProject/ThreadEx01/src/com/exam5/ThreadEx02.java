package com.exam5;

public class ThreadEx02 {
    public static void main(String[] args) {
        Gugudan g1 = new Gugudan(4);
        Gugudan g2 = new Gugudan(6);

        System.out.println(g1.getPriority());
        System.out.println(g2.getPriority());

        // g2에 높은 우선순위를 부여
        // g1에 낮은 우선순위를 부여
        g1.setPriority(1);
        g2.setPriority(9);

        g1.setName("4단");
        g2.setName("6단");

        g1.start();
        g2.start();
    }
}
