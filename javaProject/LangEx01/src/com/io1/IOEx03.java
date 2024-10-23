package com.io1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOEx03 {
    // 파일 내용 복사
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            // fis = new FileInputStream("c:/java/test.txt");
            // fos = new FileOutputStream("c:/java/newtest.txt");

            fis = new FileInputStream("c:/java/data.pdf");
            fos = new FileOutputStream("c:/java/newdata.pdf");

            int data=0;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }
            System.out.println("복사 완료");
        } catch (IOException e) {
            System.out.println("[에러] " + e.getMessage());
        } finally{
            if (fis != null) {try {fis.close();} catch(IOException e) {}}
            if (fos != null) {try {fos.close();} catch(IOException e) {}}
        }

    }
}
