package com.io1;

import java.io.FileWriter;
import java.io.IOException;

public class IOEx10 {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            // 덮어쓰기
            // fw = new FileWriter("./test.txt");
            // 이어쓰기
            fw = new FileWriter("./test.txt", true);
            fw.write("Hello");
            fw.write((System.lineSeparator()));
            fw.write("Hello");
        } catch (IOException e) {
            System.out.println("[에러] : "+e.getMessage());
        }finally {
            if(fw!=null){try{fw.close();}catch(IOException e){}}
        }
        System.out.println("출력완료");
    }
}
