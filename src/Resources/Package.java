package Resources;

/**
 *
 * @author Kris
 */
public class Package {
            
    public int packageID, price;
    public String name, description;

    public Package(int packageID, int price, String name, String description) {
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
        return "Package{" + "packageID=" + packageID + ", price=" + price + ", name=" + name + ", description=" + description + '}';
    }
    
}
