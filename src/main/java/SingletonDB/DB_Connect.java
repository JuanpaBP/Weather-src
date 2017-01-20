package SingletonDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Usuario on 12/01/2017.
 */
public class DB_Connect {

    private String url = "jdbc:mysql://localhost:3306/Globant";
    private String username = "root";
    private String password = "ecchi20101992";
    private Connection conn;

    private static DB_Connect db_connect;


    private DB_Connect(){
        try {
            conn = DriverManager.getConnection(url, username, password);
            }
        catch(SQLException e){
        }
    }
    public Connection getCon(){
                return conn;
    }
    public static DB_Connect getInstance(){
        if(db_connect == null){
            db_connect = new DB_Connect();
            return db_connect;
        }
        else
            return db_connect;
    }


    //PreparedStatement preparedStmt = SingletonDB.DB_Connect.getInstance().getCon().prepareStatement(querycountry);


    }
