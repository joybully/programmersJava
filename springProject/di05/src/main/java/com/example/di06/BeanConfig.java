package com.example.di06;

import org.springframework.context.annotation.Bean;

public class BeanConfig {

    @Bean
    public BoardTO boardTO1() {
        BoardTO to = new BoardTO();
        to.setSeq(1);
        to.setSubject("제목 1");
        return to;
    }

    @Bean
    public WriteAction writeAction1() {
        System.out.println("writeAction1() 호출");
        WriteAction writeAction = new WriteAction();
        writeAction.setTo(boardTO1());
        return writeAction;
    }

    @Bean
    public WriteAction writeAction2() {
        System.out.println("writeAction2() 호출");
        BoardTO boardTO = new BoardTO();
        boardTO.setSeq(2);
        boardTO.setSubject("제목 2");

        WriteAction writeAction = new WriteAction();
        writeAction.setTo(boardTO);
        return writeAction;
    }

    @Bean
    public BoardTO boardTO2() {
        BoardTO to = new BoardTO();
        to.setSeq(3);
        to.setSubject("제목 3");
        return to;
    }

    @Bean
    public Action writeAction3(){
        System.out.println("writeAction3() 호출");
        WriteAction writeAction = new WriteAction();
        writeAction.setTo(boardTO2());
        return writeAction;
    }
}
