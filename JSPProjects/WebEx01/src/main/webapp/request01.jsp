<%--
  Created by IntelliJ IDEA.
  User: Baptist
  Date: 2024-11-07
  Time: 오전 11:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    // 웹서버에 접속한 클라이언트 아이피
    // IPv6 (*) / IPv4
    out.println(request.getRemoteAddr() + "<br/>");
    out.println(request.getContextPath() + "<br/>");
    out.println(request.getRequestURI() + "<br/>");
    out.println(request.getRequestURL() + "<br/>");

    out.println(request.getServerName() + "<br/>");
    out.println(request.getServerPort() + "<br/>");
%>
</body>
</html>
