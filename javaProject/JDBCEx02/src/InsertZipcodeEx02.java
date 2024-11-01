import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;

// 우편번호가 적힌 csv파일을
// database에 옮긴다 => 데이터베이스 복구
public class InsertZipcodeEx02 {
    public static void main(String[] args) {

        String url = "jdbc:mariadb://localhost:3306/sample";
        String user = "root";
        String password = "비밀번호";

        Connection conn = null;
        Statement stmt1 = null;
        Statement stmt2 = null;
        // Statement stmt3 = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        BufferedReader br = null;

        String sqlDelete = "drop table if exists zipcode";

        String sqlCreate = "create table if not exists zipcode(" +
                "zipcode char(7) not null," +
                "sido varchar(4) not null," +
                "gugun varchar(17) not null," +
                "dong varchar(26) not null," +
                "ri varchar(45)," +
                "bunji varchar(17)," +
                "seq int(5) unsigned not null)";

        try {
            Class.forName("org.mariadb.jdbc.Driver");
            conn = DriverManager.getConnection(url,user,password);
            stmt1 = conn.createStatement();
            stmt2 = conn.createStatement();
            // stmt3 = conn.createStatement();

            stmt2.executeUpdate(sqlDelete);
            stmt1.executeUpdate(sqlCreate);
            String insertSql = "insert into zipcode values (?,?,?,?,?,?,?)";
            pstmt = conn.prepareStatement(insertSql);

            br = new BufferedReader(new FileReader("c:/java/zipcode_seoul_utf8_type.csv"));
            String line = "";
            while((line=br.readLine())!=null){
                String[] addresses = line.split(",");
                        //String insertSql = String.format("insert into zipcode values ('%s','%s','%s','%s','%s','%s',%s)"
                        //,addresses[0],addresses[1],addresses[2],addresses[3],addresses[4],addresses[5],addresses[6]);
                // System.out.println(insertSql);
                pstmt.setString(1,addresses[0]);
                pstmt.setString(2,addresses[1]);
                pstmt.setString(3,addresses[2]);
                pstmt.setString(4,addresses[3]);
                pstmt.setString(5,addresses[4]);
                pstmt.setString(6,addresses[5]);
                pstmt.setString(7,addresses[6]);
                pstmt.executeUpdate();
                // stmt3.executeUpdate(insertSql);
            }
        } catch (IOException e){
            System.out.println("[에러] : " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("[에러] : " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("[에러] : " + e.getMessage());
        }finally {
            if(br!=null){try{br.close();}catch(IOException e){}}
            if(conn!=null){try{conn.close();}catch(SQLException e){}}
            if(stmt1!=null){try{stmt1.close();}catch(SQLException e){}}
            if(stmt2!=null){try{stmt2.close();}catch(SQLException e){}}
            // if(stmt3!=null){try{stmt3.close();}catch(SQLException e){}}
            if(pstmt!=null){try{pstmt.close();}catch(SQLException e){}}
            if(rs!=null){try{rs.close();}catch(SQLException e){}}
        }
    }
}
