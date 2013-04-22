
package Domain;

import Resources.PickUpOrder;
import GatewayMapper.Facade;
import java.sql.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author krismaini
 */
public class PickUpList {
    Facade facade = new Facade();
    PickUpOrder curPickUp;
    
    public boolean addPickUp(int orderID, int customerID, String startDate, String finishDate){
        curPickUp = new PickUpOrder(orderID, customerID, Date.valueOf(startDate), Date.valueOf(finishDate));
        return facade.addPickUp(orderID, customerID, startDate, finishDate);
    }
}
