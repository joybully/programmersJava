<%--
  Created by IntelliJ IDEA.
  User: Baptist
  Date: 2024-11-11
  Time: 오후 2:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
  int i=10;
%>
Hello JSP 1<br/>
<%@include file="sub3.jsp"%>
<%
  out.println("i = " + i + "<br/>");
%>
Hello JSP 4<br/>
<%@include file="sub4.jsp"%>
Hello JSP 7<br/>
</body>
</html>
