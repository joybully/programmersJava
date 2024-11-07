<%--
  Created by IntelliJ IDEA.
  User: Baptist
  Date: 2024-11-07
  Time: 오전 11:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.Date"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
  java.util.Date date = new java.util.Date();
  out.println(date.toLocaleString());
%>
</body>
</html>
