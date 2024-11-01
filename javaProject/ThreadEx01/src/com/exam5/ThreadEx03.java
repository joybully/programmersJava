package com.exam5;

public class ThreadEx03 {
    public static void main(String[] args) {

        // Thread의 상태를 보는 메서드들
        System.out.println(Thread.currentThread().getPriority());
        System.out.println("count : " + Thread.activeCount());
        Thread current = Thread.currentThread();
        System.out.println(current);
        System.out.println(current.getName());
        System.out.println(current.isAlive());
        System.out.println(current.isDaemon());
    }
}
