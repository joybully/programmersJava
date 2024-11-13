package com.example.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class ServletEx01 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // System.out.println("service 호출");
        resp.setContentType("text/html;charset=UTF-8");

        PrintWriter out = resp.getWriter();
        out.println("<!doctype html");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'/>");
        out.println("<title>Servlet Example</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Servlet Example</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}
