package com.example.request.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ConfigController {
    @RequestMapping("/write")
    public String write(){
        return "write";
    }
    // @RequestMapping(value="/write_ok", method= RequestMethod.GET)
    @GetMapping(value="/write_ok")
    public String write_ok_get(){
        return "write_ok_get";
    }
    // @RequestMapping(value="/write_ok", method= RequestMethod.POST)
    @PostMapping(value="/write_ok")
    public String write_ok_post(){
        return "write_ok_post";
    }
}
