package com.example.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class GugudanServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doProcess(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doProcess(req, resp);
    }

    protected void doProcess(HttpServletRequest req, HttpServletResponse resp){
        // System.out.println("gugudanservlet called");
        try {
            resp.setContentType("text/html; charset=UTF-8");

            StringBuilder sbHtml = new StringBuilder();
            sbHtml.append("<!DOCTYPE html>");
            sbHtml.append("<html>");
            sbHtml.append("<head>");
            sbHtml.append("<meta charset='UTF-8'/>");
            sbHtml.append("</head>");
            sbHtml.append("<body>");
            sbHtml.append("<form action='./gugudan_ok' method='post'>");
            sbHtml.append("구구단 : <input type='text' name='dan'>");
            sbHtml.append("<input type='submit' value='구구단 출력'>");
            sbHtml.append("</form>");
            sbHtml.append("</body>");
            sbHtml.append("</html>");

            PrintWriter out = resp.getWriter();
            out.print(sbHtml.toString());
            out.close();
        } catch(IOException e){
            System.out.println("[에러] : " + e.getMessage());
        }

    }
}
