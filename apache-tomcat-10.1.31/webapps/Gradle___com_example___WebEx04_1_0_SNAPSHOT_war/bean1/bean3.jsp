<%--
  Created by IntelliJ IDEA.
  User: Baptist
  Date: 2024-11-11
  Time: 오후 3:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:useBean id="to" class="org.example.model.BoardTO"/>
<jsp:setProperty name="to" property="id" value="tester"/>
<jsp:setProperty name="to" property="password" value="1234"/>
<%
  out.println(to.getId() + "<br/>");
  out.println(to.getPassword() + "<br/>");
%>
</body>
</html>
