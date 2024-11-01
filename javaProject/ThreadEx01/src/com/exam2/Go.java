package com.exam2;

public class Go extends Thread {
    // Thread에서 작업할 내용 기술
    @Override
    public void run(){
        for(int i=1; i<=10; i++){
            System.out.println("Go : " + i);
        }
    };
}
