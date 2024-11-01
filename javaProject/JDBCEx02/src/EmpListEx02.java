import java.sql.*;

public class EmpListEx02 {
    public static void main(String[] args) {
        String url = "jdbc:mariadb://localhost:3306/sample";
        String user = "root";
        String password = "비밀번호";
        String driverName = "org.mariadb.jdbc.Driver";

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName(driverName);
            conn = DriverManager.getConnection(url,user,password);
            stmt = conn.createStatement();


            String sql = "select empno, ename, sal, hiredate from emp where deptno = 10";
            // String sql = "select empno, ename, sal, date_format(hiredate,'%Y/%m/%d') hiredate from emp where deptno = 10";

            rs = stmt.executeQuery(sql);
            while(rs.next()){
                String empno = rs.getString("empno");
                String ename = rs.getString("ename");
                String sal = rs.getString("sal");
                String hiredate = rs.getString("hiredate").replaceAll("-","/");
                System.out.printf("%s %s %s %s%n",empno,ename,sal,hiredate);
            }
        } catch (ClassNotFoundException e) {
            System.out.println("[에러] : " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("[에러] : " + e.getMessage());
        } finally{
            if(conn!=null){try{conn.close();}catch(SQLException e){}}
            if(stmt!=null){try{stmt.close();}catch(SQLException e){}}
            if(rs!=null){try{rs.close();}catch(SQLException e){}}
        }


    }
}
