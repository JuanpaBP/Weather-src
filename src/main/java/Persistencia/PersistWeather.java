package Persistencia;

import SingletonDB.DB_Connect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by Usuario on 18/01/2017.
 */
public class PersistWeather {

    Connection conn = DB_Connect.getInstance().getCon();
    public void insertWeather(int wTemp, int wMaxTemp, int wMinTemp, String wDesc, int wWSpe, String wWDir,
                              int wAHum, int wAPress, String wAVisibility) {

        try {
            String querywind = "insert into vientos (velocidad, dirección)" + " values (?, ?)";
            PreparedStatement preparedStmt = conn.prepareStatement(querywind);
            preparedStmt.setInt(1, wWSpe);
            preparedStmt.setString(2, wWDir);

            preparedStmt.execute();

            String queryatmosphere = "insert into atmosfera (humedad, presion, visibilidad)" + " values (?, ?, ?)";
            preparedStmt = conn.prepareStatement(queryatmosphere);
            preparedStmt.setInt(1, wAHum);
            preparedStmt.setInt(2, wAPress);
            preparedStmt.setString(3, wAVisibility);

            preparedStmt.execute();
        }
        catch(SQLException e){

        }
    }
}
