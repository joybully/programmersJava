package com.example.param.controller;

import com.example.param.dto.FormTO;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Enumeration;
import java.util.Map;

@Controller
public class ConfigController {
    @RequestMapping("/form")
    public String form(){
        return "form";
    }

    @RequestMapping("/form_ok1")
    public String form_ok1(HttpServletRequest request) {
        System.out.println("userid : " + request.getParameter("userid"));
        System.out.println("userpw : " + request.getParameter("userpw"));
        return "form_ok";
    }

    @RequestMapping("/form_ok2")
    public String form_ok2(
            @RequestParam(name="userid") String id,
            // @RequestParam(name="userpw") String pw){
            @RequestParam(value="userpw") String pw){
        System.out.println("id : " + id);
        System.out.println("pw : " + pw);
        return "form_ok";
    }

    @RequestMapping("/form_ok3")
    public String form_ok3(
            @RequestParam String userid
            , @RequestParam(required = false, defaultValue = "1234") String userpw
            ){
        System.out.println("userid : " + userid);
        System.out.println("userpw : " + userpw);
        return "form_ok";
    }

    @RequestMapping("/form_ok4")
    public String form_ok4(
            @RequestParam Map<String, String> map

    ) {
        System.out.println("map : " + map);
        System.out.println("map(\"userid\") : " + map.get("userid"));
        System.out.println("map(\"userpw\") : " + map.get("userpw"));
        return "form_ok";
    }

    @RequestMapping("/form_ok5")
    public String form_ok5(
            @RequestParam(name="userid") String id,
            @RequestParam(value="userpw") String pw,
            @RequestParam(value="fruits") String[] fruits){
        System.out.println("id : " + id);
        System.out.println("pw : " + pw);
        System.out.println("fruits : " + fruits[0]);
        System.out.println("fruits : " + fruits[1]);
        return "form_ok";
    }

    @RequestMapping("/form_ok6")
    public String form_ok6( FormTO to){
        System.out.println("to : " + to);
        return "form_ok";
    }

    // header 정보
    @RequestMapping("/header1")
    public String header1(HttpServletRequest request) {
        Enumeration<String> headerNames = request.getHeaderNames();
        while(headerNames.hasMoreElements()){
            String headerName = headerNames.nextElement();
            System.out.println(headerName + " : " + request.getHeader(headerName));
        }
        return "header1";
    }

    @RequestMapping("/header2")
    public String header2(
            @RequestHeader("user-agent") String value1
    ){
        System.out.println("user-agent : " + value1);
        return "header1";
    }
}
