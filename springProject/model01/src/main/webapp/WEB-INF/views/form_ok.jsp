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
<!-- form_ok.jsp -->
form_ok.jsp
<br/>
<%
    out.println("userid : " + (String)request.getAttribute("userid")+"<br/>");
    out.println("userpw : " + (String)request.getAttribute("userpw")+"<br/>");
%>
</body>
</html>