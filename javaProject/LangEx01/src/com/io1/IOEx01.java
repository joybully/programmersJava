package com.io1;

import java.io.FileInputStream;
import java.io.IOException;

public class IOEx01 {
    public static void main(String[] args) {
        // FileInputStream
        FileInputStream fis = null;
        try {
            // 파일이 없으면 exception 발생
            fis = new FileInputStream("c:/java/test.txt");
            int data = fis.read();
            System.out.println((char)data);
            // 파일 끝에 도달할 때 까지 내용 읽기
            // 다국어는 읽을 수 없다
            while((data=fis.read())!=-1){
                // window 엔터키 - \r\n
                // Linux 엔터키 - \n
                if(data=='\r'){
                    System.out.print("(r)");
                }
                else if (data == '\n'){
                    System.out.print("(n)");
                }
                else System.out.print((char)data);
            }
        } catch (IOException e) {
            System.out.println("[에러] " + e.getMessage());
        } finally{
            try { fis.close(); } catch (IOException e) {}
        }
    }
}
