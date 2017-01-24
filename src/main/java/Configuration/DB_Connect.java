package Configuration;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * Created by Usuario on 22/01/2017.
 */
@Configuration

public class DB_Connect {

        private String url = "jdbc:mysql://localhost:3306/Globant";
        private String username = "root";
        private String password = "ecchi20101992";
        private Connection conn;

        public String getUrl(){return this.url;}
        public void setUrl(String url){this.url = url;}

        public String getUsername(){return this.username;}
        public void setUsername(String username){this.username = username;}

        public String getPassword(){return this.password;}
        public void setPassword(String password){this.password = password;}

        private DB_Connect() {
            try {
                conn = DriverManager.getConnection(url, username, password);
            } catch (SQLException e) {
                conn = null;
            }
        }

        public Connection getConnection(){
            return conn;
        }
}

