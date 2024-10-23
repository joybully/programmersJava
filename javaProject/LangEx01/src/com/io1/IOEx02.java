package com.io1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOEx02 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            // 파일이 없으면 자동생성
            fos = new FileOutputStream("c:/java/text2.txt");
            fos.write('a');
            fos.write('b');
            // 에러난다
            // 문자열 안 됨
            // fos.write("b");
            System.out.println("출력 완료");
        } catch (FileNotFoundException e) {
            System.out.println("[에러] " + e.getMessage());
        } catch (IOException e) {
            System.out.println("[에러] " + e.getMessage());
        } finally{
            try {fos.close();} catch(IOException e){}
        }
    }
}
