package DataAccess;


import Configuration.DB_Connect;

import Domain.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.sql.*;

/**
 * Created by Usuario on 18/01/2017.
 */

@Component
public class DAOCountry {

@Autowired
DB_Connect db_connect;

@Bean
    public String insertCountry(Country c) {
        Connection conn = db_connect.getConnection();
        try {
            String querycountry = " insert into paises (Nombre, Alpha3)" + " values (?, ?)";
            PreparedStatement preparedStmt = conn.prepareStatement(querycountry);
            preparedStmt.setString (1,c.getName());
            preparedStmt.setString(2,c.getAlpha3());

            preparedStmt.execute();
            return "Success";
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
        }
    }
}
