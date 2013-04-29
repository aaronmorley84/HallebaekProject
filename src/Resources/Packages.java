package Resources;

import java.util.ArrayList;

/**
 *
 * @author Kris
 */
public class Packages {

    private int packageID, price;
    private String name, description;
    public ArrayList<Product> packageProductList = new ArrayList();

    public Packages(int packageID, String name, String description, int price) {
        this.packageID = packageID;
        this.price = price;
        this.name = name;
        this.description = description;
    }

    public boolean addItemToPackageList(int prodID, String name, int vol, int quantity, String descrip, int price) {
        Product newProduct = new Product(prodID, name, vol, quantity, descrip, price);
        boolean success = false;
        if (!checkForDuplicate(newProduct.getProductID())) {
            success = true;
            packageProductList.add(newProduct);
        }
        return success;
    }

    public void removeFromPackageList(Product prod) {
        packageProductList.remove(prod);
    }

    public boolean checkForDuplicate(int ID) {
        boolean same = false;
        for (int i = 0; i < packageProductList.size(); i++) {
            if (packageProductList.get(i).getProductID() == ID) {
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
