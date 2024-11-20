package com.example.jdbc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.*;

@SpringBootApplication
public class Jdbc01Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Jdbc01Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        String url = "jdbc:mariadb://localhost:3306/mysql";
        String user = "root";
        String password = "!123456";

        // 데이터베이스에서 현재 시간을 얻어오는 프로그램

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            Class.forName("org.mariadb.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);

            String sql = "select now() as now";
            pstmt = conn.prepareStatement(sql);

            rs = pstmt.executeQuery();

            if (rs.next()) {
                System.out.println("Current Time : " + rs.getString("now"));
            }
        } catch (ClassNotFoundException e) {
            System.out.println("[Error] : " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("[Error] : " + e.getMessage());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                }
            }
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                }
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                }
            }
        }
    }
}
