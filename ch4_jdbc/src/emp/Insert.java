package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Insert {

    public static void main(String[] args) {
            
        //db 서버 연결

        // 1. 드라이버 로드

        try{
                Class.forName("oracle.jdbc.OracleDriver");
                String url = "jdbc:oracle:thin:@localhost:1521:xe";
                String user = "scott";
                String password = "tiger";

                Connection con = DriverManager.getConnection(url,user,password);

                // 3.sql 구문
                String sql = "INSERT INTO EXAM_EMP (EMPNO, ENAME, JOB,MGR,HIREDATE,SAL,COMM,DEPTNO )";
                sql += "VALUES(1111, '성춘향', 'MANAGER', 1111, '2025-10-29', 4000, NULL,50)";
                
                PreparedStatement pstmt = con.prepareStatement(sql);
                int result = pstmt.executeUpdate();
                System.out.println(result); // => 1
                System.out.println(result > 0 ? "입력 성공": "입력 실패");
                
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
            
    }

}   