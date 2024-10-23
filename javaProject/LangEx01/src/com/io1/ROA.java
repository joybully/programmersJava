package com.io1;

import java.io.*;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

class Address{
    private String postNum;
    private String city;
    private String gu;
    private String dong;
    private String li;
    private String bun;
    private String num;

    public boolean sameDong(String search){
        String dong = this.getDong();
        if(dong.substring(0,2).equals(search.substring(0,2))) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return postNum +
                ", " + city +
                ", " + gu +
                ", " + dong +
                ", " + li +
                ", " + bun +
                ", " + num + '\n';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(postNum, address.postNum) && Objects.equals(city, address.city) && Objects.equals(gu, address.gu) && Objects.equals(dong, address.dong) && Objects.equals(li, address.li) && Objects.equals(bun, address.bun) && Objects.equals(num, address.num);
    }

    @Override
    public int hashCode() {
        return Objects.hash(postNum, city, gu, dong, li, bun, num);
    }

    public String getDong() {
        return dong;
    }

    public Address(String postNum, String city, String gu, String dong, String li, String bun, String num) {
        this.postNum = postNum;
        this.city = city;
        this.gu = gu;
        this.dong = dong;
        this.li = li;
        this.bun = bun;
        this.num = num;
    }
}

public class ROA {
    public static void main(String[] args) {
        BufferedReader br = null;
        ArrayList<Address> addressArrayList = new ArrayList<>();
        try {
            br = new BufferedReader(new FileReader("c:/java/zipcode_seoul_utf8_type2.csv"));
            String line = null;
            while((line = br.readLine())!=null){
                String[] addressInfo = line.split(",");
                Address address = new Address(addressInfo[0],addressInfo[1],addressInfo[2],addressInfo[3],addressInfo[4],addressInfo[5],addressInfo[6]);
                addressArrayList.add(address);
            }
        } catch (IOException e) {
            System.out.println("[에러]: "+e.getMessage());
        } finally {
            if(br!=null){try{br.close();} catch(IOException e){}}
        }
        Scanner sc = new Scanner(System.in);
        String search = null;
        System.out.printf("입력하시오 : ");
        while(!(search = sc.nextLine()).equals("exit")){
            if(search.length()>=2) {
                StringBuilder sb = new StringBuilder();
                for(Address address :addressArrayList){
                    if (address.sameDong(search)) sb.append(address.toString());
                }
                System.out.println(sb);
            }
            System.out.printf("입력하시오 : ");
        }
    }
}
