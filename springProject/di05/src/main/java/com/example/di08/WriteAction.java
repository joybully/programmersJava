package com.example.di08;

import org.springframework.beans.factory.annotation.Autowired;

public class WriteAction {
    private BoardDAO dao;

    // 생성자
    @Autowired
    public WriteAction(BoardDAO dao){
        System.out.println("WriteAction(BoardDAO dao) 생성자 호출");
        this.dao = dao;
    }

    public WriteAction(){
        System.out.println("WriteAction() 생성자 호출");
    }

    public void getDao(){
        System.out.println("dao : " + dao);
    }
}
