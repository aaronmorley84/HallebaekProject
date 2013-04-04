package DBConnection;

import java.sql.Connection;

public class ConnectionTools {

    private Connection con;
    private static ConnectionTools instance;

    private ConnectionTools() {
        con = new Connector().getConnection();
    }

    public static ConnectionTools getInstance() {
        if (instance == null) {
            instance = new ConnectionTools();
        }
        return instance;
    }
    
    public Connection getCurrentConnection() {
        if (con != null) {
            return con;
        }
        else {
            return null;
        }
    }
}
