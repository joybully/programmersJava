<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%
%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>
<!-- form.jsp -->
form.jsp
<br/><br/>
<form action="form_ok3" method="post" enctype="multipart/form-data">
    아이디 : <input type="text" name="userid"/><br/>
    비밀번호 : <input type="password" name="userpw"/><br/>
    <br/>
    <input type="file" name="upload"/><br/>
    <br/>
    <input type="submit" value="파일전송"/>
</form>
</body>
</html>