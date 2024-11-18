package com.example.di04;

import org.springframework.context.annotation.Bean;

public class BeanConfig {
    @Bean
    public WriteAction writeAction1(){
        return new WriteAction();
    }

    @Bean
    public WriteAction writeAction2(){
        return new WriteAction(new BoardTO());
    }

    @Bean
    public WriteAction writeAction3(){
        BoardTO boardTO = new BoardTO();
        return new WriteAction(boardTO);
    }

    public BoardTO boardTO(){
        return new BoardTO();
    }

    @Bean
    public WriteAction writeAction4(){
        return new WriteAction(boardTO());
    }
}
