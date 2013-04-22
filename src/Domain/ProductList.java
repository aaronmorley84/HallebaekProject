/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import GatewayMapper.Facade;
import Resources.Product;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Aaron
 */
public class ProductList {
    
    private ArrayList<Product> productList = new ArrayList<>();
    private Product currentProduct;
    Facade facade = new Facade();
    
     public void addToProductList(int prodID, String prodName, int prodVol, int prodQTY, String prodDisc, int prodPrice) {
        productList.add(new Product(prodID, prodName, prodVol, prodQTY, prodDisc, prodPrice));
     }

    public Product getCurrentProduct(int i){
        currentProduct = productList.get(i);
        return currentProduct;
    }
    
    public int getProductListsize() {
        return productList.size();   
    }
    
    public void clearProductList(){
        productList.clear();
    }
    
    //these are the getters
    public int getProdID() {
        return currentProduct.getProductID();
    }
    
    public String getProdName() {
        return currentProduct.getName();
    }
    
    public int getProdVol() {
        return currentProduct.getVolume();
    }
    
    public int getProdQTY() {
        return currentProduct.getQuantity();
    }
    
    public String getProdDisc() {
        return currentProduct.getDescription();
    }
    
    public int getProdPrice() {
        return currentProduct.getPrice();
    }
    
    //these are the setters
    public void editProdName(String newName){
        currentProduct.setName(newName);
    }
    
    public void editProdVol(int newVol){
        currentProduct.setVolume(newVol);
    }
    
    public void editProdQTY(int newQTY){
        currentProduct.setQuantity(newQTY);
    }
    
    public void editProdDisc(String newDisc){
        currentProduct.getDescription();
    }
    
    public void editProdPrice(int newPrice){
        currentProduct.setPrice(newPrice);
    }

    //communication to productGateway
    public boolean buildProductList(ProductList productList){
        Boolean success = false;
        if (facade.buildProductList(productList)){
            success = true;
        }
        else {
            JOptionPane.showMessageDialog(null, "Could not fetch products!", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return success;
    }
    
    public boolean addProduct(String prodName, int prodVol, int prodQTY, String prodDisc, int prodPrice){
        String empty = "";
        Boolean success = false;
        String tempVol = ""+prodVol;
        String tempQTY = ""+prodQTY;
        String tempPrice = ""+prodPrice;
        if (!prodName.equals(empty) && !tempVol.equals(empty) && !tempQTY.equals(empty) && !prodDisc.equals(empty)&& !tempPrice.equals(empty)) {
            if (facade.addProduct(prodName, prodVol, prodQTY, prodDisc, prodPrice)){
                JOptionPane.showMessageDialog(null, "Product added!", "ADDED", JOptionPane.INFORMATION_MESSAGE);
            }
            else {
                JOptionPane.showMessageDialog(null, "Could not add product!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "One or more fields are empty!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return success;
    }
    
    public boolean saveEditedProduct(int prodID, String prodName, int prodVol, int prodQTY, String prodDisc, int prodPrice) {
        String empty = "";
        Boolean success = false;
        String tempVol = ""+prodVol;
        String tempQTY = ""+prodQTY;
        String tempPrice = ""+prodPrice;
        if (!prodName.equals(empty) && !tempVol.equals(empty) && !tempQTY.equals(empty) && !prodDisc.equals(empty)&& !tempPrice.equals(empty)) {
            if (facade.saveEditedProduct(prodID, prodName, prodVol, prodQTY, prodDisc, prodPrice)){
                JOptionPane.showMessageDialog(null, "Product edited!", "SAVED!", JOptionPane.INFORMATION_MESSAGE);
                success = true;
            }
            else {
                JOptionPane.showMessageDialog(null, "Could not save product!", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "One or more fields are empty!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return success;
    }
    
    public boolean deleteProduct(int prodID) {
        boolean success = false;
        if (facade.deleteProduct(prodID)){
            JOptionPane.showMessageDialog(null, "Product Deleted From database", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null, "Error Deleting Product", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return success;
    }
    
    
    //product search
    public String searchProdByNameinArray(String name) {
            
        for (int i = 0; i < productList.size(); i++) {
            getCurrentProduct(i);
            if (getProdName().equals(name)) {
                return getProdName();
            }
        }
        return "Not found";
    }
    public int searchProdByIDinArray(int ID){          
        for (int i = 0; i < getProductListsize(); i++) {
            getCurrentProduct(i);
            if(getProdID() == ID){
                
                return getProdID();
            }
        }
        return 0;
    }
    //need to be changed to java not SQL
    
    
}
