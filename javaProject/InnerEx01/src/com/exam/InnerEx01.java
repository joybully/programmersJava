package com.exam;

public class InnerEx01 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        // x1은 접근 불가
        // System.out.println(outer.x1);
        System.out.println(outer.x2);

        Outer.Inner inner = outer.new Inner();
        // y1은 접근 불가
        // System.out.println(inner.y1);
        System.out.println(inner.y2);

        // 캡슐화를 이용한 접근
        inner.viewInner();
    }
}
