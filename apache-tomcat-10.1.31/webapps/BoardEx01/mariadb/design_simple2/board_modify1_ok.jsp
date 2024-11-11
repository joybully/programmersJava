<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file="import.jsp"%>

<%
    String subject = request.getParameter("subject");
    String content = request.getParameter("content");
    String mail = request.getParameter("mail1") + "@" + request.getParameter("mail2");
    String seq = request.getParameter("seq");
    String password = request.getParameter("password");

    Connection conn = null;
    PreparedStatement pstmt = null;

    // 에러를 감별할 변수
    int flag = 2;
    try {
        Context initCtx = new InitialContext();
        Context envCtx = (Context) initCtx.lookup("java:comp/env");
        DataSource dataSource = (DataSource) envCtx.lookup("jdbc/mariadb1");

        conn = dataSource.getConnection();

        // 비밀번호는 select 하지 않음
        String sql = "update board1 set subject=?, content=?, mail=? where seq=? and password=password(?)";
        pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, subject);
        pstmt.setString(2, content);
        pstmt.setString(3, mail);
        pstmt.setString(4, seq);
        pstmt.setString(5, password);

        int result = pstmt.executeUpdate();
        if(result ==0){
            // 비밀번호가 오류
            flag = 1;
        }else if(result==1){
            // 정상
            flag = 0;
        }

    } catch (NamingException e){
        System.out.println("[에러] : " + e.getMessage());
    } catch (SQLException e){
        System.out.println("[에러] : " + e.getMessage());
    } finally {
        if(conn!=null){try{conn.close();} catch (SQLException e){}}
        if(pstmt!=null){try{pstmt.close();} catch (SQLException e){}}
    }

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