package com.exam;

import java.net.MalformedURLException;
import java.net.URL;

public class URLEx01 {
    public static void main(String[] args) {
        // URL(Uniform Resource Locator)
        // 브라우저에 표현되는 방식

        // https://www.daum.net/
        // https://www.auction.co.kr/e/bigs/tab2?itemno=C629778213&BCODE=BN00253102&gate_id=5d8195ad-47df-4c60-aa63-986b846fad6d&ck=&sn=&igaw_eng=&airbridge_referrer=&appgate_guid=
        // 문자열을 분석해서 각 요소별로 멤버필드에 저장

        String strUrl = "http://www.codechobo.com/sample/hello.html?referer=codechobo#index1";
        
        // 문자열 클래스의 메서드를 이용해서
        // protocol/ 도메인 추출
        
        try {
            URL url = new URL(strUrl);
            System.out.println(url.getProtocol());
            System.out.println(url.getHost());
            System.out.println(strUrl.split("/")[2]);
        } catch (MalformedURLException e) {
            System.out.println("[에러] : " + e.getMessage());
        }
    }
}
