package com.exam2;

public class InnerEx {
    public static void main(String[] args) {
        // 인스턴스 클래스와 new생성자 위치가 다르다
        // 인스턴스클래스
        // Outer.Inner inner = Outer.new Inner();
        Outer.Inner inner = new Outer.Inner();

        // 접근지정자 때문에 접근 불가
        // System.out.println(inner.y1);
        System.out.println(inner.y2);

        inner.viewInner();
    }
}
