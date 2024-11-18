package com.example.di06;

import org.springframework.stereotype.Repository;

@Repository("dao")
public class BoardDAO {

    public BoardDAO(){
        System.out.println("BoardDAO() 생성자 호출");
    }
}
