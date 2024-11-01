package com.io1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class IOEx13 {
    public static void main(String[] args) {
        // Object
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("./object.ser"));

            String[] names = {"홍길동", "박문수", "임꺽정"};
            int[] ages = {55, 23, 47};
            double[] weights = {71.4, 67.9, 58.6};

            oos.writeObject(names);
            oos.writeObject(ages);
            oos.writeObject(weights);

            System.out.println("출력완료");
        } catch (IOException e) {
            System.out.println("[에러] : " + e.getMessage());
        } finally {
            if(oos!=null){try{oos.close();}catch(IOException e){}}
        }
    }
}
