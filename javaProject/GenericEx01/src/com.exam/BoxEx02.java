package com.exam;

public class BoxEx02 {
    public static void main(String[] args) {
        Box2<String> box1 = new Box2<>();
        box1.setT("홍길동");
        String name = box1.getT();
        System.out.println(name);

        Box2<Integer> box2 = new Box2<>();
        box2.setT(10);
        int data = box2.getT();
        System.out.println(data);
    }
}
