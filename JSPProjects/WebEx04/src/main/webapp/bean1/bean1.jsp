<%--
  Created by IntelliJ IDEA.
  User: Baptist
  Date: 2024-11-11
  Time: 오후 3:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="org.example.model.BoardTO"%>
<!-- bean1.jsp -->
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
  // org.example.model.BoardTO to = new org.example.model.BoardTO();
  BoardTO to = new BoardTO();
  to.setId("tester");
  to.setPassword("1234");

  out.println(to.getId() + "<br/>");
  out.println(to.getPassword() + "<br/>");
%>
</body>
</html>
