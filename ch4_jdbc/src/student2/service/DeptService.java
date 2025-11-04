package student2.service;
import static student2.repository.JDBCUtil.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import student2.dto.DeptDTO;
import student2.repository.DeptDAO;

public class DeptService  // ~~ Service 는 DAO랑 연동하는 클래스 (비즈니스 로직 작성)
{
    
    public boolean addDept(DeptDTO dto)
    {
        Connection con = null;
        boolean isAdd = false;
        try{
            //db작업
            con = getConnection();
            DeptDAO dao = new DeptDAO(con);
            int result = dao.insert(dto);
            if(result>0)
            {
                commit(con); // 커밋.
                isAdd = true;
            }
        } catch(SQLException e)
        {
            e.printStackTrace();
            rollback(con); // 익셉션시 롤백.
        }
        close(con);
        return isAdd;

    }
    public boolean updateDept(DeptDTO dto)
    {
        Connection con = null;
        boolean isUpdate = false;
        try{
            //db작업
            con = getConnection();
            DeptDAO dao = new DeptDAO(con);
            int result = dao.update(dto);
            if(result>0)
            {
                commit(con); // 커밋.
                isUpdate = true;
            }
        } catch(SQLException e)
        {
            e.printStackTrace();
            rollback(con); // 익셉션시 롤백.
        }
        close(con);
        return isUpdate;

    }
    public boolean removeDept(String deptId)
    {
        Connection con = null;
        boolean isDelete = false;
        try{
            //db작업
            con = getConnection();
            DeptDAO dao = new DeptDAO(con);
            int result = dao.delete(deptId);
            if(result>0)
            {
                commit(con); // 커밋.
                isDelete = true;
            }
        } catch(SQLException e)
        {
            e.printStackTrace();
            rollback(con); // 익셉션시 롤백.
        }
        close(con);
        return isDelete;

    }
    public DeptDTO getDept(String deptName) // select라 commit rollback 개념이 없다!.
    {
        Connection con = null;
        try{
            //db작업
            con = getConnection();
            DeptDAO dao = new DeptDAO(con);
            DeptDTO dto = dao.getRow(deptName);
            return dto;
        } catch(SQLException e)
        {
            e.printStackTrace();
            
        }
        close(con);
        return null;
    }
    public List<DeptDTO> getDepts()
    {
        Connection con = null;
        try{
            //db작업
            con = getConnection();
            DeptDAO dao = new DeptDAO(con);
            List<DeptDTO> list = dao.getRows();
            return list;
        } catch(SQLException e)
        {
            e.printStackTrace();
            
        }
        close(con);
        return null;
    }

}
