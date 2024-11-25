<%--
  Created by IntelliJ IDEA.
  User: kevin
  Date: 2024-11-08
  Time: 오후 3:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="javax.naming.Context" %>
<%@ page import="javax.naming.InitialContext" %>
<%@ page import="javax.naming.NamingException" %>

<%@ page import="javax.sql.DataSource" %>

<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.SQLException" %>

<%
    String seq = request.getParameter("seq");

    String subject = request.getParameter("subject");
    String writer = request.getParameter("writer");
    String mail = request.getParameter("mail1") + "@" + request.getParameter("mail2");
    String password = request.getParameter("password");
    String content = request.getParameter("content");

    String wip = request.getRemoteAddr();

    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    // 에러를 감별할 변수
    int flag = 1;

    try {
        Context initCtx = new InitialContext();
        Context envCtx = (Context) initCtx.lookup("java:comp/env");
        DataSource dataSource = (DataSource) envCtx.lookup("jdbc/mariadb1");

        conn = dataSource.getConnection();

        // 부모글의 정보 추출
        String sql = "select grp, grps, grpl from rep_board1 where seq=?";
        pstmt = conn.prepareStatement(sql);
        pstmt.setString(1,seq);

        rs = pstmt.executeQuery();

        int grp = 0;
        int grps = 0;
        int grpl = 0;

        if(rs.next()){
            grp = rs.getInt("grp");
            grps = rs.getInt("grps");
            grpl = rs.getInt("grpl");
        }

        // 업데이트
        sql = "update rep_board1 set grps = grps + 1 where grp=? and grps > ?";
        pstmt = conn.prepareStatement( sql );
        pstmt.setInt( 1, grp );
        pstmt.setInt( 2, grps );

        pstmt.executeUpdate();

        sql = "insert into rep_board1 values ( 0, ?, ?, ?, ?, ?, ?, password( ? ), ?, 0, ?, now() )";
        pstmt = conn.prepareStatement(sql);
        pstmt.setInt( 1, grp );
        pstmt.setInt( 2, grps + 1 );
        pstmt.setInt( 3, grpl + 1 );

        pstmt.setString(4, subject);
        pstmt.setString(5, writer);
        pstmt.setString(6, mail);
        pstmt.setString(7, password);
        pstmt.setString(8, content);
        pstmt.setString(9, wip);

        int result = pstmt.executeUpdate();
        if (result == 1) {
            // 정상
            flag = 0;
        }

        //out.println( "입력 완료" );

    } catch (NamingException e) {
        System.out.println("[에러] " + e.getMessage());
    } catch (SQLException e) {
        System.out.println("[에러] " + e.getMessage());
    } finally {
        if (pstmt != null) pstmt.close();
        if (conn != null) conn.close();
    }

    // 에러 중심의 후처리 = 자바스크립트 중심으로 처리

    out.println("<script type='text/javascript'>");
    if (flag == 0) {
        // 정상
        out.println("alert( '답글쓰기 성공' );");
        out.println("location.href='./board_view1.jsp?seq=" + seq + "';");
    } else {
        // 비정상
        out.println("alert( '글쓰기 실패' );");
        out.println("history.back();");
    }
    out.println("</script>");
%>