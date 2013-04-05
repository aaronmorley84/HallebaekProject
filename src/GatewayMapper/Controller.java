package GatewayMapper;
import Resources.*;

public class Controller {
    ProductGateway prodController;

    public Controller() {
        prodController = new ProductGateway();
    }
    public void addProduct(Product product){
        prodController.addProduct(product);
    }
    public int getProductListsize() {
        return prodController.getProductListsize();
    }
    public int getPackagetListsize() {
        return prodController.getPackagetListsize();
    }
    public Product showProducts(int index) {
        return prodController.showProducts(index);
    }
    public boolean getAllProducts() {
        return prodController.getAllProducts();
    }
    public boolean searchForProduct(String name) {
        return prodController.searchForProduct(name);
    }
    public boolean searchForProduct(int ID) {
        return prodController.searchForProduct(ID);
    }
}
