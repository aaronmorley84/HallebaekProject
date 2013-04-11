package Resources;

/**
 *
 * @author Adrian & Kris
 */
public class Product {
    
    public int productID, volume, quantity;
    public int price;
    public String name, description;    
    
    public Product(int productID, String name, int volume, int quantity, String description, int price) {
        this.productID = productID;
        this.volume = volume;
        this.quantity = quantity;
        this.price = price;
        this.name = name;
        this.description = description;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
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
        return productID+" "+name+" "+volume+" "+quantity+" "+description+" "+price;
    }
    
}
