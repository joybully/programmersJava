package com.example.controller;

import com.example.model3.*;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(urlPatterns = {"/controller"})
public class ControllerEx02 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doProcess(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doProcess(req, resp);
    }

    protected void doProcess(HttpServletRequest req, HttpServletResponse resp){
        try {
            String path = req.getParameter("path");
            String url = "";
            Action action = null;
            if (path == null || path.equals("form")) {
                action = new FormAction();
                action.execute(req, resp);
                url = "/WEB-INF/views/form.jsp";
            } else if (path.equals("form_ok")) {
                action = new FormOkAction();
                action.execute(req, resp);
                url = "/WEB-INF/views/form_ok.jsp";
            } // 우편번호 검색기
            else if(path.equals("zipcode")){
                action = new ZipcodeAction();
                action.execute(req, resp);
                url = "/WEB-INF/views/zipcode.jsp";
            } else if(path.equals("zipcode_ok")){
                action = new ZipcodeOkAction();
                action.execute(req, resp);
                url = "/WEB-INF/views/zipcode_ok.jsp";
            }
            RequestDispatcher dispatcher = req.getRequestDispatcher(url);
            dispatcher.forward(req, resp);
        } catch(ServletException e){
            System.out.println("[Error] " + e.getMessage());
        } catch (IOException e){
            System.out.println("[Error] " + e.getMessage());
        }
    }
}
