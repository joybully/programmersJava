package com.exam3;

public class InnerEx {
    public static void main(String[] args) {
        // 지역변수
        int x = 100;
        class Inner {
            private int y1 = 100;
            public int y2 = 100;

            Inner(){
                System.out.println("Inner : " + this);
            }

            public void viewInner(){
                System.out.println("viewInner 호출");
                System.out.println("y1 : "+y1);
                System.out.println("y2 : "+y2);
                // 지역변수 접근 가능
                System.out.println("x : "+x);
                // 연산은 안됨
                // x++;
            }
        }
        // 인스턴스화
        Inner inner = new Inner();
        inner.viewInner();
    }
}
