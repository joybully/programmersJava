package com.io1;

import java.io.File;

public class FileEx04 {
    public static void main(String[] args) {
        File dir = new File("c:/java");

        String[] files = dir.list();
        for(String file: files){
            System.out.println(file);
        }

        // 디렉토리 [] 표시
        // 파일은 그냥 표시
        File[] files2 = dir.listFiles();
        for(File file : files2){
            if(file.isDirectory()){
                System.out.printf("[%s]\t",file.getName());
            }
            else{
                System.out.printf(file.getName()+"\t");
            }
        }
    }
}
