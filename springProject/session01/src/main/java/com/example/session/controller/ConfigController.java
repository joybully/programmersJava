package com.example.session.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @RequestMapping("/login_form")
    public String login_form(){
        return "login_form";
    }

    @RequestMapping("/login_ok")
    public String login_ok(
            String id,
            String password,
            HttpSession httpSession,
            Model model
    ) {
        String saveId = "tester";
        String savePassword = "1234";
        int flag = 2;
        if(saveId.equals(id)&&savePassword.equals(password)){
            flag=0;
            httpSession.setAttribute("sid", id);
            httpSession.setAttribute("sgrade", "A");
        }else{
            flag=1;
        }
        model.addAttribute("flag",flag);
        return "login_ok";
    }

    @RequestMapping("/login_complete")
    public String login_complete(HttpSession session, Model model){
        int flag=2;
        if(session.getAttribute("sid")!=null&&session.getAttribute("sgrade")!=null){
            flag=0;
        }else{
            flag=1;
        }
        model.addAttribute("flag", flag);
        return "login_complete";
    }

    @RequestMapping("/logout_ok")
    public String logout_ok(HttpSession session){

        // 세션 아이디 파기 후 재생성
        session.invalidate();

        return "logout_ok";
    }
}
