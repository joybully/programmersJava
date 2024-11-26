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
<!-- view.jsp -->
view.jsp
<br/><br/>
<%
    String file = (String)request.getAttribute( "file" );
%>

<img src="/upload/<%=file%>" />
</body>
</html>