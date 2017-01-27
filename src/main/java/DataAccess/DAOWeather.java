package DataAccess;

import Configuration.DB_Connect;
import Domain.Weather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DAOWeather {


    @Autowired //Busca un bean automaticamente que matchee el nombre de la clase.
    DB_Connect db_connect;


    @Bean
    public void insertWeather(Weather w) {

        //DB_Connect db_connect = (DB_Connect) context.getBean("springDBConnection");

        Connection conn = db_connect.getConnection();
        try {
            String querywind = "insert into vientos (velocidad, dirección)" + " values (?, ?)";
            PreparedStatement preparedStmt = conn.prepareStatement(querywind);
            preparedStmt.setInt(1, w.getSpeed());
            preparedStmt.setString(2, w.getDirection());

            preparedStmt.execute();

            String queryatmosphere = "insert into atmosfera (humedad, presion, visibilidad)" + " values (?, ?, ?)";
            preparedStmt = conn.prepareStatement(queryatmosphere);
            preparedStmt.setInt(1, w.getaHumidity());
            preparedStmt.setFloat(2, w.getPressure());
            preparedStmt.setString(3, w.getText());

            preparedStmt.execute();

            String queryTemp = "insert into `Dia Actual` (Fecha, Temperatura, `Temperatura Mínima`, `Temperatura Maxima`)"
                    + "values (?, ?, ?, ?)";
            preparedStmt = conn.prepareStatement(queryTemp);
            preparedStmt.setString(1, w.getToday());
            preparedStmt.setInt(2,w.getTemp());
            preparedStmt.setInt(3,w.getMinTemperature());
            preparedStmt.setInt(4,w.getMaxTemperature());

            preparedStmt.execute();

        }
        catch(SQLException e){

        }
    }
}
