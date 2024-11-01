package com.exam;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ZipcodeSearchEx04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("동이름 입력 > ");
        String strDong = sc.nextLine();
        sc.close();
        
        // 입력 처리
        if(strDong.length() <=1){
            System.out.println("동이름을 2자 이상 입력하셔야 합니다");
            System.exit(0);
        }
        // 처리
        ArrayList<String> result = new ArrayList<>();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("./zipcode_seoul_utf8_type2.csv"));
            String line = null;
            while((line = br.readLine())!= null){
                // System.out.println(line);
                String[] addresses = line.split(",");
                // System.out.println(addresses[3]);
                // 검색된 동이름에 해당하는 데이터만 출력
                if(addresses[3].startsWith(strDong)){
                    // System.out.println(addresses[3]);
                    String address = String.format("[%s] %s %s %s %s %s",
                            addresses[0], addresses[1], addresses[2],
                            addresses[3], addresses[4], addresses[5]);
                    result.add(address);
                }
            }
        } catch (IOException e) {
            System.out.println("[에러] : "+e.getMessage());
        } finally {if(br!=null)try{br.close();} catch(IOException i){}}
        // 출력
        for(String data : result){
            System.out.println(data);
        }
    }
}
