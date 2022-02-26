package jdbc.spring;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;

public class EmployeesDao {

    private JdbcTemplate jdbcTemplate;

    public EmployeesDao(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public long createEmployees(String name) {
        KeyHolder holder = new GeneratedKeyHolder();

        jdbcTemplate.update(con -> {
            PreparedStatement ps = con.prepareStatement("insert into employees(emp_name) values (?)",
                    Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, name);
            return ps;
        }, holder );

        return holder.getKey().longValue();
    }

    public List<String> listEmployeesNames(){
        return jdbcTemplate.query("SELECT emp_name FROM employees",
        (rs, rowNum) -> rs.getString("emp_name"));
    }

    public String findEmployeeNameById(long id){
        return jdbcTemplate.queryForObject("SELECT emp_name FROM employees WHERE id = ?",
                (rs, rowNum) -> rs.getString("emp_name"),id);
    }
}
