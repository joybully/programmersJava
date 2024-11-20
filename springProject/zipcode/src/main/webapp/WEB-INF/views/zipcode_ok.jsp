<%@ page import="com.example.zipcode.model.ZipcodeTO" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    out.println("검색결과"+"</br>");
    String lists = (String)request.getAttribute("result");
    String[] result = lists.split("#");
    for(String line : result){
        out.println(line+"</br>");
    }
%>