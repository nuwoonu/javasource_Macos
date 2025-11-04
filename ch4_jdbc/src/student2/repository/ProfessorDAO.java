package student2.repository;

import static student2.repository.JDBCUtil.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import student2.dto.ProfessorDTO;

public class ProfessorDAO 
{
    public ProfessorDAO(Connection con) {
        this.con = con;
    }
    private Connection con ;
    private PreparedStatement pstmt ;
    private ResultSet rs;

    
    public int insert(ProfessorDTO professorDTO)
    {
        int result = 0;
        try {
            String sql = "INSERT INTO professor(prof_id,prof_name,DEPT_ID) values(?,?,?)";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, professorDTO.getProfID()); 
            pstmt.setString(2, professorDTO.getProfName()); 
            pstmt.setString(3, professorDTO.getDeptId());
            
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
    public int update(ProfessorDTO professorDTO)
    {
        int result =0;
        try {
            String sql = "UPDATE professor set dept_id = ? where prof_id = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, professorDTO.getDeptId());
            pstmt.setString(2, professorDTO.getProfID());
            
            result = pstmt.executeUpdate();
                        
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(pstmt);
        }
        return result;
    }



    public int delete(String profId)
    {
        int result = 0; // rows =>1
        try {
            String sql = "delete from professor where prof_id = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, profId);
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
    public ProfessorDTO getRow(String profId)
    {
        ProfessorDTO dto = null;
        try {
            String sql = "select * from professor where prof_id = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, profId);
            rs = pstmt.executeQuery(); // SELECT ==> Query
            while(rs.next())
            {
                dto = new ProfessorDTO();
                dto.setProfID(rs.getString("prof_id"));
                dto.setProfName(rs.getString("prof_name"));
                dto.setDeptId(rs.getString("dept_id"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally
        {
            close(pstmt);
        }
        return dto;
    }


}
