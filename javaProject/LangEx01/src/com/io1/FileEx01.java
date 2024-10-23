package com.io1;

import java.io.File;

public class FileEx01 {
    public static void main(String[] args) {
        // Directory(특수목적 파일) / File

        // 경로
        // 절대경로 : 드라이브명 부터 추적
        // 상대경로 : 현재 실행위치 부터 추적 . (현재) / .. (부모)

        // 경로를 통해서 File 객체 생성
        // 디렉토리에 대한 File 객체 생성
        // 경로 표시할 때는 역슬래쉬2개 = 슬래쉬1개
        // File dir = new File("c:\\java");
        File dir = new File("c:/java");
        System.out.println(dir);
        File file = new File("c:/java/test.txt");
        System.out.println(file);
        File file2 = new File("c:/java","test.txt");
        System.out.println(file2);

        // 존재 유무
        System.out.println(dir.exists());
        System.out.println(file.exists());
    }
}
