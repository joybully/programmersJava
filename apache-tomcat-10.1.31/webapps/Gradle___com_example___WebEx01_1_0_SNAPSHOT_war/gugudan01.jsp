<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%
  StringBuilder sbHtml = new StringBuilder();

  sbHtml.append( "<table border='1' cellspacing='0' width='800'>" );

  for ( int dan=0 ; dan<=9 ; dan++ ) {
    if( dan % 2 == 0 ) {
      sbHtml.append( "<tr bgcolor='yellow'>" );
    } else {
      sbHtml.append( "<tr bgcolor='orange'>" );
    }

    for ( int i=0 ; i<=9 ; i++ ) {
      if( dan == 0 && i == 0 ) {
        sbHtml.append( "<td></td>" );
      } else if ( dan == 0 ) {
        sbHtml.append( "<td> X " + i + "</td>" );
      } else if ( i == 0 ) {
        sbHtml.append( "<td>" + dan + "단</td>" );
      } else {
        sbHtml.append( "<td>" + dan +" X " + i + " = " + (dan * i) + "</td>" );
      }
    }
    sbHtml.append( "</tr>" );
  }

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