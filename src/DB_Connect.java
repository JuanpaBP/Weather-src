import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Usuario on 12/01/2017.
 */
public class DB_Connect {

    String url = "jdbc:mysql://localhost:3306/Globant";
    String username = "root";
    String password = "ecchi20101992";

    public void TryConn() {
                {
            try (Connection conn = DriverManager.getConnection(url, username, password)) {
                System.out.println("Database connected!");
            } catch (SQLException e) {
                throw new IllegalStateException("Cannot connect the database!", e);
            }
        }

    }
}
