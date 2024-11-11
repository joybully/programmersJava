<%--
  Created by IntelliJ IDEA.
  User: Baptist
  Date: 2024-11-08
  Time: 오전 10:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ page import="java.sql.DriverManager"%>
<%@ page import="java.sql.Connection"%>
<%@ page import="java.sql.PreparedStatement"%>
<%@ page import="java.sql.ResultSet"%>
<%@ page import="java.sql.SQLException"%>
<%
    // 연결 정보
    String url = "jdbc:mariadb://localhost:3306/sample";
    String user = "root";
    String password = "!123456";

    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    StringBuilder sbHtml = new StringBuilder();
    try {
        // 드라이버 로딩
        Class.forName("org.mariadb.jdbc.Driver");
        // 데이터베이스 연결
        conn = DriverManager.getConnection(url, user, password);
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
    } catch (ClassNotFoundException e) {
        System.out.println("[에러] : " + e.getMessage());
    } catch (SQLException e) {
        System.out.println("[에러] : " + e.getMessage());
    } finally {
        // 데이터베이스 연결 종료
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                System.out.println("[에러] : "+ e.getMessage());
            }
        }
        if(pstmt!=null){
            try{pstmt.close();}catch(SQLException e){
                System.out.println("[에러] : "+ e.getMessage());
            }
        }
        if(rs!=null){
            try{rs.close();}catch(SQLException e){
                System.out.println("[에러] : "+ e.getMessage());
            }
        }
    }
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%= sbHtml.toString()%>
</body>
</html>