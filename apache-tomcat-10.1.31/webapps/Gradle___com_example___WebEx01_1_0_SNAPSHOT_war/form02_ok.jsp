<%@ page import="java.util.Arrays" %><%--
  Created by IntelliJ IDEA.
  User: Baptist
  Date: 2024-11-07
  Time: 오후 2:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<!-- form02_ok.jsp-->
<%
    String cb1 = request.getParameter("cb1");
    String cb2 = request.getParameter("cb2");
    String cb3 = request.getParameter("cb3");
    String cb4 = request.getParameter("cb4");
    out.println(cb1 + "<br/>");
    out.println(cb2 + "<br/>");
    out.println(cb3 + "<br/>");
    out.println(cb4 + "<br/>");
    out.println("<br/>");
/*
    String cb = request.getParameter("cb");
    out.println(cb + "<br/>");*/
    String[] arrCb = request.getParameterValues("cb");
    // out.println(Arrays.toString(arrCb));
    if (arrCb == null) {
        out.println("선택 안됨");
    } else {
        for (String cb : arrCb) {
            out.println(cb + "<br/>");
        }
    }
%>
</body>
</html>
