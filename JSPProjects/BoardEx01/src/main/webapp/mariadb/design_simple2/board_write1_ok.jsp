<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file="import.jsp"%>
<%
    String subject = request.getParameter("subject");
    String writer = request.getParameter("writer");
    String mail = request.getParameter("mail") + "@" + request.getParameter("mail2");
    String password = request.getParameter("password");
    String content = request.getParameter("content");

    String wip = request.getRemoteAddr();

    Connection conn = null;
    PreparedStatement pstmt = null;
    int flag = 1;
    try {
        Context initCtx = new InitialContext();
        Context envCtx = (Context) initCtx.lookup("java:comp/env");
        DataSource dataSource = (DataSource) envCtx.lookup("jdbc/mariadb1");

        conn = dataSource.getConnection();

        String sql = "insert into board1 values(0, ?, ?, ?, password(?), ?, 0, ?, now())";
        pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, subject);
        pstmt.setString(2, writer);
        pstmt.setString(3, mail);
        pstmt.setString(4, password);
        pstmt.setString(5, content);
        pstmt.setString(6, wip);

        int result = pstmt.executeUpdate();
        if(result ==1){
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
        out.println("alert('글쓰기 성공');");
        out.println("location.href='./board_list1.jsp';");
    }else {
        // 비정상
        out.println("alert('글쓰기 실패');");
        out.println("history.back();");
    }
    out.println("</script>");
%>