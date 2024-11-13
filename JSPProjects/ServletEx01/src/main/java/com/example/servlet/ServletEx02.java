package com.example.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class ServletEx02 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // System.out.println("service 호출");
        resp.setContentType("text/html;charset=UTF-8");

        StringBuilder sbHtml = new StringBuilder();
        sbHtml.append("<!doctype html");
        sbHtml.append("<html>");
        sbHtml.append("<head>");
        sbHtml.append("<meta charset='UTF-8'/>");
        sbHtml.append("<title>Servlet Example</title>");
        sbHtml.append("</head>");
        sbHtml.append("<body>");
        sbHtml.append("<h1>Servlet Example</h1>");
        sbHtml.append("</body>");
        sbHtml.append("</html>");

        PrintWriter out = resp.getWriter();
        out.println(sbHtml.toString());
        out.close();
    }
}
