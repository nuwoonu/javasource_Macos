package student2.repository;

import static student2.repository.JDBCUtil.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import student2.dto.DeptDTO;

public class DeptDAO { //Data Access Object 데이터베이스 관련 작업. DB랑 연동하는 클래스!
    private Connection con ;
    private PreparedStatement pstmt ;
    private ResultSet rs;

    

    

    public DeptDAO(Connection con) {
        this.con = con;
    }
    public int insert(DeptDTO dto)
    {
        int result = 0;
        try {
            String sql = "INSERT INTO department(dept_id,dept_name) values (?,?)"; // 입력 받아야하는건 ? 이용! 두개 직접 입력하는 경우.
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, dto.getDeptId());
            pstmt.setString(2, dto.getDeptName());
            
            // ? 해결 
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
    public int delete(String deptId) {
        int result = 0;
        try {
            String sql = "delete from department where dept_id = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, deptId);
            result = pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
                close(pstmt);
        }
        return result;
    }    
    public int update(DeptDTO dto)
    {
        int result = 0;
        try {
            String sql = "update department set dept_name = ? where dept_id = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, dto.getDeptName());
            pstmt.setString(2, dto.getDeptId());
            result = pstmt.executeUpdate();

            

        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            close(pstmt);
        }
        return result;
    }
    public DeptDTO getRow(String deptName)
    {
        DeptDTO deptDTO = null;
        try {
            String sql = "select * from department where dept_name = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, deptName);
            rs = pstmt.executeQuery(); // 쿼리문 실행

            while(rs.next())
            {
                String deptId = rs.getString("dept_id");
                deptName = rs.getString("dept_name");
                
                deptDTO = new DeptDTO(deptId,deptName);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally
        {
            close(rs);
            close(pstmt);
        }
        return deptDTO;
    }
    public List<DeptDTO> getRows()
    // 조회 결과가 여러개 나오는 경우 
    // 전체 학과 조회 메서드
    {
        List<DeptDTO> list = new ArrayList<>();
        try {
            String sql = "select * from department";
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery(); // 쿼리문 실행

            while(rs.next())
            {
                String deptId = rs.getString("dept_id");
                String deptName = rs.getString("dept_name");
                // DeptDTO deptDTO = new DeptDTO(deptId,deptName);
                // list.add(deptDTO);

                list.add(new DeptDTO(deptId,deptName));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally
        {
            close(rs);
            close(pstmt);
        }
        return list;
    }
}
