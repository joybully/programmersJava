package com.exam;

public class Outer {
    private int x1 = 100;
    public int x2 = 100;
    Outer(){
        System.out.println("Outer : "+this);
    }
    
    // 인스턴스 내부클래스
    class Inner{
        private  int y1 = 200;
        public int y2 = 200;

        public Inner(){
            System.out.println("Inner : "+this);
        }

        public void viewInner(){
            System.out.println("viewInner 호출");
            System.out.println("x1 : "+x1);
            System.out.println("x2 : "+x2);
            System.out.println("y1 : "+y1);
            System.out.println("y2 : "+y2);
        }
    }
}
