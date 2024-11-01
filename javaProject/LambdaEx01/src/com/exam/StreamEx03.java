package com.exam;

import java.util.stream.IntStream;

public class StreamEx03 {
    public static void main(String[] args) {
        // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/Stream.html#method-summary
        // 1~10 숫자
        // IntStream test1 = IntStream.of(1,2,3,4,5);
        IntStream test1 = IntStream.rangeClosed(1,10);
        test1.filter(i->i%2==0)
                .forEach(System.out::println);

        // distinct는 중복제거
        IntStream test2 = IntStream.of(1,2,3,3,2,5,7,6,9);
        test2.distinct()
                .forEach(System.out::println);
    }
}