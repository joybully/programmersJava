<%@ page import="java.util.Arrays" %><%--
  Created by IntelliJ IDEA.
  User: Baptist
  Date: 2024-11-07
  Time: 오후 2:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<!-- form03_ok.jsp-->
<%
    String r = request.getParameter("r");
    out.println(r + "<br/>");
    out.println("<br/>");

    String sel = request.getParameter("sel");
    out.println(sel + "<br/>");
    out.println("<br/>");

    String color = request.getParameter("color");
    out.println(color + "<br/>");
    out.println("<br/>");
%>
</body>
</html>
