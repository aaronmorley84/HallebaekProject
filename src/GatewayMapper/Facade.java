/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GatewayMapper;
import Domain.CustomerList;
import Domain.ProductList;

/**
 *
 * @author Aaron
 */
public class Facade {
    
    
    //Customer gateway
    public boolean buildCustomerList(CustomerList customerList){
        CustomerGateway cg = new CustomerGateway();
        return cg.buildCustomerList(customerList);
    }
    public boolean addCustomer(String name, String address, String email){
        CustomerGateway cg = new CustomerGateway();
        return cg.addCustomer(name, address, email);
    }
    public boolean saveEditedCustomer(int cusID, String cusName, String cusAddress, String cusEmail) {
         CustomerGateway cg = new CustomerGateway();
        return cg.saveEditedCustomer(cusID, cusName, cusAddress, cusEmail);
    }
    public boolean deleteCustomer(int cusID) {
         CustomerGateway cg = new CustomerGateway();
        return cg.deleteCustomer(cusID);
    }
    
    //Product Gateway
    public boolean buildProductList(ProductList productList){
        ProductGateway pg = new ProductGateway();
        return pg.buildProductList(productList);
    }
    public boolean addProduct(String prodName, int prodVol, int prodQTY, String prodDisc, int prodPrice){
        ProductGateway pg = new ProductGateway();
        return pg.addProduct(prodName, prodVol, prodQTY, prodDisc, prodPrice);
    }
    public boolean saveEditedProduct(int prodID, String prodName, int prodVol, int prodQTY, String prodDisc, int prodPrice) {
         ProductGateway pg = new ProductGateway();
        return pg.saveEditedProduct(prodID, prodName, prodVol, prodQTY, prodDisc, prodPrice);
    }
    public boolean deleteProduct(int ProdID) {
         ProductGateway pg = new ProductGateway();
        return pg.deleteProduct(ProdID);
    }
    
}
