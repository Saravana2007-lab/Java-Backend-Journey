package Basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
        String username = System.getenv("DB_USERNAME");
        String password = System.getenv("DB_PASSWORD");

        try (Connection con = DriverManager.getConnection(url, username, password)) {

            System.out.println("Database connected successfully!");

        } catch (SQLException e) {

            System.out.println("Database connection failed.");
            System.out.println("Error: " + e.getMessage());
             e.printStackTrace();
        }
    }
}