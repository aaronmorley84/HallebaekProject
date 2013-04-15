package GatewayMapper;

import Resources.Assembler;
import Resources.Truck;
import GatewayMapper.OrderGateway;

/**
 *
 * @author Kris
 */
public class CheckerGateway {
    OrderGateway og;
    
    public CheckerGateway(OrderGateway og){
        this.og = og;
    }
    /*
     * US 3.3
     * User can check if delivery truck(s)
     * is available for given date from
     * customer order table.
     */
    public boolean checkTruckAvailability(int truckID, String date){
        boolean available = false;
        
        return available;
    }
}
