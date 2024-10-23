package com.io1;

import java.io.*;

public class IOEx05 {
    public static void main(String[] args) {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            bis = new BufferedInputStream(new FileInputStream("c:/java/data.pdf"));
            bos = new BufferedOutputStream(new FileOutputStream("c:/java/datanew.pdf"));

            int data = 0;
            while((data = bis.read())!=-1){
                bos.write(data);
            }
            System.out.println("복사 완료");
        } catch (IOException e) {
            System.out.println("[에러] : "+e.getMessage());
        } finally{
            if(bis!=null){try {bis.close();} catch (IOException e){}}
            if(bos!=null){try {bos.close();} catch(IOException e){}}
        }
    }
}
