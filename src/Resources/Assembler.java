package Resources;


/**
 *
 * @author Kris
 */
public class Assembler {
    boolean available;
    String name, phoneNumber;
    int assemblerID;

    public Assembler(boolean available, String name, String phoneNumber, int assemblerID) {
        this.available = available;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.assemblerID = assemblerID;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAssemblerID() {
        return assemblerID;
    }

    public void setAssemblerID(int assemblerID) {
        this.assemblerID = assemblerID;
    }
    
    public String toString(){
        return "";
    }
}
