package com.exam;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamEx01 {
    public static void main(String[] args) {
        // 고전적인 방법
        // 데이터 생성
        String[] nameArr = {"IronMan","IronMan", "Captain", "SpiderMan", "Thor"};
        // 데이터 처리
        Arrays.sort(nameArr);
        // 데이터 출력
        for(String name : nameArr){
            System.out.println(name);
        }
        
        // Stream을 활용
        // Stream 생성
        Stream<String> nameStream = Arrays.stream(nameArr);
        // Stream 처리
        // Stream 출력
        nameStream
                .distinct()
                .sorted()
                .forEach(System.out::print);
    }
}
