<%--
  Created by IntelliJ IDEA.
  User: Baptist
  Date: 2024-11-14
  Time: 오전 9:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%
    int flag = (Integer)request.getAttribute("flag");

    out.println("<script type='text/javascript'>");
    if(flag==0){
        // 정상
        out.println("alert('글쓰기 성공');");
        out.println("location.href='./list.do';");
    }else {
        // 비정상
        out.println("alert('글쓰기 실패');");
        out.println("history.back();");
    }
    out.println("</script>");
%>