package Domain;

import GatewayMapper.Facade;
import Resources.Truck;
import Resources.TruckOrder;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Kris
 */
public class TruckList {
    Facade facade = new Facade();
    private ArrayList<Truck> trucks = new ArrayList<>();
    private ArrayList<TruckOrder> truckOrders = new ArrayList<>();;
    private ArrayList<Truck> availableTrucks = new ArrayList<>();;
    private TruckOrder currTruckOrder;
    private Truck currTruck;
    
    public void getcurrTruck(int i){ 
          this.currTruck = trucks.get(i);
    }
    
    public void getcurrTruckOrder(int i ){
        this.currTruckOrder = truckOrders.get(i);
    }
    public int getAvailableTruck(int index){
        return availableTrucks.get(index).getTruckID();
    }
    
    public void addToTruckList(int truckID, String model, int capacity){
        trucks.add(new Truck(truckID, model, capacity));
    }
    public void addToTruckOrderList(int orderID, int truckID, String status, String date){
        truckOrders.add(new TruckOrder(orderID, truckID, status, date));
    }    
    public int getTruckListSize() {
        return trucks.size();
    }    
    public int getTruckOrderListSize() {
        return truckOrders.size();
    }
    public int getAvailableTruckListSize(){
        return availableTrucks.size();
    }
    public void clearTruckList(){
        trucks.clear();
    }
    public void clearTruckOrderList(){
        truckOrders.clear();
    }
    public void clearAvailableTruckList(){
        availableTrucks.clear();
    }
    
    public void checkFreeTrucks(String date){
        System.out.println(trucks.toString());
        for (int i = 0; i < trucks.size(); i++) {
            int truckid = trucks.get(i).getTruckID();
            availableTrucks.add(trucks.get(i));
            for (int j = 0; j < truckOrders.size(); j++) {
                if(truckOrders.get(j).getTruckID() == truckid && truckOrders.get(j).getDate().equals(date)){
                    availableTrucks.remove(trucks.get(i));
                }
            }
        }
        System.out.println(availableTrucks.toString());
    }
    
    public int getTrucksRequired(int totalVolume) {
        int amountOfTrucks = 0;
        int allTrucksCapacity = 0;
        for (int i = 0; i < trucks.size(); i++) {
            allTrucksCapacity = +trucks.get(i).getTruckCapacity();
        }
        try {
            if (totalVolume < allTrucksCapacity) {
                for (int i = 0; i < trucks.size(); i++) {
                    while (totalVolume > 0) {
                        totalVolume = -trucks.get(i).getTruckCapacity();
                        amountOfTrucks++;
                    }
                }
            } else {
                System.out.println("problem in 'getTrucksRequired(int)'");
            }
        } catch (Exception e) {
            System.out.println("Something went wrong trucks required method." + e.getMessage());
        }
        return amountOfTrucks;
    }
    
    //getters for truck
    public int getTruckID(){
        return currTruck.getTruckID();
    }
    public int getTruckCapacity(){
        return currTruck.getTruckCapacity();
    }
    public String getTruckmodel(){
        return currTruck.getTruckModel();
    }
  
    //getters for truck order
    public int getTruckOrderID(){
        return currTruckOrder.getOrderID();
    }
    public int getTruckOrderTruckID(){
        return currTruckOrder.getTruckID();
    }
    public String getTruckOrderStatus(){
        return currTruckOrder.getStatus();
    }
    public String getTruckOrderDate(){
        return currTruckOrder.getDate();
    }
    
    
    
    //setters for truck
    public void editTruckID(int truckID){
        currTruck.setTruckID(truckID);
    }
    public void editTruckCapacity(int capacity){
        currTruck.setTruckCapacity(capacity);
    }
    public void editTruckModel(String model){
        currTruck.setTruckModel(model);
    }
    //setters for truck order
    public void editTruckOrderID(int orderID){
        currTruckOrder.setOrderID(orderID);
    }
    public void editTruckOrderTruckId(int truckID){
        currTruckOrder.setTruckID(truckID);
    }
    public void editTruckOrderStatus(String status){
        currTruckOrder.setStatus(status);
    }
    public void editTruckOrderDate(String date){
        currTruckOrder.setDate(date);
    }
    
    //truck gateway
    public boolean buildTruckList(TruckList trucklist){
        return facade.buildTruckList(trucklist);
    }
    public boolean buildTruckOrderList(TruckList trucklist){
        return facade.buildTruckOrderList(trucklist);
    }
    public boolean addTruckOrder(int orderid, int truckid, String status, String date){        
        if(facade.addTruckOrder(orderid,truckid,status,date)){
            JOptionPane.showMessageDialog(null, "Added truck order to database!", "Success", JOptionPane.INFORMATION_MESSAGE);
            return true;
        }else{
            JOptionPane.showMessageDialog(null, "Could not save truck order!", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    public boolean addTruck(int truckid, String model, int capacity, String bookeddate){
        return facade.addTruck(truckid, model, capacity, bookeddate);
    }
    public boolean lockTruck(int truckID){
        return facade.lockTruck(truckID);
    }
}
