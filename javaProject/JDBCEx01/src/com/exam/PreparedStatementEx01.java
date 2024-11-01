package com.exam;


import java.sql.*;


public class PreparedStatementEx01 {
    public static void main(String[] args) {
        System.out.println("시작");

        String url = "jdbc:mariadb://localhost:3306/sample";
        String user = "root";
        String password = "비밀번호";

        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            Class.forName("org.mariadb.jdbc.Driver");

            conn = DriverManager.getConnection(url, user, password);

            // ?는 값만 가능
            String sql = "insert into dept2 values(?,?,?)";

            // sql parameter로 들어간다
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1,61);
            pstmt.setString(2,"영업부");
            pstmt.setString(3,"서울");

            //sql parameter로 안들어간다
            int result = pstmt.executeUpdate();
            
        } catch (ClassNotFoundException e) {
            System.out.println("[에러] : " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("[에러] : " + e.getMessage());
        } finally {
            if(conn!=null){try {conn.close();}catch(SQLException e){}}
            if(pstmt!=null){try {pstmt.close();}catch(SQLException e){}}
        }

        System.out.println("끝");
    }
}
