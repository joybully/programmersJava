package com.exam;

public class TestEx01 {
    public static void main(String[] args) {
        // Child1 child1 = new Child1();
        // Child2 child2 = new Child2();
        com.test1.Child1 child1 = new com.test1.Child1();
        com.test1.Child2 child2 = new com.test1.Child2();
        child1.method();
        child2.method();
    }
}
