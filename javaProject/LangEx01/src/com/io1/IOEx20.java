package com.io1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOEx20 {
    public static void main(String[] args) {
        // 다국어 처리

        BufferedReader br = null;
        // InputStreamReader isr = null;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("입력 : ");
            String line = br.readLine();
            System.out.println("입력값 : " + line);
        } catch (IOException e) {
            System.out.println("[에러] : "+e.getMessage());
        }finally {
            if(br!=null)try{br.close();}catch(IOException e){}
        }
    }
}
