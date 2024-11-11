<%--
  Created by IntelliJ IDEA.
  User: Baptist
  Date: 2024-11-08
  Time: 오전 11:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.SQLException" %>
<%

    // 전송값 검사
    StringBuilder sbHtml = new StringBuilder();
    if (request.getParameter("dong") != null) {

        String strDong = request.getParameter("dong");

        String url = "jdbc:mariadb://localhost:3306/sample";
        String user = "root";
        String password = "!123456";

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);
            String sql = "select zipcode, sido, gugun, dong, ri, bunji from zipcode where dong like ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, strDong + "%");

            rs = pstmt.executeQuery();

            sbHtml.append("<table border='1' cellspacing='0'>");
            while (rs.next()) {
                sbHtml.append("<tr>");
                sbHtml.append("<td>" + rs.getString("zipcode") + "</td>");
                sbHtml.append("<td>" + rs.getString("sido") + "</td>");
                sbHtml.append("<td>" + rs.getString("gugun") + "</td>");
                sbHtml.append("<td>" + rs.getString("dong") + "</td>");
                sbHtml.append("<td>" + rs.getString("ri") + "</td>");
                sbHtml.append("<td>" + rs.getString("bunji") + "</td>");
                sbHtml.append("</tr>");
            }
            sbHtml.append("</table>");
        } catch (ClassNotFoundException e) {
            System.out.println("[에러] : " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("[에러] : " + e.getMessage());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    System.out.println("[에러] : " + e.getMessage());
                }
            }
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    System.out.println("[에러] : " + e.getMessage());
                }
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    System.out.println("[에러] : " + e.getMessage());
                }
            }
        }
    }
%>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript">
        const checkfrm = function () {
            // alert("checkfrm() 호출");
            // 입력값 검사
            // 필수입력항목 검사
            // if(document.frm.dong.value == ''){
            // 입력 길이 검사
            if (document.frm.dong.value.trim().length < 2) {
                alert('2자 이상의 동이름을 입력하셔야 합니다.');
                return false;
            }
            // alert('정상');
            document.frm.submit();
        };
    </script>
</head>
<body>
<!-- zipcode1.jsp-->

<form action="zipcode.jsp" method="post" name="frm">
    동이름 입력 <input type="text" name="dong" maxlength="5"/>
    <input type="button" value="동이름 검색" onclick="checkfrm()"/>
</form>
<hr/>
<%=sbHtml.toString()%>
</body>
</html>
