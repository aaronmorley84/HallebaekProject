
package GatewayMapper;

import DBConnection.ConnectionTools;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author krismaini
 */
public class PickUpGateway {
        
    /*Sets the pick-up date in current order aswell as saving to DB*/
    public boolean addPickUp(int orderID, int customerID, String startDate, String finishDate){
        
        boolean success = false;
        Connection con = ConnectionTools.getInstance().getCurrentConnection();
        String SQLString1 = "INSERT INTO order_pickup "
                            + "VALUES (?, ?, ?, ?) ";
        PreparedStatement statement = null;
        try {
            statement = con.prepareStatement(SQLString1);
            statement.setInt(1, orderID);
            statement.setInt(2, customerID);
            statement.setDate(3, Date.valueOf(startDate));
            statement.setDate(4, Date.valueOf(finishDate));
            statement.executeUpdate();
            success = true;
            
        }catch (Exception e){
            System.out.println("Problem setting pick up time!");
            System.out.println(e.getMessage());
        }
        finally{
            try{
                statement.close();
            }catch (SQLException e){
                System.out.println("Problem closing statement!");
                System.out.println(e.getMessage());
            }
        }
        return success;
    }
}
