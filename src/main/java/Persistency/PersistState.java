package Persistency;


import Configuration.DB_Connect;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by Usuario on 18/01/2017.
 */
public class PersistState {



@Bean
    public void insertState(int cID, String sName, String sAbbr, int sArea, String sLargest_city, String sCapital,
                            ApplicationContext context) {
        DB_Connect db_connect = (DB_Connect) context.getBean("springDBConnection");
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

            preparedStmt.execute();
        }
        catch(SQLException e) {
            System.out.println("Something went wrong");
        }
    }
}
