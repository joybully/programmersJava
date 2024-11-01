package com.exam;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx02 {
    public static void main(String[] args) {
        // 스트림 생성
        // List&Set&Map -> 스트림 생성 가능
        // 배열 스트림 생성 가능
        // 문자배열(문자열) 스트림 생성 가능
        // 특정 범위의 정수나 난수 스트림 생성 가능
        // 람다식 스트림 생성 가능
        // 빈 스트림 생성가능

        // List->stream
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Stream<Integer> intStream = list.stream();

        // for문을 통한 출력
        intStream.forEach(System.out::println);

        // String->stream
        Stream<String> strStream = Stream.of("a", "b", "c");
        strStream.forEach(System.out::println);

        // 빈 스트림
        Stream<Integer> emptyStream = Stream.empty();
        System.out.println("빈스트림 출력");
        emptyStream.forEach(System.out::println);


    }
}
