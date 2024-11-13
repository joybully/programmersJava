<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="org.example.model.BoardTO" %>
<%@ page import="org.example.model.BoardDAO" %>

<%
    BoardTO to = new BoardTO();
    to.setSubject(request.getParameter("subject"));
    to.setWriter(request.getParameter("writer"));
    to.setMail(request.getParameter("mail1") + "@" + request.getParameter("mail2"));
    to.setPassword(request.getParameter("password"));
    to.setContent(request.getParameter("content"));
    to.setWip(request.getRemoteAddr());

    BoardDAO dao = new BoardDAO();
    int flag = dao.boardWriteOk(to);
    // 에러 중심의 후처리 => 자바스크립트 중심으로 처리

    out.println("<script type='text/javascript'>");
    if(flag==0){
        // 정상
        out.println("alert('글쓰기 성공');");
        out.println("location.href='./board_list1.jsp';");
    }else {
        // 비정상
        out.println("alert('글쓰기 실패');");
        out.println("history.back();");
    }
    out.println("</script>");
%>