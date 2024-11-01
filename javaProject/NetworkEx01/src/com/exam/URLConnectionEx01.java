package com.exam;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionEx01 {
    public static void main(String[] args) {
        try {
            // URLConnection은 URL연결을 해준다
            // URL url = new URL("https://m.daum.net");
            // URLConnection con = url.openConnection();

            URLConnection con = new URL("https://m.daum.net").openConnection();

            System.out.println(con.getContent());
            System.out.println(con.getContentType());
        } catch (IOException e) {
            System.out.println("[에러] : " + e.getMessage());
        }
    }
}
