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
<!-- form023jsp -->
<br/>
<form action="form03_ok.jsp" method="post">
    <input type="radio" name="r" value="사과"/>사과<br/>
    <input type="radio" name="r" value="수박" checked/>수박<br/>
    <input type="radio" name="r" value="딸기"/>딸기<br/>
    <input type="radio" name="r" value="참외"/>참외<br/>
    <br/><br/>
    <select name="sel">
        <option value="사과"/>사과<option/>
        <option value="수박" checked/>수박<option/>
        <option value="딸기"/>딸기<option/>
        <option value="참외"/>참외<option/>
    </select>
    <br/><br/>

    <input type="color" name="color" value="#ff1100"/>

    <br/><br/>
    <input type="submit" value="전송"/>
</form>
</body>
</html>
