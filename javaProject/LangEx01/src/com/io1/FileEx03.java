package com.io1;

import java.io.File;
import java.util.Calendar;
import java.util.Date;

public class FileEx03 {
    public static void main(String[] args) {
        File file = new File("c:/java/data.pdf");
        long fileSize = file.length();
        System.out.println("File size : " + fileSize);
        // 1024byte -> Kbyte
        System.out.println("File size : " + fileSize / 1024);
        // 수정날짜
        long fileDate = file.lastModified();

        System.out.println(new Date(fileDate).toLocaleString());

    }
}
