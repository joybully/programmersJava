package com.exam;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class PreparedStatementEx02 {
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
            String sql = "update dept2 set loc=? where deptno=?";
            
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,"광주");
            pstmt.setString(2,"61");
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
