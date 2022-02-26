package jdbc.spring;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class EmployeesDao {

    private JdbcTemplate jdbcTemplate;

    public EmployeesDao(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void createEmployees(String name){
        jdbcTemplate.update("INSERT INTO Employees (emp_name) VALUES (?)", name);
    }
    public List<String> listEmployeesNames(){
        return jdbcTemplate.query("select emp_name from employees",
        (rs, rowNum) -> rs.getString("emp_name"));
    }
}
