package com.io1;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOEx11 {
    public static void main(String[] args) {
        // 기본 자료형으로 파일 쓰고 읽기
        // DataInputStream & DataOutputStream

        DataOutputStream dos = null;
        try {
            dos = new DataOutputStream(new FileOutputStream("./data.dat"));
            dos.writeInt(2024);
            dos.writeUTF("문자열형식");
            dos.writeFloat(1.8f);
        } catch (IOException e) {
            System.out.println("[에러] : " + e.getMessage());
        } finally{
            if(dos!=null){try{dos.close();}catch(IOException e){}}
        }
    }
}
