
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.DatabaseMetaData;

public class DatabaseConnection {

    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
        String username = System.getenv("DB_USERNAME");
        String password = System.getenv("DB_PASSWORD");
try (Connection con = DriverManager.getConnection(url, username, password)) {
    System.out.println("Connected!");
    DatabaseMetaData meta = con.getMetaData();
    System.out.println(meta.getDatabaseProductName() + " " + meta.getDatabaseProductVersion());
} catch (SQLException e) {
    e.printStackTrace();
}

    }
}
