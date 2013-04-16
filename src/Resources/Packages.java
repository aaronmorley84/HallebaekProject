package Resources;

import java.util.ArrayList;

/**
 *
 * @author Kris
 */
public class Packages {
            
    private int packageID, price;
    private String name, description;
    public ArrayList<Product> packageList = new ArrayList();

    public Packages(int packageID, String name, String description, int price) {
        this.packageID = packageID;
        this.price = price;
        this.name = name;
        this.description = description;
    }
    
    public boolean addItemToPackageList(Product prod){
       boolean success=false;
        if(!checkForDuplicate(prod.getProductID())){
           success = true;
           packageList.add(prod);
        }
        return success;
    }
    
    public void removeFromPackageList(Product prod) {
        packageList.remove(prod);
    }

    public boolean checkForDuplicate(int ID){
        boolean same = false;
        for (int i = 0; i < packageList.size(); i++) {
            if(packageList.get(i).getProductID() == ID){
                same = true;
            }
        }
        return same;
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
