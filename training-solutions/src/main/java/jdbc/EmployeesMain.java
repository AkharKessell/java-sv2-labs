package jdbc;

import org.flywaydb.core.Flyway;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.util.List;

public class EmployeesMain {
    public static void main(String[] args) {
        MariaDbDataSource dataSource = new MariaDbDataSource();

        try {
            dataSource.setUrl("jdbc:mariadb://localhost:3306/employees?useUnicode=true");
            dataSource.setUser("employees");
            dataSource.setPassword("employees");
        } catch (SQLException e) {
            e.printStackTrace();
        }

//        Flyway flyway = Flyway.configure().dataSource(dataSource).load();
//
//        flyway.clean();
//        flyway.migrate();

        EmployeesDAO employeesDAO = new EmployeesDAO(dataSource);
        employeesDAO.createEmployee("Jane Doe");

        List<String> names = employeesDAO.listEmployeeNames();
        System.out.println(names);

        String name = employeesDAO.findEmployeeNameById(1L);
        System.out.println(name);
    }
}
