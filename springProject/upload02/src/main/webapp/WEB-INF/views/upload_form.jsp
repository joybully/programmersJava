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
<!-- upload_upload_form.jsp -->
upload_form.jsp
<br/><br/>
<form action="upload_ok" method="post" enctype="multipart/form-data">
    아이디 : <input type="text" name="userid"/><br/>
    비밀번호 : <input type="password" name="userpw"/><br/>
    <br/>
    <input type="file" name="upload"/><br/>
    <br/>
    <input type="submit" value="파일전송"/>
</form>
</body>
</html>