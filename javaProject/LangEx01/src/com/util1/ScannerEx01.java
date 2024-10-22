package com.util1;

import java.util.Scanner;

public class ScannerEx01 {
    public static void main(String[] args) {
        // System.in -> 표준입력(키보드)
        Scanner sc = new Scanner(System.in);
        // 입력을 위한 prompt
        // System.out.print("입력 : ");
        // 단어 단위 입력
        // String msg1 = sc.next();
        // System.out.println("입력 : "+msg1);

        System.out.print("입력 : ");
        // 엔터키까지 통채로
        String msg2 = sc.nextLine();
        System.out.println("입력 : "+msg2);
    }
}
