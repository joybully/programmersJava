package com.exam2;

public class Outer {
    private int x1 = 100;
    public int x2 = 100;
    
    Outer(){
        System.out.println("Outer: "+ this);
    }

    // static이기 때문에 미리 선언된다
    static class Inner{
        private int y1 = 200;
        public int y2 = 200;

        Inner(){
            System.out.println("Inner : "+this);
        }

        public void viewInner(){
            System.out.println("viewInner 호출");
            // Inner class가 static class이기 때문에 미리선언되어 접근 불가
            // System.out.println("x1 : "+x1);
            // System.out.println("x1 : "+x1);
            System.out.println("x1 : "+y1);
            System.out.println("x1 : "+y2);
        }
    }
}
