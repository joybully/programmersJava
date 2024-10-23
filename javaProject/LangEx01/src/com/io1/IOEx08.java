package com.io1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IOEx08 {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("c:/java/test.txt"));
            /*
            int data = 0;
            while((data = br.read()) != -1){
                System.out.print((char)data);
            }
            */
            // 한 줄씩 읽는다 -> 굉장히 빨라진다
            String line = null;
            while((line = br.readLine())!=null){
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("[에러] : "+e.getMessage());
        } finally{
            if(br!=null) {try {br.close();} catch(IOException e){}}
        }
    }
}
