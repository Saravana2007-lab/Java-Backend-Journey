package Basic;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExpenseTracker {

    public static void main(String[] args) {
        String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
        String username = System.getenv("DB_USERNAME");
        String password = System.getenv("DB_PASSWORD");

        try (Connection connection = DriverManager.getConnection(url, username, password);
             Statement statement = connection.createStatement();ResultSet resultSet = statement.executeQuery("SELECT * FROM EXPENSES");)
        {
            System.out.println("Query executed successfully.");
            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt(1));
                System.out.println("Amount: " + resultSet.getDouble(2));
                System.out.println("Category: " + resultSet.getString(3));
                System.out.println("Description: " + resultSet.getString(4));
                System.out.println("Date: " + resultSet.getDate(5));
                System.out.println("-------------------------");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
