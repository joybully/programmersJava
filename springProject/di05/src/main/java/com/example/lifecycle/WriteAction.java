package com.example.lifecycle;

public class WriteAction implements Action {

    public WriteAction() {
        System.out.println("WriteAction() 생성자 호출");
    }
    
    @Override
    public void execute(){
        System.out.println("execute() 실행");
    }

    public void init_method(){
        System.out.println("init_method() 호출");
    }

    public void destroy_method(){
        System.out.println("destroy_method() 호출");
    }
}
