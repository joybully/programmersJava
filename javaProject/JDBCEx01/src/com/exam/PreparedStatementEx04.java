package com.exam;


import java.sql.*;


public class PreparedStatementEx04 {
    public static void main(String[] args) {
        System.out.println("시작");

        String url = "jdbc:mariadb://localhost:3306/sample";
        String user = "root";
        String password = "비밀번호";

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            Class.forName("org.mariadb.jdbc.Driver");

            conn = DriverManager.getConnection(url, user, password);

            // ?는 값만 가능
            String sql = "select empno, ename, sal from emp where ename like ?";

            pstmt = conn.prepareStatement(sql);

            pstmt.setString(1,"%co%");

            rs = pstmt.executeQuery();
            while(rs.next()){
                String empno = rs.getString("empno");
                String ename = rs.getString("ename");
                String sal = rs.getString("sal");
                System.out.println(empno + "\t" + ename + "\t" + sal);
            }
            
        } catch (ClassNotFoundException e) {
            System.out.println("[에러] : " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("[에러] : " + e.getMessage());
        } finally {
            if(conn!=null){try {conn.close();}catch(SQLException e){}}
            if(pstmt!=null){try {pstmt.close();}catch(SQLException e){}}
            if(rs!=null){try {rs.close();}catch(SQLException e){}}
        }

        System.out.println("끝");
    }
}
