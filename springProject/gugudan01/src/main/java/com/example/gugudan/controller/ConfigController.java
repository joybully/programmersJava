package com.example.gugudan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ConfigController {
    @RequestMapping("/gugudan.do")
    public String gugudan(){
        return "gugudan";
    }

    @RequestMapping("/gugudan_ok.do")
    public String gugudan_ok(String start,String end, Model model){
        System.out.println("start : " + start);
        System.out.println("end : " + start);
        model.addAttribute("start", start);
        model.addAttribute("end", end);
        return "gugudan_ok";

    }
}
