package com.exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class URLEx03 {
    public static void main(String[] args) {
        // 웹 사이트(웹서버)에서 html 데이터를 읽어오는 프로그램
        // 다국어 가능하도록 BufferdReader를 이용
        BufferedReader br = null;
        // InputStream is = null;
        try {
            URL url = new URL("https://m.daum.net");
            br = new BufferedReader(new InputStreamReader(url.openStream()));

            /*int data = 0;
            while((data=br.read())!=-1){
                System.out.print((char)data);
            }*/

            String line = null;
            while((line = br.readLine())!=null){
                System.out.println(line);
            }

            System.out.println();
        } catch (MalformedURLException e) {
            System.out.println("[에러] : "+e.getMessage());
        } catch (IOException e) {
            System.out.println("[에러] : " +e.getMessage());
        } finally {
            if(br!=null){try{br.close();}catch (IOException e){}}
        }
    }
}
