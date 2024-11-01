package com.exam4;

public class InnerEx02 {
    private int y = 200;
    public void doInner(){
        int x = 100;

        // 아래의 this와는 다르게 InnerEx02클래스의 this이다
        System.out.println("외부 : "+this);

        new InterA(){
            @Override
            public void viewInner() {
                System.out.println("viewInner 호출");
                // 위의 this와는 다르게 InterA의 구현의 클래스이기 때문에 다른 this가 나온다
                System.out.println("내부 : "+this);
                System.out.println("외부 : "+InnerEx02.this);
                // InnerEx02의 y이기 때문에 this로 접근이 안된다
                // System.out.println("내부 : "+this.y);
                System.out.println("외부의 y : "+InnerEx02.this.y);
            }
        }.viewInner();
    }

    public static void main(String[] args) {
        InnerEx02 ie = new InnerEx02();
        ie.doInner();
    }
}
