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
<!-- list.jsp -->
list.jsp
<br/><br/>
<%
    String file = (String)request.getAttribute( "file" );
%>
업로드목록
<ul>
    <li><%=file%></li>
    <li><a href="download?file=<%=file%>"><%=file%></a></li>
</ul>
</body>
</html>