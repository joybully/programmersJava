package com.util1;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;
import java.util.Objects;

class Students {
    private String hakbun;
    private String name;
    private int korean;
    private int english;
    private int math;

    public Students(String hakbun, String name, int korean, int english, int math) {
        this.hakbun = hakbun;
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }

    public String getHakbun() {
        return hakbun;
    }

    public void setHakbun(String hakbun) {
        this.hakbun = hakbun;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKorean() {
        return korean;
    }

    public void setKorean(int korean) {
        this.korean = korean;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return korean == students.korean && english == students.english && math == students.math && Objects.equals(hakbun, students.hakbun) && Objects.equals(name, students.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hakbun, name, korean, english, math);
    }
}

public class RQA {
    public static void main(String[] args) {
        // 1번 문제
        StringBuilder sbresult1 = new StringBuilder();
        Scanner sc1 = new Scanner(System.in);
        System.out.printf("첫 단수 입력 : ");
        int danStart = Integer.parseInt(sc1.nextLine());
        System.out.printf("마지막 단수 입력 : ");
        int danEnd = Integer.parseInt(sc1.nextLine());
        for(int i=danStart; i<danEnd+1; i++){
            for(int j=1; j<10; j++){
                sbresult1.append(i + " X " + j + " = " + (i*j) + "\t");
            }
            sbresult1.append("\n");
        }
        System.out.println(sbresult1);
        
        // 2번 문제
        StringBuilder sbresult2 = new StringBuilder();
        for(int i=0; i<5; i++){
            sbresult2.append((i+1)+"회"+"\t");
            int[] notSame = {-1, -1, -1, -1, -1, -1};
            for(int j=0; j<6; j++){
                boolean flag = true;
                int randNum = -1;
                while(flag==true){
                    Random randSeed = new Random(Calendar.getInstance().getTimeInMillis());
                    randNum = randSeed.nextInt(45)+1;
                    flag = false;
                    for(int k=0;k<6; k++){
                        if(notSame[k]==randNum) flag = true;
                    }
                }
                notSame[j] = randNum;
                if(randNum<10) sbresult2.append(" "+randNum+"\t");
                else sbresult2.append(randNum+"\t");
            }
            sbresult2.append("\n");
        }
        System.out.println(sbresult2);
        
        // 3번 문제
        StringBuilder sbresult3 = new StringBuilder();
        Scanner sc2 = new Scanner(System.in);
        ArrayList<Students> students = new ArrayList<Students>();
        for(int i=0; i<5; i++){
            boolean flag = true;
            while(flag == true){
                flag = false;
                System.out.printf((i+1)+"번 학생의 "+"학번, 이름, 국어점수, 영어점수, 수학점수를 입력하시오(띄어쓰기 필수) : ");
                String str = sc2.nextLine();
                String[] strArray = str.split(" ");
                if(strArray.length!=5) {
                    System.out.println(strArray.length);
                    flag = true;
                    System.out.println("유효한 값을 입력하시오");
                }
                else{
                    Students student1 = new Students(strArray[0], strArray[1], Integer.parseInt(strArray[2]), Integer.parseInt(strArray[3]), Integer.parseInt(strArray[4]));
                    students.add(student1);
                }
            }
        }
        sbresult3.append("학번"+"\t"+"이름"+"\t"+"\t"+"\t"+"국어"+"\t"+"영어"+"\t"+"수학"+"\n");
        for(int i=0; i<students.size(); i++){
            String hakbun = students.get(i).getHakbun();
            String name = students.get(i).getName();
            int korean = students.get(i).getKorean();
            int english = students.get(i).getEnglish();
            int math = students.get(i).getMath();
            sbresult3.append(hakbun+"\t"+name+"\t"+"\t"+korean+"\t"+english+"\t"+math+"\n");
        }
        System.out.println(sbresult3);
    }
}
