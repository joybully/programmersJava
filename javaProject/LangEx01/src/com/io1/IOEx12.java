package com.io1;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class IOEx12 {
    public static void main(String[] args) {
        DataInputStream dis = null;
        try {
            dis = new DataInputStream(new FileInputStream("./data.dat"));
            //쓰기 순서대로 읽기
            System.out.println(dis.readInt());
            System.out.println(dis.readUTF());
            System.out.println(dis.readFloat());
        } catch (IOException e) {
            System.out.println("[에러] : " + e.getMessage());
        } finally{
            if(dis != null) {try {dis.close(); } catch(IOException e){}}
        }

    }
}
