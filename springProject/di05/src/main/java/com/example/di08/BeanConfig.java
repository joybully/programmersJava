package com.example.di08;

import org.springframework.context.annotation.Bean;

public class BeanConfig {
    @Bean
    public BoardDAO dao(){
        return new BoardDAO();
    }

/*    @Bean
    public WriteAction writeAction(){
        return new WriteAction();
    }*/

    @Bean
    public WriteAction writeAction(BoardDAO dao) {
        // dao의 new가 없다
        return new WriteAction(dao);
    }
}
