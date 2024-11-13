<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%
    String seq = (String)request.getAttribute("seq");
    int flag = (Integer)request.getAttribute("flag");
    // 에러 중심의 후처리 => 자바스크립트 중심으로 처리

    out.println("<script type='text/javascript'>");
    if(flag==0){
        // 정상
        out.println("alert('글수정 성공');");
        out.println("location.href='./controller?path=view&seq="+seq+"';");
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