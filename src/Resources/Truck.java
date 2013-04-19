package Resources;

/**
 *
 * @author Aaron and Lars, 10.4.2013
 */
public class Truck {
    int truckID;
    String truckName;
    int truckCapacity;
    String bookdate;
    
public Truck(int truckID, String truckName, int truckCapacity, String bookdate){
    this.truckID = truckID;
    this.truckName = truckName;
    this.truckCapacity = truckCapacity;
    this.bookdate = bookdate;
}   
    public String getTruckModel(){
        return truckName;
    }
    public void setTruckModel(String model){
        this.truckName = model;
    }
    public String getBookDate(){
        return bookdate;
    }
    public void setBookDate(String bookdate){
        this.bookdate = bookdate;
    }
    public int getTruckID(){
        return truckID;
    }
    public void setTruckID(int truckID) {
        this.truckID = truckID;
    }

    public void setTruckName(String truckName) {
        this.truckName = truckName;
    }

    public void setTruckCapacity(int truckCapacity) {
        this.truckCapacity = truckCapacity;
    }

    public int getTruckCapacity() {
        return truckCapacity;
    }
    public String toString(){
        return truckID +""+ truckName +""+ truckCapacity +""+ bookdate;
    }
    
    //this method checks if there is space in the truck for the order. If there is it will return true
    public boolean truckSpaceChecker(int volume){
        boolean spaceChecker = false;
        if (getTruckCapacity() >= volume){
            spaceChecker = true;
        }
        return spaceChecker;
    }

}
