import java.sql.*;
import java.util.Scanner;

// 우편번호가 적힌 csv파일을
// database에 옮긴다 => 데이터베이스 복구
public class ZipcodeSearchEx01 {
    public static void main(String[] args) {

        String url = "jdbc:mariadb://localhost:3306/sample";
        String user = "root";
        String password = "비밀번호";

        Connection conn = null;
        Statement stmt1 = null;
        Statement stmt2 = null;
        ResultSet rs = null;
        Scanner sc = new Scanner(System.in);

        try {
            Class.forName("org.mariadb.jdbc.Driver");
            conn = DriverManager.getConnection(url,user,password);
            while(true){
                stmt1 = conn.createStatement();
                System.out.print("동을 두 자리 이상 입력하시오 >");
                String input = sc.nextLine();
                if(input.length()<=1) continue;

                // java에서 입력 검사
                String selectSql = "select * from zipcode";
                rs = stmt1.executeQuery(selectSql);
                while(rs.next()){
                    String zipcode = rs.getString("zipcode");
                    String sido = rs.getString("sido");
                    String gugun = rs.getString("gugun");
                    String dong = rs.getString("dong");
                    String ri = rs.getString("ri");
                    String bunji = rs.getString("bunji");
                    String seq = rs.getString("seq");
                    if(dong.startsWith(input)) {
                        System.out.println(String.format("%s %s %s %s %s %s %s",zipcode,sido,gugun,dong,ri,bunji,seq));
                    }
                }

                // sql에서 입력 필터링
                stmt2 = conn.createStatement();
                String betterSql = "select zipcode, sido, gugun, dong, ri, bunji from zipcode where dong like '"+input+"%'";
                rs = stmt2.executeQuery(betterSql);
                while(rs.next()){
                    String zipcode = rs.getString("zipcode");
                    String sido = rs.getString("sido");
                    String gugun = rs.getString("gugun");
                    String dong = rs.getString("dong");
                    String ri = rs.getString("ri");
                    String bunji = rs.getString("bunji");
                    System.out.printf("[%s] %s %s %s %s %s%n",zipcode,sido,gugun,dong,ri,bunji);
                }
            }
        } catch (ClassNotFoundException e) {
            System.out.println("[에러] : " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("[에러] : " + e.getMessage());
        }finally {
            if(conn!=null){try{conn.close();}catch(SQLException e){}}
            if(stmt1!=null){try{stmt1.close();}catch(SQLException e){}}
            if(stmt2!=null){try{stmt2.close();}catch(SQLException e){}}
            if(rs!=null){try{rs.close();}catch(SQLException e){}}
        }
    }
}
