<%@ page import="java.util.ArrayList" %>
<%@ page import="com.example.zipcode.model.ZipcodeTO" %>
<%@ page import="com.example.zipcode.model.ZipcodeDAO" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%
    ArrayList<ZipcodeTO> lists = (ArrayList<ZipcodeTO>) request.getAttribute("lists");
    StringBuilder sbHtml = new StringBuilder();
    sbHtml.append( "<table border='1' cellspacing='0' width='800'>" );
    for(ZipcodeTO to:lists){
        sbHtml.append("<tr border='1' cellspacing='0'>");
        sbHtml.append("<td>"+to.getZipcode()+"</td>");
        sbHtml.append("<td>"+to.getSido()+"</td>");
        sbHtml.append("<td>"+to.getGugun()+"</td>");
        sbHtml.append("<td>"+to.getDong()+"</td>");
        sbHtml.append("<td>"+to.getRi()+"</td>");
        sbHtml.append("<td>"+to.getBunji()+"</td>");
        sbHtml.append("</tr>");
    }
%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<!-- zipcode_ok.jsp -->
결과 :
</br>
<%= sbHtml.toString() %>
</body>
</html>