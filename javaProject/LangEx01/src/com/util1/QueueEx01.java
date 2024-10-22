package com.util1;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx01 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();

        queue.add("홍길동");
        queue.add("박문수");
        queue.add("임꺽정");

        System.out.println(queue);

        String data1 = queue.poll();
        System.out.println(data1);
        System.out.println(queue);

    }
}
