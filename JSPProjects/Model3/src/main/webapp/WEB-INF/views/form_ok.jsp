<%--
  Created by IntelliJ IDEA.
  User: Baptist
  Date: 2024-11-13
  Time: 오전 10:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
form_ok.jsp
<br/><br/>
<%
    String data = (String)request.getAttribute("data");
    out.println("data : " + data);
%>
</body>
</html>
