package com.example.session.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class ConfigController {
    @RequestMapping("/getsession")
    // public String getSession(HttpServletRequest request) {
    public String getSession(HttpSession session) {
        // HttpSession session = request.getSession();


        // request.setAttribute / getAttribute
        System.out.println("sid : " + (String)session.getAttribute("sid"));
        System.out.println("sgrade : " + (String)session.getAttribute("sgrade"));
        // session id -> session 저장된 위치값
        System.out.println("id : " + session.getId());
        // sessionCreationTime -> session 생성된 시간
        System.out.println("CreationTime : " + new Date(session.getCreationTime()).toLocaleString());
        System.out.println("LastAccessedTime : " + new Date(session.getLastAccessedTime()).toLocaleString());
        // session 종료까지 남은 시간
        System.out.println("MaxInactiveInterval : " + session.getMaxInactiveInterval());
        return "getsession";
    }

    @RequestMapping("/setsession")
    // public String setSession(HttpServletRequest request) {
    public String setSession(HttpSession session) {
        // HttpSession session = request.getSession();
        session.setAttribute("sid", "tester");
        session.setAttribute("sgrade", "grade A");
        return "setsession";
    }
}
