<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%
    out.println( "<!DOCTYPE html>" );
    out.println( "<html lang='ko'>" );
    out.println( "<head>" );
    out.println( "<meta charset='UTF-8'>" );
    out.println( "<meta name='viewport' content='width=device-width, initial-scale=1.0'>" );
    out.println( "<title>Document</title>" );
    out.println( "</head>" );
    out.println( "<body>" );

    out.println( "Hello JSP<br />" );

    // 로그 출력
    System.out.println( "Hello JSP" );

    // html 출력
    out.println( "<b>Hello JSP</b>" );
    out.println( "</body>" );
    out.println( "</html>" );
%>