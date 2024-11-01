package com.exam;

import java.util.Scanner;

public class ZipcodeSearchEx01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("동이름 입력 > ");
        String strDong = sc.nextLine();

        // 입력 처리
        if(strDong.length() <=1){
            System.out.println("동이름을 2자 이상 입력하셔야 합니다");
            System.exit(0);
        }
        System.out.println("정상 실행");
    }
}
