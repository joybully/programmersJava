<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>

3단 구구단<br />
<%
    out.println( "<table border='1' cellspacing='0' width='800'>" );
    out.println( "<tr>" );
    for( int i=1 ; i<=9 ; i++ ) { 
        out.println( "<td> 3 X " + i + " = " + (3 * i) + "</td>" );
    }
    out.println( "</tr>" );
    out.println( "</table>" );
%>

</body>
</html>