package DataAccess;


import Configuration.DB_Connect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static com.sun.corba.se.impl.util.Utility.printStackTrace;

/**
 * Created by Usuario on 18/01/2017.
 */
public class DAOState {

    @Autowired //Busca un bean automaticamente que matchee el nombre de la clase.}
    DB_Connect db_connect;

@Bean
    public void insertState(int cID, String sName, String sAbbr, int sArea, String sLargest_city, String sCapital) {

        Connection conn = db_connect.getConnection();
        try {
            String querystate = " insert into provincias (Paises_idPais, Provincia, Abreviatura, Km2, Capital, `Ciudad mas grande`)"
                    + " values (?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStmt;
            preparedStmt = conn.prepareStatement(querystate);
            preparedStmt.setInt(1, cID);
            preparedStmt.setString(2, sName);
            preparedStmt.setString(3, sAbbr);
            preparedStmt.setInt(4, sArea);
            preparedStmt.setString(5, sCapital);
            preparedStmt.setString(6, sLargest_city);

            preparedStmt.executeUpdate();
        }
        catch(SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
