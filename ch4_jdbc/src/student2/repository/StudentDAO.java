package student2.repository;

import static student2.repository.JDBCUtil.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import student2.dto.StudentDTO;

public class StudentDAO
{
    private Connection con;
    private PreparedStatement pstmt;
    private ResultSet rs;
    public StudentDAO(Connection con)
    {
        this.con = con;
    }

    public int insert(StudentDTO studentDTO)
    {
        int result = 0;
        try {
            String sql = "INSERT INTO student(student_id,name,height,dept_id) values(?,?,?,?)";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, studentDTO.getStudentId()); // studentId에 있는값을 셋팅한다.
            pstmt.setString(2, studentDTO.getName()); // Student Name에 있는값을 셋팅한다.
            pstmt.setDouble(3, studentDTO.getHeight()); // student height에 있는값을 셋팅한다.
            pstmt.setString(4, studentDTO.getDeptId()); // student의 학과를 셋팅한다.
            
            result = pstmt.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally
        {
            close(pstmt);
        }
        return result;
    }
    public int update(StudentDTO studentDTO)
    {
        int result = 0;
        try {
            String sql = "UPDATE student set height = ? where  student_id = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setDouble(1, studentDTO.getHeight());
            pstmt.setString(2, studentDTO.getStudentId());

            result = pstmt.executeUpdate();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        finally
        {
            close(pstmt);
        }
        return result;
    }
    public int delete(String studentId)
    {
        int result =0;
        try {
            String sql = "delete from student where student_id = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, studentId);
            result = pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally
        {
            close(pstmt);
        }

        return result;
    }
    public StudentDTO getRow(String StudentId)
    {
        StudentDTO studentDTO = null;
        try {
            String sql = "select * from student where student_id = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1,StudentId);
            rs = pstmt.executeQuery();
            if(rs.next())
            {
                studentDTO= new StudentDTO();
                studentDTO.setStudentId(rs.getString("student_id"));
                studentDTO.setName(rs.getString("name"));
                studentDTO.setHeight(rs.getDouble("height"));
                studentDTO.setDeptId(rs.getString("dept_id"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return studentDTO;
    }
    public List<StudentDTO> getList(String deptId)
    {
        List<StudentDTO> list = new ArrayList<>();
        try {
            String sql = "select * from student where dept_id = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, deptId);
            rs = pstmt.executeQuery();

            while(rs.next())
            {
                StudentDTO studentDTO = new StudentDTO();
                studentDTO.setStudentId(rs.getString("student_id"));
                studentDTO.setName(rs.getString("name"));
                studentDTO.setHeight(rs.getDouble("height"));
                studentDTO.setDeptId(rs.getString("dept_id"));
                list.add(studentDTO);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        finally
        {
            close(rs);
            close(pstmt);
        }
        return list;
    }
}



 // insert

// delete : studentId

// update : height 수정

// 학생전체조회(dept-id 이용)

// 학생조회(1명 = studentId로)

//