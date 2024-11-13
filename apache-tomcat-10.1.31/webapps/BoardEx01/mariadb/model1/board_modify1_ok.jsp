<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="org.example.model.BoardDAO" %>
<%@ page import="org.example.model.BoardTO" %>

<%
    BoardTO to = new BoardTO();
    to.setSeq(request.getParameter("seq"));
    to.setSubject(request.getParameter("subject"));
    to.setMail(request.getParameter("mail1")+"@"+request.getParameter("mail2"));
    to.setPassword(request.getParameter("password"));
    to.setContent(request.getParameter("content"));

    BoardDAO dao = new BoardDAO();
    int flag = dao.boardModifyOk(to);

    String seq = to.getSeq();
    // 에러 중심의 후처리 => 자바스크립트 중심으로 처리

    out.println("<script type='text/javascript'>");
    if(flag==0){
        // 정상
        out.println("alert('글수정 성공');");
        out.println("location.href='./board_view1.jsp?seq="+seq+"';");
    }else if(flag==1){
        out.println("alert('비밀번호 오류');");
        out.println("history.back();");
    }else {
        // 비정상
        out.println("alert('글수정 실패');");
        out.println("history.back();");
    }
    out.println("</script>");
%>