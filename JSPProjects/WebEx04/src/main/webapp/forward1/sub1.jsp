<%--
  Created by IntelliJ IDEA.
  User: Baptist
  Date: 2024-11-11
  Time: 오후 2:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
Hello JSP4<br/>
Hello JSP5<br/>
<%
    String data1 = request.getParameter("data1");
    String data2 = request.getParameter("data2");
    out.println("data1 = " + data1 + "<br/>");
    out.println("data2 = " + data2 + "<br/>");
%>
</body>
</html>
