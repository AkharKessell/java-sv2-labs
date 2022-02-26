package jdbc;

import org.flywaydb.core.Flyway;
import org.junit.Before;
import org.junit.Test;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class EmployeesDaoTest {
    private EmployeesDAO employeesDAO;

    @Before

    public void init() {
        MariaDbDataSource dataSource = new MariaDbDataSource();

        try {
            dataSource.setUrl("jdbc:mariadb://localhost:3306/employees?useUnicode=true");
            dataSource.setUser("employees");
            dataSource.setPassword("employees");
        } catch (SQLException e) {
            e.printStackTrace();

            Flyway flyway = Flyway.configure().dataSource(dataSource).load();

            flyway.clean();
            flyway.migrate();

            employeesDAO = new EmployeesDAO(dataSource);
        }
    }

    @Test
    public void testInsert() {
        employeesDAO.createEmployee("Jane Doe");
        assertEquals(Arrays.asList("Jane Doe"), employeesDAO.listEmployeeNames());
    }

    @Test
    public void testByID() {
        long id = employeesDAO.createEmployee("Jack Doe");
        System.out.println(id);
        id = employeesDAO.createEmployee("Jane Doe");
        System.out.println(id);
        String name = employeesDAO.findEmployeeNameById(id);
        assertEquals("Jane Doe", name);
    }

    @Test
    public void createEmployees() {
        employeesDAO.createEmployees(Arrays.asList("jack Doe","john Doe","Jane Doe"));
        List<String>names = employeesDAO.listEmployeeNames();
        assertEquals(Arrays.asList("jack Doe","john Doe","Jane Doe"), names);
    }
    @Test
    public void createEmployeesRollback() {
        employeesDAO.createEmployees(Arrays.asList("jack Doe","john Doe","xJane Doe"));
        List<String>names = employeesDAO.listEmployeeNames();
        assertEquals(Collections.emptyList(),names);
    }
}
