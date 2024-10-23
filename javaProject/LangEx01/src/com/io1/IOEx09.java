package com.io1;

import java.io.*;

public class IOEx09 {
    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader(new FileReader("c:/java/test.txt"));
            bw = new BufferedWriter(new FileWriter("c:/java/newtest.txt"));
            String line = null;
            while((line = br.readLine())!=null){
                bw.write(line);
                bw.write(System.lineSeparator());
            }
        } catch (IOException e) {
            System.out.println("[에러] : "+e.getMessage());
        } finally{
            if(br!=null){try{br.close();} catch(IOException e){}}
            if(bw!=null){try{bw.close();} catch(IOException e){}}
        }

    }
}
