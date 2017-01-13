import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Calendar;

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

                Calendar calendar = Calendar.getInstance();
                java.sql.Date startDate = new java.sql.Date(calendar.getTime().getTime());

                String query = " insert into paises (idPais, Pais, Alpha3)" + " values (?, ?, ?)";
                PreparedStatement preparedStmt = conn.prepareStatement(query);
                preparedStmt.setInt (1, 1);
                preparedStmt.setString (2, "Argentina");
                preparedStmt.setString(3, "Arg");

                preparedStmt.execute();

                conn.close();


            } catch (SQLException e) {
                throw new IllegalStateException("Cannot connect the database!", e);
            }
        }

    }
}
