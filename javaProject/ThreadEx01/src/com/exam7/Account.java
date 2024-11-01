package com.exam7;

public class Account {
    // 통장 잔고
    private int balance = 1000;

    public int getBalance(){
        return balance;
    }

    // 인출메서드
    // synchronized로 접근순서를 정한다
    public synchronized void withdraw(int money){
        // 잔고 > 인출
        if(balance>=money)
        {
            // 실제 인출
            try {
                Thread.sleep(1000);
                balance -= money;
            } catch (InterruptedException e) {
                System.out.println("[에러] : " + e.getMessage());
            }
        }
        else{
            System.out.println("잔고가 없음");
        }
    }
}
