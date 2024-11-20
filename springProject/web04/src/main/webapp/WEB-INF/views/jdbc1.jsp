<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    out.println("jdbc1.jsp<br/>");
    String result = (String)request.getAttribute("result");
    out.println("현재시간 : " + result);
%>
<html>
<head>
<title>

</title>
</head>
<body>

</body>
</html>