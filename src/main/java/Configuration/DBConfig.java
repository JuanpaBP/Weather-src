package Configuration;

/**
 * Created by Usuario on 02/02/2017.
 */
public class DBConfig {
    private DB_Connect db_connect;
    private String url = "jdbc:mysql://localhost:3306/Globant";
    private String username = "root";
    private String password = "ecchi20101992";

    public DB_Connect getDb_connect() {
        return db_connect;
    }

    public void setDb_connect(DB_Connect db_connect) {
        this.db_connect = db_connect;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
