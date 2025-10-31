package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Update {

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
                String sql = "update emp set sal where empno = 7777";
                
                PreparedStatement pstmt = con.prepareStatement(sql);
                //ResultSet rs= pstmt.executeQuery(); // select 구문일때만 사용
                int result = pstmt.executeUpdate();
                System.out.println(result > 0 ? "업데이트 성공": "업데이트 실패");
                
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
            
    }

}   