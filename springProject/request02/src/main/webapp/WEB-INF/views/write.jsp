<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%
%>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>
<!-- write.jsp -->
write.jsp
</br>
<form action="./write_ok" method="get">
    데이터 : <input type="text" name="data"/>
    <input type="submit" value="Get 방식 전송"/>
</form>
<form action="./write_ok" method="post">
    데이터 : <input type="text" name="data"/>
    <input type="submit" value="Post 방식 전송"/>
</form>
</body>
</html>