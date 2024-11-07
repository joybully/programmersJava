import java.io.BufferedReader;
import java.sql.*;

// 우편번호가 적힌 csv파일을
// database에 옮긴다 => 데이터베이스 복구
public class Util {


    public String selectMember(){
        String url = "jdbc:mariadb://localhost:3306/sample";
        String user = "root";
        String password = "!123456";

        Connection conn = null;
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
            if(rs!=null){try{rs.close();}catch(SQLException e){}}
        }
        result.append(String.format("총%2d명 =======================================================================================\n",person));
        return result.toString();
    }

    public String insertMember(String userName, String userPhone, String userEmail, String userGroup, String userBirth){
        String url = "jdbc:mariadb://localhost:3306/sample";
        String user = "root";
        String password = "!123456";

        Connection conn = null;
        PreparedStatement pstmt = null;
        String result;

        try {
            Class.forName("org.mariadb.jdbc.Driver");
            conn = DriverManager.getConnection(url,user,password);
            String insertSql = "insert into user values (null,?,?,?,?,?,date_format(now(),'%Y-%m-%d'))";
            pstmt = conn.prepareStatement(insertSql);

            pstmt.setString(1,userName);
            pstmt.setString(2,userPhone);
            pstmt.setString(3,userEmail);
            pstmt.setString(4,userGroup);
            pstmt.setString(5,userBirth);
            pstmt.executeUpdate();
            result = "회원정보를 정상적으로 등록하였습니다.";

        } catch (ClassNotFoundException e) {
            result = "회원정보등록에 실패했습니다";
        } catch (SQLException e) {
            result = "회원정보등록에 실패했습니다";
        }finally {
            if(pstmt!=null){try{pstmt.close();}catch(SQLException e){}}
            if(conn!=null){try{conn.close();}catch(SQLException e){}}
        }
        return result;
    }
    public String updateMember1(String userNo){
        String url = "jdbc:mariadb://localhost:3306/sample";
        String user = "root";
        String password = "!123456";

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        StringBuilder result = new StringBuilder();

        try {
            Class.forName("org.mariadb.jdbc.Driver");

            conn = DriverManager.getConnection(url, user, password);

            // ?는 값만 가능
            String sql = "select * from user where userno = ?";

            pstmt = conn.prepareStatement(sql);

            pstmt.setString(1,userNo);

            rs = pstmt.executeQuery();
            while(rs.next()){
                String userName = rs.getString("userName");
                String userPhone = rs.getString("userPhone");
                String userEmail = rs.getString("userEmail");
                String userGroup = rs.getString("userGroup");
                String userBirth = rs.getString("userBirth");
                result.append(String.format("[%s]님의 회원정보\n",userNo))
                        .append(String.format("이름 : %s\n",userName))
                        .append(String.format("연락처 : %s\n",userPhone))
                        .append(String.format("이쪽지 : %s\n", userEmail))
                        .append(String.format("그룹 : %s\n",userGroup))
                        .append(String.format("생년월일 : %s\n", userBirth));
            }

        } catch (ClassNotFoundException e) {
            result.append("유저 정보가 없습니다.");
        } catch (SQLException e) {
            result.append("유저 정보가 없습니다.");
        } finally {
            if(conn!=null){try {conn.close();}catch(SQLException e){}}
            if(pstmt!=null){try {pstmt.close();}catch(SQLException e){}}
            if(rs!=null){try {rs.close();}catch(SQLException e){}}
        }
        return result.toString();
    }

    public String updateMember2(String userNo, String userName, String userPhone, String userEmail, String userGroup, String userBirth){
        String url = "jdbc:mariadb://localhost:3306/sample";
        String user = "root";
        String password = "!123456";

        Connection conn = null;
        PreparedStatement pstmt = null;
        String result;

        try {
            Class.forName("org.mariadb.jdbc.Driver");
            conn = DriverManager.getConnection(url,user,password);
            String insertSql = "update user set userName=?,userPhone=?,userEmail=?,userGroup=?,userBirth=? where userNo = ?";
            pstmt = conn.prepareStatement(insertSql);

            pstmt.setString(1,userName);
            pstmt.setString(2,userPhone);
            pstmt.setString(3,userEmail);
            pstmt.setString(4,userGroup);
            pstmt.setString(5,userBirth);
            pstmt.setString(6,userNo);
            pstmt.executeUpdate();
            result = "회원정보를 정상적으로 수정하였습니다.";

        } catch (ClassNotFoundException e) {
            result = "회원정보수정에 실패했습니다.";
        } catch (SQLException e) {
            result = "회원정보수정에 실패했습니다.";
        }finally {
            if(pstmt!=null){try{pstmt.close();}catch(SQLException e){}}
            if(conn!=null){try{conn.close();}catch(SQLException e){}}
        }
        return result;
    }
    public String deleteMember1(String userNo){
        String url = "jdbc:mariadb://localhost:3306/sample";
        String user = "root";
        String password = "!123456";

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        StringBuilder result = new StringBuilder();

        try {
            Class.forName("org.mariadb.jdbc.Driver");

            conn = DriverManager.getConnection(url, user, password);

            // ?는 값만 가능
            String sql = "select * from user where userno = ?";

            pstmt = conn.prepareStatement(sql);

            pstmt.setString(1,userNo);

            rs = pstmt.executeQuery();
            while(rs.next()){
                String userName = rs.getString("userName");
                String userPhone = rs.getString("userPhone");
                String userEmail = rs.getString("userEmail");
                String userGroup = rs.getString("userGroup");
                String userBirth = rs.getString("userBirth");
                result.append(String.format("[%s]님의 회원정보\n",userNo))
                        .append(String.format("이름 : %s\n",userName))
                        .append(String.format("연락처 : %s\n",userPhone))
                        .append(String.format("이쪽지 : %s\n", userEmail))
                        .append(String.format("그룹 : %s\n",userGroup))
                        .append(String.format("생년월일 : %s\n", userBirth));
            }
        } catch (ClassNotFoundException e) {
            result.append("입력하신 회원등록번호에 해당하는 회원은 존재하지 않습니다.\n");
        } catch (SQLException e) {
            result.append("입력하신 회원등록번호에 해당하는 회원은 존재하지 않습니다.\n");
        } finally {
            if(conn!=null){try {conn.close();}catch(SQLException e){}}
            if(pstmt!=null){try {pstmt.close();}catch(SQLException e){}}
            if(rs!=null){try {rs.close();}catch(SQLException e){}}
        }
        String result1 = result.toString().trim();
        if(result1.equals("")) result1 = "입력하신 회원등록에 해당하는 회원은 존재하지 않습니다.";
        return result1;
    }
    public String deleteMember2(String userNo){
        String url = "jdbc:mariadb://localhost:3306/sample";
        String user = "root";
        String password = "!123456";

        Connection conn = null;
        PreparedStatement pstmt = null;
        String result;

        try {
            Class.forName("org.mariadb.jdbc.Driver");
            conn = DriverManager.getConnection(url,user,password);
            String insertSql = "delete from user where userNo = ?";
            pstmt = conn.prepareStatement(insertSql);

            pstmt.setString(1,userNo);
            pstmt.executeUpdate();
            result = "회원정보를 정상적으로 삭제하였습니다.";

        } catch (ClassNotFoundException e) {
            result = "회원정보삭제에 실패했습니다.";
        } catch (SQLException e) {
            result = "회원정보삭제에 실패했습니다.";
        }finally {
            if(pstmt!=null){try{pstmt.close();}catch(SQLException e){}}
            if(conn!=null){try{conn.close();}catch(SQLException e){}}
        }
        return result;
    }
}// create table if not exists user(userNo varchar(5) not null,userName varchar(3) not null,userPhone varchar(13) not null,userEmail varchar(26) not null,userGroup varchar(4),userBirth varchar(10),userRoll varchar(10));
