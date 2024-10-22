package com.util1;

import java.util.Scanner;

public class GugudanEx01 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("단수 : ");
        StringBuilder sbInput = new StringBuilder();
        sbInput.append(sc1.nextLine());
        int dansu = Integer.parseInt(sbInput.toString());
        StringBuilder sbOutput = new StringBuilder();
        for(int i=1; i<dansu+1; i++){
            for(int j=1; j<10; j++){
                sbOutput.append(i+" x "+j+" = "+i*j+"\t");
            }
            sbOutput.append("\n");
        }
        System.out.print(sbOutput);

        // 강사님 풀이
        Scanner sc2 = new Scanner(System.in);
        System.out.println("단수 : ");
        String line = sc2.nextLine();
        int dan = Integer.parseInt(line);
        for(int i=1; i<10; i++){
            System.out.printf("%s x %s = %s%n",dan, i, (dan*i));
        }
        sc2.close();
        sc1.close();
    }
}
