package com.exam;

import java.util.Scanner;

public class ZipcodeSearchEx05 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        // 무한루프
        while(true){
            System.out.print("동이름을 입력하세요. 입력을 마치려면 'exit' 입력 > ");
            String strDong = sc.nextLine();
            if(strDong.equals("exit")){
                break;
            }
            System.out.println("프로그램 진행");
        }
        sc.close();
    }
}
