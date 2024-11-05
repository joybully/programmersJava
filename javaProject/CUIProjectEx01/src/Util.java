import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;

// 우편번호가 적힌 csv파일을
// database에 옮긴다 => 데이터베이스 복구
public class Util {


    public String selectMember(){
        String url = "jdbc:mariadb://localhost:3306/sample";
        String user = "root";
        String password = "!123456";

        Connection conn = null;
        // PreparedStatement psmt = null;
        Statement stmt1 = null;
        ResultSet rs = null;
        int person = 0;

        StringBuilder result = new StringBuilder();
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            conn = DriverManager.getConnection(url,user,password);
            stmt1 = conn.createStatement();
            String selectSql = "select userNo, userName, userPhone, userEmail, userGroup, userBirth, userRoll from user";
            rs = stmt1.executeQuery(selectSql);
            while(rs.next()){
                person++;
                String userNo = rs.getString("userNo");
                String userName = rs.getString("userName");
                String userPhone = rs.getString("userPhone");
                String userEmail = rs.getString("userEmail");
                String userGroup = rs.getString("userGroup");
                String userBirth = rs.getString("userBirth");
                String userRoll = rs.getString("userRoll");
                result.append(String.format("%5s",userNo)).append(String.format("%6s",userName))
                        .append(String.format("%16s",userPhone)).append(String.format("%18s",userEmail))
                        .append(String.format("%7s",userGroup)).append(String.format("%14s",userBirth)).append(String.format("%13s",userRoll)).append("\n");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("[에러] : " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("[에러] : " + e.getMessage());
        }finally {
            if(conn!=null){try{conn.close();}catch(SQLException e){}}
            if(stmt1!=null){try{stmt1.close();}catch(SQLException e){}}
            // if(pstmt!=null){try{pstmt.close();}catch(SQLException e){}}
            if(rs!=null){try{rs.close();}catch(SQLException e){}}
        }
        result.append(String.format("총%2d명 =======================================================================================\n",person));
        return result.toString();
    }
}// create table if not exists user(userNo varchar(5) not null,userName varchar(3) not null,userPhone varchar(13) not null,userEmail varchar(26) not null,userGroup varchar(4),userBirth varchar(10),userRoll varchar(10));
