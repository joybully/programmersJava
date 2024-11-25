package com.example.cookie.controller;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ConfigController {

    @RequestMapping("/getcookie")
    public String getCookie(HttpServletRequest request) {
        // 브라우저가 종료 되어지면 - 쿠키는 사라짐
        Cookie[] cookies = request.getCookies();
        if(cookies!=null) {
            for (Cookie cookie : cookies) {
                // 쿠키의 설정명이 cookieid이면
                if (cookie.getName().equals("cookieid")) {
                    System.out.println(cookie.getName() + " : " + cookie.getValue());
                } else {
                    // JSESSIONID는 default 쿠키
                    System.out.println(cookie.getName());
                }
            }
        }
        return "getcookie";
    }

    @RequestMapping("/setcookie")
    public String setCookie(HttpServletRequest request, HttpServletResponse response) {
        Cookie cookie1 = new Cookie("cookieid", "tester");

        // 옵션 - 브라우저가 꺼져도 만료시간까지 남아있어라
        cookie1.setMaxAge(2*60);
        response.addCookie(cookie1);
        return "setcookie";
    }

    @RequestMapping("/getcookie2")
    public String getCookie2(
            @CookieValue(value = "cookieid", required = false) Cookie cookie
    ){
        if(cookie!=null){
            System.out.println("cookieid : " + cookie.getValue());
        }
        return "getcookie";
    }

    @RequestMapping("login_form")
    public String login_form(){
        return "login_form";
    }

    @RequestMapping("login_ok")
    public String login_ok(
            String id,
            String password,
            HttpServletResponse response,
            Model model
    ){
        // id = tester
        // password = 1234
        String saveId = "tester";
        String savePassword = "1234";
        int flag = 2;
        // 원래는 데이터베이스에서 select로 해야함
        if(saveId.equals(id) && savePassword.equals(password)){
            // 정상 로그인
            flag = 0;

            // 쿠키를 생성해서 로그인되었음을 표시
            // 쿠키 - 민감정보(x)
            // 아이디, 등급 ...
            Cookie cookie1 = new Cookie("cid", id);
            Cookie cookie2 = new Cookie("cgrade", "A");

            response.addCookie(cookie1);
            response.addCookie(cookie2);
        }else{
            // 아이디나 비밀번호 오류
            flag = 1;
        }
        model.addAttribute("flag", flag);
        return "login_ok";
    }

    @RequestMapping("login_complete")
    public String login_complete(
            @CookieValue(value = "cid", required = false) String cid,
            @CookieValue(value = "cgrade", required = false) String cgrade,
            Model model
    ) {

        int flag = 2;

        // 쿠키의 존재여부를 검사
        if (cid != null && cgrade != null) {
            flag = 0;
        } else {
            flag = 1;
        }

        model.addAttribute("flag", flag);
        return "login_complete";
    }

    @RequestMapping("/logout_ok")
    public String logout_ok(HttpServletRequest request, HttpServletResponse response){
        Cookie[] cookies = request.getCookies();

        if(cookies!=null){
            for(Cookie cookie:cookies){
                // 쿠키 유효기간 만료 == 로그아웃
                cookie.setMaxAge(0);
                response.addCookie(cookie);
            }
        }
        return "logout_ok";
    }
}
