package com.example.di03;

import lombok.Setter;

@Setter
public class WriteAction {
    private BoardTO to;

    /*
    public void setTo(BoardTO to) {
        this.to = to;
    }*/

    public void execute(){
        System.out.println(to);
    }
}
