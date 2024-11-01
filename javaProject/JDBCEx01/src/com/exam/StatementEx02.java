package com.exam;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class StatementEx02 {
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

            // update / delete
            // String sql = String.format("update dept2 set loc='%s' where deptno = '%s'","광주",53);
            String sql = String.format("delete from dept2 where deptno=%s",53);

            // 쿼리 성공 개수
            // update는 보통 1개, delete는 여러 개 일수도 있음
            int result = stmt.executeUpdate(sql);

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
