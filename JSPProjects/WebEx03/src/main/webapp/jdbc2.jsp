<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="javax.naming.Context"%>
<%@ page import="javax.naming.InitialContext"%>
<%@ page import="javax.naming.NamingException"%>

<%@ page import ="javax.sql.DataSource"%>

<%@ page import =" java.sql.Connection"%>
<%@ page import =" java.sql.PreparedStatement"%>
<%@ page import =" java.sql.ResultSet"%>
<%@ page import =" java.sql.SQLException"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<!-- jdbc1.jsp -->
<%
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    StringBuilder sbHtml = new StringBuilder();

    try {
        Context initCtx = new InitialContext();
        // 톰켓의 환경변수 값
        Context envCtx = (Context) initCtx.lookup("java:comp/env");
        // 데이터베이스 풀링에 설정
        DataSource dataSource = (DataSource) envCtx.lookup("jdbc/mariadb1");

        conn = dataSource.getConnection();

        String sql = "select deptno, dname, loc from dept";

        pstmt = conn.prepareStatement(sql);

        rs = pstmt.executeQuery();
        sbHtml.append("<table border='1' cellspacing='0'>");
        while(rs.next()){
            sbHtml.append("<tr>");
            sbHtml.append("<td>" + rs.getString("deptno") + "</td>");
            sbHtml.append("<td>" + rs.getString("dname") + "</td>");
            sbHtml.append("<td>" + rs.getString("loc") + "</td>");
            sbHtml.append("</tr>");
        }
        sbHtml.append("</table>");
    } catch(NamingException e){
        System.out.println("[에러] : " + e.getMessage());
    } catch(SQLException e){
        System.out.println("[에러] : " + e.getMessage());
    } finally{
        if(conn!=null) {try{conn.close();} catch(SQLException e){System.out.println("[에러] : " + e.getMessage());}}
    }
%>
<%=sbHtml.toString()%>
</body>
</html>
