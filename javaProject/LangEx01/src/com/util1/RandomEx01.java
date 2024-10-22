package com.util1;

import java.util.Random;

public class RandomEx01 {
    public static void main(String[] args) {
        // Random rand1 = new Random();
        // 시드 주기(자연난수)
        Random rand1 = new Random(System.currentTimeMillis());
        // 0~1 실수 뽑기
        System.out.println(rand1.nextDouble());
        System.out.println(rand1.nextDouble());
        // 정수뽑기 0 <= 정수 < 10
        System.out.println(rand1.nextInt(10));
        System.out.println(rand1.nextInt());

        // 1 <= 로또 <=45
        System.out.println(rand1.nextInt(1, 46));

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<5;i++){
            sb.append((i+1)+"회");
            for(int j=0;j<6;j++){
                Integer intNum = rand1.nextInt(45)+1;
                StringBuilder stringNum = new StringBuilder();
                if(intNum<10) stringNum.append("0").append(intNum.toString());
                else stringNum.append(intNum.toString());
                sb.append("\t").append(stringNum);
            }
            sb.append("\n");
        }
        System.out.print(sb);

        for(int i=1; i<=5;i++){
            for(int j=1;j<=6; j++){
                System.out.printf("%2d  ",rand1.nextInt(45)+1);
            }
            System.out.println();
        }
    }
}