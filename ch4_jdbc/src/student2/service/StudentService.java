package student2.service;

import static student2.repository.JDBCUtil.*;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import student2.dto.StudentDTO;
import student2.repository.StudentDAO;

public class StudentService {
    public boolean insertStudent(StudentDTO sDto)
    {
        Connection con = null;
        try {
            con= getConnection();
            StudentDAO dao = new StudentDAO(con);

            int rows = dao.insert(sDto);

            if(rows > 0 )
            {
                commit(con);
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            rollback(con);
        }
        finally
        {
            close(con);

        }
        return false;
    }
    public boolean updateStudent(StudentDTO sDto)
    {
        Connection con = null;
        

        try {
            con = getConnection();
            StudentDAO dao = new StudentDAO(con);
            int rows = dao.update(sDto);

            if(rows > 0)
            {
                commit(con);
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            rollback(con);
        }
        finally
        {
            close(con);
        }
        return false;
    }
    public boolean deleteStudent(String studentId)
    {
        Connection con = null;
        try {
            con = getConnection();
            StudentDAO dao = new StudentDAO(con);

            int rows = dao.delete(studentId);

            if(rows > 0)
            {
                commit(con);
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally
        {
            close(con);
        }
        return false;
    }
    public StudentDTO getStudent(String stduentId)
    {
        Connection con = null;
        try {
            con = getConnection();
            StudentDAO dao = new StudentDAO(con);
            return dao.getRow(stduentId);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally
        {
            close(con);
        }
        return null;

    }

    public List<StudentDTO> getStudents(String deptId)
    {
        Connection con = null;
        try {
            con = getConnection();
            StudentDAO dao = new StudentDAO(con);
            return dao.getList(deptId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally
        {
            close(con);
        }
        return null;

    }
}
