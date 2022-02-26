package jdbc.spring;

import org.flywaydb.core.Flyway;
import org.junit.Before;
import org.junit.Test;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeesDaoTest {

    private EmployeesDao employeesDao;

    @Before
    public void init() {
        MariaDbDataSource dataSource = new MariaDbDataSource();
        try {
            dataSource.setUrl("jdbc:mariadb://localhost:3306/employees?useUnicode=true");
            dataSource.setUser("employees");
            dataSource.setPassword("employees");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        Flyway flyway = Flyway.configure().dataSource(dataSource).load();

//        Flyway flyway = Flyway.configure().dataSource("jdbc:mariadb://localhost:3306/employees?useUnicode=true", "employees", "employees").load();
        flyway.clean();
        flyway.migrate();

        employeesDao = new EmployeesDao(dataSource);
    }

    @Test
    public void testCreate() {
        employeesDao.createEmployees("John Doe");
        List<String> names = employeesDao.listEmployeesNames();
        assertEquals(List.of("John Doe"), names);
    }
    @Test
    public void testFindById() {
        long id = employeesDao.createEmployees("John Doe");
        System.out.println(id);
        String name = employeesDao.findEmployeeNameById(id);
        assertEquals("John Doe", name);
    }
}
