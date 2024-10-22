package com.util1;

import java.util.Stack;

public class StackEx01 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        // push, pop
        stack.push("홍길동");
        stack.push("박문수");
        stack.push("임꺽정");
        System.out.println(stack);
        stack.add("이몽룡");
        String data = stack.get(3);
        System.out.println(data);
        System.out.println(stack);

        String popData = stack.pop();
        System.out.println(popData);
        System.out.println(stack);

        while(!stack.isEmpty()){
            String data1 = stack.pop();
            System.out.println(data1);
        }
        System.out.println(stack);
    }
}
