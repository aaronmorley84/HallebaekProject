package Domain;

import GatewayMapper.Facade;
import Resources.Truck;
import Resources.TruckOrder;
import java.util.ArrayList;

/**
 *
 * @author Kris
 */
public class TruckList {
    Facade facade = new Facade();
    private ArrayList<Truck> trucks;
    private ArrayList<TruckOrder> truckOrders;
    private TruckOrder currTruckOrder;
    private Truck currTruck;
    
    public void currTruck(int i){
        this.currTruck = trucks.get(i);
      
    }
    
    public void currTruckOrder(int i ){
        this.currTruckOrder = truckOrders.get(i);
    }
    
    public void addToTruckList(int truckID, String model, int capacity, String bookdate){
        trucks.add(new Truck(truckID, model, capacity, bookdate));
    }
    public void addToTruckOrderList(int orderID, int truckID, String status, String date){
        truckOrders.add(new TruckOrder(orderID, truckID, status, date));
    }
    public void addTruckToTruckOrder(Truck truck){
        currTruckOrder.addTruck(truck);
    }
    public void removeTruckFromTruckOrder(Truck truck){
        currTruckOrder.removeTruck(truck);
    }
    public int getTruckListSize() {
        return trucks.size();
    }
    public int getTruckOrderListSize() {
        return truckOrders.size();
    }
    public void clearTruckList(){
        trucks.clear();
    }
    public void clearTruckOrderList(){
        truckOrders.clear();
    }
        public void checkFreeTrucks(String date){
        for (Truck truck1 : trucks) {
            for (TruckOrder truckorder1 : truckOrders) {
                if(truckorder1.getTruckID() == truck1.getTruckID()){
                    truck1.setBookDate(truckorder1.getDate());
                }
            }
            
        }
        for (int i = 0; i < trucks.size(); i++) {
            System.out.println(trucks.get(i).getBookDate());
            if(trucks.get(i).getBookDate().contains(date)){
                trucks.remove(i);//needs work
            }
        }
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
            System.out.println("Something went wrong trucks required method.");
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
    public String getTruckDate(){
        return currTruck.getBookDate();
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
    public void editTruckDate(String date){
        currTruck.setBookDate(date);
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
        return facade.addTruckOrder(orderid,truckid,status,date);
    }
    public boolean addTruck(int truckid, String model, int capacity, String bookeddate){
        return facade.addTruck(truckid, model, capacity, bookeddate);
    }

}
