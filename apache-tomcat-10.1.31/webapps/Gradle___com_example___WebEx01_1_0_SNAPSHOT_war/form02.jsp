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
<!-- form02.jsp -->
<form action="form02_ok.jsp" method="post">
    <input type="checkbox" name="cb1" value="사과"/>사과<br/>
    <input type="checkbox" name="cb2" value="수박" checked/>수박<br/>
    <input type="checkbox" name="cb3" value="딸기"/>딸기<br/>
    <input type="checkbox" name="cb4" value="참외"/>참외<br/>
    <br/>
    <input type="checkbox" name="cb" value="사과"/>사과<br/>
    <input type="checkbox" name="cb" value="수박" checked/>수박<br/>
    <input type="checkbox" name="cb" value="딸기"/>딸기<br/>
    <input type="checkbox" name="cb" value="참외"/>참외<br/>
    <br/>
    <input type="submit" value="전송"/>
</form>
<br/>
</body>
</html>
