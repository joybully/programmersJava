<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%
    StringBuilder sbHtml = new StringBuilder();

    sbHtml.append( "<table border='1' cellspacing='0' width='800'>" );
    sbHtml.append( "<tr>" );
    for( int i=1 ; i<=9 ; i++ ) { 
        sbHtml.append( "<td> 3 X " + i + " = " + (3 * i) + "</td>" );
    }
    sbHtml.append( "</tr>" );
    sbHtml.append( "</table>" );

    //out.println( sbHtml.toString() );
%>

<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>

3단 구구단<br />
<%= sbHtml.toString() %>

</body>
</html>