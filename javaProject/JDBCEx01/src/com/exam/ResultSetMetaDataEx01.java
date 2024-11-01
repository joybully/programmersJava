package com.exam;

import java.sql.*;

public class ResultSetMetaDataEx01 {
    public static void main(String[] args) {
        String url = "jdbc:mariadb://localhost:3306/sample";
        String user = "root";
        String password = "비밀번호";

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            Class.forName("org.mariadb.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);

            // String sql = "select * from emp";
            String sql = "select empno, ename, sal, hiredate from emp";
            pstmt = conn.prepareStatement(sql);

            rs = pstmt.executeQuery();

            ResultSetMetaData resultSetMetaData = rs.getMetaData();
            System.out.println(resultSetMetaData.getColumnCount());

            for(int i=1;i<=resultSetMetaData.getColumnCount();i++){
                System.out.print(resultSetMetaData.getColumnName(i)+"\t");
                System.out.print(resultSetMetaData.getColumnTypeName(i)+"\t");
                System.out.print(resultSetMetaData.getColumnDisplaySize(i)+"\n");
            }

        } catch (SQLException e) {
            System.out.println("[에러] : " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("[에러] : " + e.getMessage());
        } finally {
            if(conn!=null){try{conn.close();}catch(SQLException e){}}
            if(pstmt!=null){try{pstmt.close();}catch(SQLException e){}}
            if(rs!=null){try{rs.close();}catch(SQLException e){}}
        }
    }
}
