package com.example.model3;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FormOkAction implements Action {
    public void execute(HttpServletRequest req, HttpServletResponse resp){
        System.out.println("FormOkAction called");
        System.out.println("data : " + req.getParameter("data"));

        // view page로 데이터 전송
        req.setAttribute("data", req.getParameter("data"));
    }
}
