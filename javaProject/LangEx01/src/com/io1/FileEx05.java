package com.io1;

import java.io.File;
import java.io.IOException;

public class FileEx05 {
    public static void main(String[] args) {
        // 디렉토리 생성 & 이름변경 & 삭제
        // 생성 mkdir()
        // 변경 renameTo()
        // 삭제 delete()
        File dir = new File("c:/java/dir3");
        dir.mkdir();
        dir.renameTo(new File("c:/java/dir4"));
        File dir2 = new File("c:/java/dir4");
        dir2.delete();

        // 파일 생성/ 이름변경/ 삭제
        File file = new File("c:/java/test2.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        File file2 = new File("c:/java/newtest1.txt");
        try {
            if(file2.exists()) file2.renameTo(new File("c:/java/newtest2.txt"));
            else file2.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
