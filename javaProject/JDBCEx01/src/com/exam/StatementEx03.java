package com.exam;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class StatementEx03 {
    public static void main(String[] args) {
        System.out.println("시작");

        String url = "jdbc:mariadb://localhost:3306/sample";
        String user = "root";
        String password = "비밀번호";

        Connection conn = null;
        Statement stmt = null;

        try {
            Class.forName("org.mariadb.jdbc.Driver");
            System.out.println("드라이버 로딩 성공");

            conn = DriverManager.getConnection(url, user, password);
            System.out.println("데이터베이스 연결 성공");

            stmt = conn.createStatement();

            // DDL
            // create / alter/ drop
            // String sql = String.format("create table dept3 ( %s %s, %s %s, %s %s)","deptno", "int(2)","dname","varchar(14)","loc","varchar(13)");
            StringBuilder sb = new StringBuilder();
            sb.append("create table dept4 (");
            sb.append("deptno int(2),");
            sb.append("dname varchar(14),");
            sb.append("loc varchar(13)");
            sb.append(")");
            int result = stmt.executeUpdate(sb.toString());

            System.out.println("쿼리 실행 성공 : " + result);

        } catch (ClassNotFoundException e) {
            System.out.println("[에러] : " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("[에러] : " + e.getMessage());
        } finally {
            if(conn!=null){try {conn.close();}catch(SQLException e){}}
            if(stmt!=null){try {stmt.close();}catch(SQLException e){}}
        }

        System.out.println("끝");
    }
}
