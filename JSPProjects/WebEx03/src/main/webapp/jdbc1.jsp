<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="javax.naming.Context"%>
<%@ page import="javax.naming.InitialContext"%>
<%@ page import="javax.naming.NamingException"%>

<%@ page import ="javax.sql.DataSource"%>

<%@ page import =" java.sql.Connection"%>
<%@ page import =" java.sql.SQLException"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<!-- jdbc1.jsp -->
<%
    Connection conn = null;

    Context initCtx = new InitialContext();
    // 톰켓의 환경변수 값
    Context envCtx = (Context) initCtx.lookup("java:comp/env");
    // 데이터베이스 풀링에 설정
    DataSource dataSource = (DataSource)envCtx.lookup("jdbc/mariadb1");

    conn = dataSource.getConnection();
    out.println("데이터베이스 연결 성공");

    conn.close();
%>
</body>
</html>
