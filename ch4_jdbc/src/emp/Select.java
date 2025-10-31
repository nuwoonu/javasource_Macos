package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Select {

    public static void main(String[] args) {
        
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        //db 서버 연결

        // 1. 드라이버 로드

        try{
                Class.forName("oracle.jdbc.OracleDriver");
                String url = "jdbc:oracle:thin:@localhost:1521:xe";
                String user = "scott";
                String password = "tiger";

                con = DriverManager.getConnection(url,user,password);

                // 3.sql 구문
                String sql = "select * from emp";
                
                pstmt = con.prepareStatement(sql);
                rs= pstmt.executeQuery();
                while(rs.next())
                {
                    System.out.print(rs.getInt("empno")+ "\t");
                    System.out.print(rs.getString("ename")+ "\t");
                    System.out.print(rs.getString("job")+ "\t");
                    System.out.print(rs.getInt("mgr")+ "\t");
                    System.out.print(rs.getDate("hiredate")+ "\t");
                    System.out.print(rs.getInt("sal")+ "\t");
                    System.out.print(rs.getInt("comm")+ "\t");
                    System.out.println(rs.getInt("deptno"));

                }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally{
            try {
                rs.close();
                pstmt.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
            
    }

}   