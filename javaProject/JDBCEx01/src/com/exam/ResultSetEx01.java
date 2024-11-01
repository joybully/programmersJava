package com.exam;


import java.sql.*;


public class ResultSetEx01 {
    public static void main(String[] args) {
        System.out.println("시작");

        String url = "jdbc:mariadb://localhost:3306/sample";
        String user = "root";
        String password = "비밀번호";

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName("org.mariadb.jdbc.Driver");
            System.out.println("드라이버 로딩 성공");

            conn = DriverManager.getConnection(url, user, password);
            System.out.println("데이터베이스 연결 성공");

            stmt = conn.createStatement();

            String sql = "select * from dept2";

            // select 에서는 executeQuery를 쓴다
            rs = stmt.executeQuery(sql);

            /*
            rs.next();
            System.out.println(rs.getString("deptno"));
            System.out.println(rs.getString("dname"));
            System.out.println(rs.getString("loc"));

            rs.next();
            System.out.println(rs.getString("deptno"));
            System.out.println(rs.getString("dname"));
            System.out.println(rs.getString("loc"));
            */

            while(rs.next()){
                System.out.print(rs.getString("deptno") + "\t");
                System.out.print(rs.getString("dname")+ "\t");
                System.out.println(rs.getString("loc")+ "\t");
            }

        } catch (ClassNotFoundException e) {
            System.out.println("[에러] : " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("[에러] : " + e.getMessage());
        } finally {
            if(conn!=null){try {conn.close();}catch(SQLException e){}}
            if(stmt!=null){try {stmt.close();}catch(SQLException e){}}
            if(rs!=null){try {rs.close();}catch(SQLException e){}}
        }

        System.out.println("끝");
    }
}
