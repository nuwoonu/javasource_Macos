package student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Update {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstmt = null;
        Scanner sc = new Scanner(System.in);

        try {
            Class.forName("oracle.jdbc.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "javadb";
            String password = "12345";

            // 수정할 학생아이디 입력받기
            System.out.println("아이디 입력 >> ");
            String studentId = sc.nextLine();
            System.out.println("키 입력 >> ");
            Double height = Double.parseDouble(sc.nextLine());


            con = DriverManager.getConnection(url,user,password);

            String sql = "update student set height=? where student_id=?";
            pstmt = con.prepareStatement(sql);
            pstmt.setDouble(1, height); // studentId에 있는값을 셋팅한다.
            pstmt.setString(2, studentId); // studentId에 있는값을 셋팅한다.


            int rows = pstmt.executeUpdate();
            System.out.println(rows > 0 ? "수정성공" : "수정실패");
             
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
