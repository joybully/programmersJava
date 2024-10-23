package com.io1;

import java.io.File;
import java.io.IOException;

public class FileEx02 {
    public static void main(String[] args) {
        // 디렉토리
        File file = new File("c:/java/dir1");
        // 디렉토리 생성
        file.mkdir();
        System.out.println(file.exists());
        // 디렉토리인지 파일인지 구분
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());

        // canExecute() canRead() canWrite()
        File file2 = new File("c:/java/text.txt");
        System.out.println(file2.isHidden());

        File file1 = new File(".");
        // 경로
        System.out.println(file1.getName());
        System.out.println(file1.getParent());
        System.out.println(file1.getPath());
        try {
            System.out.println(file1.getCanonicalPath());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
