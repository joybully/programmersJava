package com.exam3;

public class ThreadEx04 {
    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            for(int i=1;i<=9; i++){
                System.out.println(3+" X "+i+" = "+i*3);
            };
        });

        Thread t2 = new Thread(()->{
            for(int i=1;i<9; i++){
                System.out.println(7+" X "+i+" = "+i*3);
            };
        });
        t1.start();
        t2.start();

        Gugudan g1 = new Gugudan(4);
        Gugudan g2 = new Gugudan(6);

        g1.start();
        g2.start();
    }
}
