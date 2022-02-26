package jdbc;

import org.mariadb.jdbc.Connection;
import org.mariadb.jdbc.Statement;

import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeesDAO {

    private final DataSource dataSource;

    public EmployeesDAO(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public long createEmployee(String name) {
        try (
                Connection conn = (Connection) dataSource.getConnection();
                PreparedStatement stmt = conn.prepareStatement("insert into employees(emp_name) values(?)", Statement.RETURN_GENERATED_KEYS)) {
            stmt.setString(1, name);
            stmt.executeUpdate();

            return getIdByStatement(stmt);
        } catch (SQLException se) {
            throw new IllegalStateException("Cannot Insert");
        }
    }

    private long getIdByStatement(PreparedStatement stmt) {
        try (
                ResultSet rs = stmt.getGeneratedKeys()
        ) {
            if (rs.next()) {
                return rs.getLong(1);
            }
            throw new IllegalStateException("Cannot get ID");
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Cannot get id", sqlException);
        }
    }

    public List<String> listEmployeeNames() {
        try (
                Connection connection = (Connection) dataSource.getConnection();
                Statement stmt = connection.createStatement();
                ResultSet rs = stmt.executeQuery("select emp_name from employees")
        ) {
            List<String> names = new ArrayList<>();
            while (rs.next()) {
                String name = rs.getString("emp_name");
                names.add(name);
            }
            return names;
        } catch (SQLException se) {
            throw new IllegalStateException("Cannot select employees", se);
        }
    }

    public String findEmployeeNameById(long id) {
        try (Connection conn = (Connection) dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement("select emp_name from employees where id = ?")
        ) {
            ps.setLong(1, id);

            return selectNameByPreparedStatement(ps);

        } catch (SQLException se) {
            throw new IllegalStateException("Cannot select employees", se);
        }
    }

    private String selectNameByPreparedStatement(PreparedStatement ps) {
        try (ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
                String name = rs.getString("emp_name");
                return name;
            }
            throw new IllegalStateException("Not Found");
        } catch (SQLException se) {
            throw new IllegalStateException("Cannot query", se);
        }
    }
}
