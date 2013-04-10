package Resources;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aaron and Lars, 10.4.2013
 */
public class Truck {
    int truckID;
    String truckName;
    int truckCapacity;
    
public void truck(int truckID, String truckName, int truckCapacity){
    this.truckID = truckID;
    this.truckName = truckName;
    this.truckCapacity = truckCapacity;
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
    
    public void truckSpaceChecker(int volume){
        
    }

}
