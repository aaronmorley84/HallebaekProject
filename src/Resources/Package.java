package Resources;

/**
 *
 * @author Kris
 */
public class Package {
            
    private int packageID, price;
    private String name, description;

    public Package(int packageID, String name, String description, int price) {
        this.packageID = packageID;
        this.price = price;
        this.name = name;
        this.description = description;
    }

    public int getPackageID() {
        return packageID;
    }

    public void setPackageID(int packageID) {
        this.packageID = packageID;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Package{" + "packageID=" + getPackageID() + ", price=" + getPrice() + ", name=" + getName() + ", description=" + getDescription() + "}";
    }
    
}
