package com.exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionEx04 {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            URLConnection conn = new URL("http://kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.xml?key=6495b6da791f9949f58ef4ae82c36c56&targetDt=20241026").openConnection();
            br = new BufferedReader(new InputStreamReader(conn.getInputStream()));

            String line = br.readLine().replaceAll("><",">\n<");
            //System.out.println(line);

            String[] lines = line.split("\n");
            for(String data : lines){
                //영화 제목만 추출
                if (data.trim().startsWith("<movieNm>")){
                    System.out.println(data.trim());
                }
            }
        } catch (IOException e) {
            System.out.println("[에러] : "+e.getMessage());
        } finally {
            if(br!=null){try{br.close();}catch(IOException e){}}
        }
    }
}
