<%--
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
<!-- form01_ok.jsp-->
<%
    // apache-tomcat 9 이전 버전
    // 다국어 처리 request.setCharacterEncoding("utf-8");

    String data1 = request.getParameter("data1");
    String data2 = request.getParameter("data2");
    out.println(data1 + "<br/>");
    out.println(data2 + "<br/>");
%>
</body>
</html>
