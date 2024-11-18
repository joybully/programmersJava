package com.example.di02;

import lombok.Setter;
import lombok.ToString;

@Setter @ToString
public class BoardTO {
    private int seq;
    private String subject;
    // 생성자
    // setter

    /*public void setSeq(int seq) {
        this.seq = seq;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }*/
}
