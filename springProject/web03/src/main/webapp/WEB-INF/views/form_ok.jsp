<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%
    // form_ok.jsp
    out.println("form_ok.jsp<br/>");
    String data = (String) request.getAttribute("data");
    out.println("data : " + data);
%>