//package jdbc;
//
//import org.flywaydb.core.Flyway;
//import org.junit.Before;
//import org.junit.Test;
//import org.mariadb.jdbc.MariaDbDataSource;
//
//import java.sql.SQLException;
//import java.util.Arrays;
//import java.util.List;
//
//import static org.junit.Assert.assertEquals;
//
//public class EmployeesDaoTest {
//    private EmployeesDAO employeesDAO;
//
//    @Before
//
//    public void init() {
//        MariaDbDataSource dataSource = new MariaDbDataSource();
//
//        try {
//            dataSource.setUrl("jdbc:mariadb://localhost:3306/employees?useUnicode=true");
//            dataSource.setUser("employees");
//            dataSource.setPassword("employees");
//        } catch (SQLException e) {
//            e.printStackTrace();
//
//            Flyway flyway = Flyway.configure().dataSource(dataSource).load();
//
////            flyway.clean();
////            flyway.migrate();
//
//            employeesDAO = new EmployeesDAO(dataSource);
//        }
//    }
//
//    @Test
//    public void testInsert() {
//        employeesDAO.createEmployee("John Doe");
//        assertEquals(List.of("John Doe"), employeesDAO.listEmployeeNames());
//
//    }
//}
