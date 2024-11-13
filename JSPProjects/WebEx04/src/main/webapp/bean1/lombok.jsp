<%--
  Created by IntelliJ IDEA.
  User: Baptist
  Date: 2024-11-12
  Time: 오후 12:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="org.example.model.MemberTO"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
  // MemberTO to = new MemberTO("10", "영업부", "부산");
  MemberTO to = new MemberTO("10", "영업부");
  // MemberTO to = new MemberTO();
  //to.setDeptno("10");
  //to.setDname("영업부");
  //to.setLoc("부산");

  out.println(to.getDeptno()+"<br/>");
  out.println(to.getDname()+"<br/>");
  out.println(to.getLoc()+"<br/>");
  out.println(to.toString()+"<br/>");
%>
</body>
</html>
