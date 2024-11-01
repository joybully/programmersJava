package com.exam;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ZipcodeSearchEx02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("동이름 입력 > ");
        String strDong = sc.nextLine();

        // 입력 처리
        if(strDong.length() <=1){
            System.out.println("동이름을 2자 이상 입력하셔야 합니다");
            System.exit(0);
        }
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("./zipcode_seoul_utf8_type2.csv"));
            String line = null;
            while((line = br.readLine())!= null){
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("[에러] : "+e.getMessage());
        } finally {if(br!=null)try{br.close();} catch(IOException i){}}
    }
}
