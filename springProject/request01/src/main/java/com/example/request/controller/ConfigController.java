package com.example.request.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/request")
public class ConfigController {
    /*
    @RequestMapping("/request1")
    public String request1(){
        return "request1";
    }
    */

    /*
    @RequestMapping(value={"/request*"})
    // @RequestMapping({"/request2","/request3"})
    public String request3(){
        return "request3";
    }
    */

    /*
    @RequestMapping(value={"/request/**"})
    public String request4(){
        return "request4";
    }
    */
    //@RequestMapping(value={"/request/***/value"})
    //public String request5(){
    //    return "request5";
    //}
    //@RequestMapping({"/request/param1"})
    @RequestMapping({"/param1"})
    public String request1(){
        return "request1";
    }
    @RequestMapping({"/param2"})
    public String request2(){
        return "request2";
    }
    @RequestMapping
    public String default1(){
        return "request3";
    }
}
