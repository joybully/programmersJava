package com.example.model2;

public class WriteAction {
    private BoardTO to;
    private WriteAction(){
        System.out.println("WriteAction() 생성자 호출");
        this.to = new BoardTO();
    }

    public WriteAction(BoardTO to) {
        System.out.println("WriteAction(BoardTO to) 생성자 호출");
        this.to = to;
    }

    public void excute(){
        System.out.println("execute() 호출 : " + to);
    }
}
