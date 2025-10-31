package student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Insert {
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
            System.out.print("아이디 입력 >> ");
            String studentId = sc.nextLine();
            System.out.print("이름 입력 >> ");
            String name = sc.nextLine();
            System.out.print("키 입력 >> ");
            Double height = Double.parseDouble(sc.nextLine());
            System.out.print("학과코드 입력 >> ");
            String dept_id = sc.nextLine();
            
            
            String sql = "INSERT INTO student(student_id,name,height,dept_id) values(?,?,?,?)";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, studentId); // studentId에 있는값을 셋팅한다.
            pstmt.setString(2, name); // studentId에 있는값을 셋팅한다.
            pstmt.setDouble(3, height); // studentId에 있는값을 셋팅한다.
            pstmt.setString(4, dept_id); // studentId에 있는값을 셋팅한다.
            int rows = pstmt.executeUpdate();
            

            System.out.println(rows > 0 ? "입력성공" : "입력실패");
             
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
