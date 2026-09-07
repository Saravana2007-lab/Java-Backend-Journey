package Projects.ExpenseTracker.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

public static Connection getConnection() throws SQLException {

       String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
        String username = System.getenv("DB_USERNAME");
        String password = System.getenv("DB_PASSWORD");

    return DriverManager.getConnection(url,username,password);
}
}
