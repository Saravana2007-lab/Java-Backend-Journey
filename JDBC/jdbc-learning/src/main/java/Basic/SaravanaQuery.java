import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SaravanaQuery {

    public static void main(String[] args) {
        String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
        String username = System.getenv("DB_USERNAME");
        String password = System.getenv("DB_PASSWORD");

        try (Connection connection = DriverManager.getConnection(url, username, password);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM SARAVANA")) {
            System.out.println("Query executed successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
