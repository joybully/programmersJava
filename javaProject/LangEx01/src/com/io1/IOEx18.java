package com.io1;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class IOEx18 {

    public static void main(String[] args) {
        FileReader fr = null;
        try{
            fr =new FileReader("./config.properties");
            Properties prop = new Properties();
            prop.load(fr);

            System.out.println(prop);

        }catch(IOException e){
            System.out.println("[에러] : " + e.getMessage());
        }finally{
            if(fr!=null){
                try{fr.close();} catch(IOException e){}
            }
        }

    }
}

