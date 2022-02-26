//package jdbc;
//
//import org.mariadb.jdbc.MariaDbDataSource;
//
//import java.sql.SQLException;
//
//public class SelectEmployeesMain {
//    public static void main(String[] args) {
//        MariaDbDataSource dataSource = new MariaDbDataSource();
//
//        try {
//            dataSource.setUrl("jdbc:mariadb://localhost:3306/employees?useUnicode=true");
//            dataSource.setUser("employees");
//            dataSource.setPassword("employees");
//        } catch (SQLException se) {
//            throw new IllegalStateException("Cannot select employees", se);
//        }
//
//
//    }
//}
