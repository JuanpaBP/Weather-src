package Persistency;


import Configuration.DB_Connect;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.*;

/**
 * Created by Usuario on 18/01/2017.
 */


public class PersistCountry {



@Bean
    public void insertCountry(int cID, String cName, String cAlpha3, ApplicationContext context) {
        DB_Connect db_connect = (DB_Connect) context.getBean("springDBConnection");
        Connection conn = db_connect.getConnection();
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
}
