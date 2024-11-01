package com.io1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class IOEx15 {
    public static void main(String[] args) {
        Person p = new Person("홍길동", "010-111-1111", 20, "서울시");

        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream((new FileOutputStream("./serial.dat")));
            // Person class를 쓰려면 Serializable을 implement해줘야 한다
            oos.writeObject(p);
            System.out.println("출력완료");
        } catch (IOException e) {
            System.out.println("[에러] : "+e.getMessage());
            e.printStackTrace();
        } finally {
            if(oos!=null){try{oos.close();}catch(IOException e){}}
        }
    }
}
