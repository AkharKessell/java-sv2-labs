//package jdbc;
//
//import org.mariadb.jdbc.Connection;
//import org.mariadb.jdbc.MariaDbDataSource;
//
//import javax.sql.DataSource;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//public class FindByIdMain {
//
//    public static void main(String[] args) {
//        MariaDbDataSource dataSource = new MariaDbDataSource();
//        try {
//            dataSource.setUrl("jdbc:mariadb://localhost:3306/employees?useUnicode=true");
//            dataSource.setUser("employees");
//            dataSource.setPassword("employees");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        new FindByIdMain().selectNameById(dataSource, 3);
//    }
//
//
//    }
//
//
//
//    }
//}