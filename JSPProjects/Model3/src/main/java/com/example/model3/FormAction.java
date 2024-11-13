package com.example.model3;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FormAction implements Action{
    public void execute(HttpServletRequest req, HttpServletResponse resp){
        System.out.println("Action called");
    }
}
