package com.exam4;

public class Gugudan extends Thread {
    private int dan;
    Gugudan(int dan){
        this.dan = dan;
    }

    @Override
    public void run(){
        System.out.println(this.getName());
        for(int i=1;i<=9; i++){
            System.out.printf("%s X %s = %s%n",dan,i,(dan*i));
        }
        System.out.println(this.getName());
    }
}
