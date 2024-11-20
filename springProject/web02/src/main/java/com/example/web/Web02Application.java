package com.example.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SpringBootApplication
public class Web02Application {

    public static void main(String[] args) {
        SpringApplication.run(Web02Application.class, args);
    }

    @RequestMapping("/")
    @ResponseBody
    public String index(){
        return "Hello String Boot";
    }

    // @RequestMapping("/hello1")
    // public String hello1(){
        // url http://localhost:8080/hello1으로 가면
        // properties파일의 suffix와 prefix가 붙어사
        // 밑의 리턴값 hello1이 /WEB-INF/views/hello1.jsp로 바뀌고
        // 해당 hello1.jsp파일이 웹에 띄워진다
        // return "hello1";
    // }

    @RequestMapping("/hello1")
    public ModelAndView hello(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("hello1");
        return modelAndView;
    }

    @RequestMapping("/hello2.do")
    public String hello2(){
        return "hello2";
    }
}
