package DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTools {

    private Connection con;
    private static ConnectionTools instance;

    private ConnectionTools() {
        try{
           Class.forName("oracle.jdbc.driver.OracleDriver");
           con = DriverManager.getConnection("jdbc:oracle:thin:@delfi.lyngbyes.dk:1521:KNORD", "CLCOSV12E2", "aaron");
        }
        catch (Exception e) {
            System.out.println("error in Connection");
            System.out.println(e);
        }
        
    }

    public static ConnectionTools getInstance() {
        if (instance == null) {
            instance = new ConnectionTools();
        }
        return instance;
    }
    
    public Connection getCurrentConnection() {
        if (getInstance() != null) {
            return con;
        }
        else {
            return null;
        }
    }
    
  
    
}
