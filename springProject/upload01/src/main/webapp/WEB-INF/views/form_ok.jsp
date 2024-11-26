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
<br/><br/>
<%
    String file = (String)request.getAttribute( "file" );
%>

<a href="view?file=<%=file%>">뷰어 바로가기</a>

</body>
</html>