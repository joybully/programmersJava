package com.io1;

import java.io.IOException;
import java.io.InputStream;

public class IOEx19 {
    public static void main(String[] args) {
        // 외부 입력
        // new Scanner(System.in)
        // System.in - 표준 입력

        InputStream is = null;
        try {
            is = System.in;
            System.out.print("입력 : ");
            int data = is.read();
            System.out.println("입력값 : " + (char)data);
            data = is.read();
            System.out.println("입력값 : " + (char)data);
            data = is.read();
            System.out.println("입력값 : " + (char)data);
        } catch (IOException e) {
            System.out.println("[에러] : "+e.getMessage());
        }finally {
            if(is!=null)try{is.close();}catch(IOException e){}
        }
    }
}
