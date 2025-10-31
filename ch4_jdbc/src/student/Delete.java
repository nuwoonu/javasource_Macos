package student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Delete {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstmt = null;
        Scanner sc = new Scanner(System.in);

        try {
            Class.forName("oracle.jdbc.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "javadb";
            String password = "12345";

            con = DriverManager.getConnection(url,user,password);
            
            // 삭제할 학생아이디 입력받기
            System.out.println("아이디 입력 >> ");
            String studentId = sc.nextLine();
            
            //!!! 자식 삭제 후 부모 삭제 ORACLE SQL RULE!!!
            //부모 삭제
            String sql = "delete from enrollment where student_id=?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, studentId); // studentId에 있는값을 셋팅한다.

            int rows = pstmt.executeUpdate();
            
            //자식 삭제
            sql = "delete from student where student_id=?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, studentId); // studentId에 있는값을 셋팅한다.
            rows = pstmt.executeUpdate();
            System.out.println(rows > 0 ? "삭제성공" : "삭제실패");
             
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        finally
        {
            try 
            {
                pstmt.close();
                con.close();
            } catch (Exception e) 
            {
                e.printStackTrace();
            }
        }
    }
}
