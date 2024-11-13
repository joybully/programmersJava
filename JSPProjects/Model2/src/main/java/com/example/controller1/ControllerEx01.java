package com.example.controller1;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(urlPatterns = {"/controller"})
public class ControllerEx01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doProcess(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doProcess(req, resp);
    }

    protected void doProcess(HttpServletRequest req, HttpServletResponse resp){
        try{
            String path = req.getParameter("path");
            String url = "";
            if (path == null || path.equals("view1")) {
                // back-end controller 호출
                View1Action action = new View1Action();
                action.execute(req, resp);
                System.out.println("view1 called");
                url = "/WEB-INF/views/view1.jsp";
            } else if (path.equals("view2")) {
                // back-end controller 호출
                View2Action action = new View2Action();
                action.execute(req, resp);

                System.out.println("view2 called");
                url = "/WEB-INF/views/view2.jsp";
            } else {
                System.out.println("[Error] request URL failed");
                url = "/WEB-INF/views/error.jsp";
            }

            RequestDispatcher dispatcher = req.getRequestDispatcher(url);
            dispatcher.forward(req,resp);
        }catch(ServletException  e){
            System.out.println("[Error] "+e.getMessage());
        }catch(IOException e){
            System.out.println("[Error] "+e.getMessage());
        }
    }
}
