package Persistencia;

import SingletonDB.DB_Connect;

import java.sql.*;
import java.util.Calendar;

/**
 * Created by Usuario on 18/01/2017.
 */


public class PersistCountry {


    Connection conn = DB_Connect.getInstance().getCon();

    public void insertCountry(int cID, String cName, String cAlpha3) {

        try {
            String querycountry = " insert into paises (idPais, Nombre, Alpha3)" + " values (?, ?, ?)";
            PreparedStatement preparedStmt = conn.prepareStatement(querycountry);
            preparedStmt.setInt (1, cID );
            preparedStmt.setString (2, cName);
            preparedStmt.setString(3, cAlpha3);

            preparedStmt.execute();

        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
        }
    }



    public void stateInsert(int cID, String sName, String sAbbr, int sArea, String sCapital, String sLargest_city,
                               int wWSpe, String wWDir, int wAHum, int wAPress, String wAVisibility){
        try {

            String querystate = " insert into provincias (Paises_idPais, Provincia, Abreviatura, Km2, Capital, `Ciudad mas grande`)"
                    + " values (?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStmt = conn.prepareStatement(querystate);
            preparedStmt.setInt(1, cID);
            preparedStmt.setString(2, sName);
            preparedStmt.setString(3,sAbbr);
            preparedStmt.setInt(4, sArea);
            preparedStmt.setString(5, sCapital);
            preparedStmt.setString(6, sLargest_city);

            preparedStmt.execute();

            String queryvwind = "insert into vientos (velocidad, dirección)" + " values (?, ?)";
            preparedStmt = conn.prepareStatement(queryvwind);
            preparedStmt.setInt(1, wWSpe);
            preparedStmt.setString(2,wWDir);

            preparedStmt.execute();

            String queryatmosphere = "insert into atmosfera (humedad, presion, visibilidad)" + " values (?, ?, ?)";
            preparedStmt = conn.prepareStatement(queryatmosphere);
            preparedStmt.setInt(1, wAHum);
            preparedStmt.setInt(2, wAPress);
            preparedStmt.setString(3,wAVisibility);

            preparedStmt.execute();

            conn.close();


        }
        catch (SQLException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
        }

    }
}
