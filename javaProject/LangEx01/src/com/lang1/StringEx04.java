package com.lang1;

public class StringEx04 {
    public static void main(String[] args) {
        /*
        String[] names = args[0].split(" ");
        String result = "";
        for (int i=0; i<3; i++){
            result += String.format("%s%s%s",names[i].substring(0,1).toUpperCase(),names[i].substring(1)," ");
        }
            System.out.println(result);
        */

        if (args.length != 1) {
            System.out.println("1개 입력하셔야 합니다.");
        }
        else{
            System.out.println("정상입력");
            String name = args[0];
            System.out.println(name);

            String[] names = name.split(" ");
            String result = "";
            for(int i=0; i< names.length; i++){
                result += names[i].substring(0,1).toUpperCase()+names[i].substring(1)+" ";
            }
            System.out.println(result);
        }

    }
}
