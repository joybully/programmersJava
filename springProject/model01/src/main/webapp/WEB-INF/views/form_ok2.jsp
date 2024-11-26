<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="com.example.model.dto.FormTO" %>
<%
%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>
<!-- form_ok2.jsp -->
form_ok2.jsp
<br/>
<%
    FormTO to = (FormTO)request.getAttribute("to");
    out.println("userid : " + to.getUserid() + "<br/>");
    out.println("userpw : " + to.getUserpw() + "<br/>");
%>
</body>
</html>
