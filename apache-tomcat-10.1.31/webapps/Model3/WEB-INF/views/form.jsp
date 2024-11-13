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
form.jsp
<br/>

<form action="./controller" method="get">
    <input type="hidden" name="path" value="form_ok"/>
    데이터 : <input type="text" name="data"/>
    <input type="submit" value="전송"/>
</form>

<form action="./controller" method="post">
    <input type="hidden" name="path" value="form_ok"/>
    데이터 : <input type="text" name="data"/>
    <input type="submit" value="전송"/>
</form>

</body>
</html>
