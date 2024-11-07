<%--
  Created by IntelliJ IDEA.
  User: Baptist
  Date: 2024-11-07
  Time: 오후 2:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String startDan = request.getParameter( "startdan" );
    String endDan = request.getParameter( "enddan" );
    //System.out.println( startDan + ":" + endDan );

    int iStartDan = Integer.parseInt( startDan );
    int iEndDan = Integer.parseInt( endDan );
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<!-- gugudan3_ok -->
<%
    out.println( "<table border='1' cellspacing='0'>" );
    for( int i=iStartDan ; i<=iEndDan ; i++ ) {
        out.println( "<tr>" );
        for( int j=1 ; j<=9 ; j++ ) {
            out.println( "<td>" + i + " X " + j + " = " + (i*j)+ "</td>" );
        }
        out.println( "</tr>" );
    }
    out.println( "</table>" );
%>
<form action="gugudan3
.jsp" method="get">
    <input type="submit" value="이전페이지로 가기"/>
</form>
</body>
</html>
