package com.io1;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IOEx04 {
    public static void main(String[] args) {
        //FileInputStream fis = null;
        BufferedInputStream bis = null;

        try {
            //fis = new FileInputStream("c:/java/test.txt");
            bis = new BufferedInputStream(new FileInputStream("c:/java/test.txt"));

            int data = 0;
            while((data = bis.read())!=-1){
                System.out.print((char)data);
            }
        } catch (IOException e) {
            System.out.println("[에러] : "+e.getMessage());
        } finally{
            if(bis!=null){try {bis.close();} catch (IOException e){}}
            // if(fis!=null){try {fis.close();} catch (IOException e){}}
        }
    }
}
