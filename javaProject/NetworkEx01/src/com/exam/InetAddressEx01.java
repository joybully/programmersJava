package com.exam;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx01 {
    public static void main(String[] args) {
        // java.net.*
        // InetAddress
        // 도메인 <-> 아이피

        try{
            InetAddress inetAddress1 = InetAddress.getByName("www.daum.net");
            System.out.println(inetAddress1.getHostName());
            System.out.println(inetAddress1.getHostAddress());

            InetAddress[] inetAddresses = InetAddress.getAllByName("www.naver.com");
            for(InetAddress inetAddress : inetAddresses){
                System.out.println(inetAddress.getHostAddress());
            }
        } catch(UnknownHostException e){
            System.out.println("[에러] : " + e.getMessage());
        }

    }
}
