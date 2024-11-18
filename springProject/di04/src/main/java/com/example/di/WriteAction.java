package com.example.di;

import lombok.Locked;

public class WriteAction {
    private BoardTO to;
    WriteAction(BoardTO to){
        System.out.println("WriteAction 생성자 호출");
        this.to = to;
    }

    public void execute(){
        System.out.println("execute() 호출 : " + this.to);
    }
}
