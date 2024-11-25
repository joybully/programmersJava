package com.example.param.dto;

import lombok.ToString;

@ToString
public class FormTO {
    private String userid;
    private String userpw;

    public FormTO() {
        System.out.println("Form() 생성자 호출");
    }

    public FormTO(String userid, String userpw) {
        this.userid = userid;
        this.userpw = userpw;
    }

    public void setUserid(String userid) {
        System.out.println("setUserid(String userid)");
        this.userid = userid;
    }

    public void setUserpw(String userpw) {
        System.out.println("setUserpw(String userpw)");
        this.userpw = userpw;
    }
}
