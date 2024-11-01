import java.sql.*;

// sql 생성하고 복사해오는 코드
public class EmpListEx03 {
    public static void main(String[] args) {
        String url = "jdbc:mariadb://localhost:3306/sample";
        String user = "root";
        String password = "비밀번호";
        String driverName = "org.mariadb.jdbc.Driver";

        Connection conn = null;
        Statement stmt1 = null;
        Statement stmt2 = null;
        Statement stmt3 = null;
        Statement stmt4 = null;
        ResultSet rs = null;

        try {
            Class.forName(driverName);
            conn = DriverManager.getConnection(url,user,password);
            stmt1 = conn.createStatement();
            stmt2 = conn.createStatement();
            stmt3 = conn.createStatement();
            stmt4 = conn.createStatement();

            String dropSql = "drop table if exists emp10";
            stmt1.executeUpdate(dropSql);

            String createSql = "create table emp10 as select * from emp where 1!=1";
            stmt2.executeUpdate(createSql);

            String copySql = "select * from emp where deptno=10";
            rs = stmt3.executeQuery(copySql);
            while(rs.next()){
                String empno = rs.getString("empno");
                String ename = rs.getString("ename");
                String job = rs.getString("job");
                String mgr = rs.getString("mgr");
                String hiredate = rs.getString("hiredate");
                String sal = rs.getString("sal");
                String comm = rs.getString("comm");
                String deptno = rs.getString("deptno");
                // System.out.printf("%s %s %s %s %s %s %s %s %n",empno,ename,job,mgr,hiredate,sal,comm,deptno);

                String insertSql = String.format("insert into emp10 values(%s,'%s','%s',%s,'%s',%s,%s,%s)",empno, ename, job, mgr, hiredate, sal, comm, deptno);
                stmt4.executeUpdate(insertSql);
            }

        } catch (ClassNotFoundException e) {
            System.out.println("[에러] : " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("[에러] : " + e.getMessage());
        } finally{
            if(conn!=null){try{conn.close();}catch(SQLException e){}}
            if(stmt1!=null){try{stmt1.close();}catch(SQLException e){}}
            if(stmt2!=null){try{stmt2.close();}catch(SQLException e){}}
            if(stmt3!=null){try{stmt3.close();}catch(SQLException e){}}
            if(stmt4!=null){try{stmt4.close();}catch(SQLException e){}}
            if(rs!=null){try{rs.close();}catch(SQLException e){}}
        }


    }
}
