package com.exam;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class URLEx02 {
    public static void main(String[] args) {
        // 웹 사이트(웹서버)에서 html 데이터를 읽어오는 프로그램
        InputStream is = null;
        try {
            URL url = new URL("https://m.daum.net");
            is = url.openStream();

            int data = 0;
            while((data=is.read())!=-1){
                System.out.print((char)data);
            }
            System.out.println();
        } catch (MalformedURLException e) {
            System.out.println("[에러] : "+e.getMessage());
        } catch (IOException e) {
            System.out.println("[에러] : " +e.getMessage());
        } finally {
            if(is!=null){try{is.close();}catch (IOException e){}}
        }
    }
}
