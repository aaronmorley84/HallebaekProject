/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import GatewayMapper.Facade;
import Resources.Packages;
import Resources.Product;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Aaron, 19/04/2013
 */
public class PackageList {
    
    private ArrayList<Packages> packageList = new ArrayList();
    private Packages currentPackage;
    Facade facade = new Facade();
    
    public void addToPackageList(int packID, String packName, String packDesc, int packPrice){
        packageList.add(new Packages(packID, packName, packDesc, packPrice));
    }
    
    public Packages getCurrentPackage(int i){
        facade.commit();
        if (facade.lockPackage(packageList.get(i).getPackageID())){
            currentPackage = packageList.get(i);
            return currentPackage;
        }else{
            JOptionPane.showMessageDialog(null, "Package is in use!", "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public int getPackageListSize() {
        return packageList.size();
    }
    
    public void clearPackageList(){
        packageList.clear();
    }

    //These are the getters
    public int getPackID(){
        return currentPackage.getPackageID();
    }
    public String getPackName(){
        return currentPackage.getName();
    }
    public String getPackDisc(){
        return currentPackage.getDescription();
    }
    public int getPackPrice(){
        return currentPackage.getPrice();
    }
    public Product getPackageProductList(int i){
        return currentPackage.packageProductList.get(i);
    }
    
    //theses are the setter
    public void editPackName(String newName) {
        currentPackage.setName(newName);
    }
    public void editPackDisc(String newDesc) {
        currentPackage.setDescription(newDesc);
    }
    public void editPackPrice(int newPrice){
        currentPackage.setPrice(newPrice);
    }
    
    //communication to packageProductList
    public int getPackageProductListSize() {
        return currentPackage.packageProductList.size();
    }
    public boolean addItemToPackageList(Product prod) {
        return currentPackage.addItemToPackageList(prod);
    }
    public void removeFromPackageList(Product prod) {
        currentPackage.removeFromPackageList(prod);
    } 
    
   //communication to PackageGateway
    public boolean buildPackageList(PackageList packageList) {
        boolean success = false;
        if (facade.buildPackageList(packageList)){
            success = true;
        }
        else {
            JOptionPane.showMessageDialog(null, "Could not fetch packages!", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return success;
    }

    public boolean addPackage(String packName, String packDesc, int packPrice) {
        String empty = "";
        String tempPackPrice = "" + packPrice;
        boolean success = false;
        if (!packName.equals(empty) && !packDesc.equals(empty) && !tempPackPrice.equals(empty)) {
            if (facade.addPackage(packName, packDesc, packPrice)){
                JOptionPane.showMessageDialog(null, "Package Added to Database", "Success", JOptionPane.INFORMATION_MESSAGE);
                success = true;
            }else {
            JOptionPane.showMessageDialog(null, "Error Adding Package to Database", "Error", JOptionPane.ERROR_MESSAGE);
        }
        } 
        else {
            JOptionPane.showMessageDialog(null, "One or More Fields Are Empty", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return success;
    }

    public boolean addProductsToPackageInDB() {
        if (facade.addProductsToPackageInDB()) {
            JOptionPane.showMessageDialog(null, "Product Added to PackageDatabase", "Success", JOptionPane.INFORMATION_MESSAGE);
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Error Adding Product to Package Database", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean loadPackageProducts() {

        if (facade.loadPackageProducts()) {
            JOptionPane.showMessageDialog(null, "Products loaded into Packages", "Success", JOptionPane.INFORMATION_MESSAGE);
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Error loading Products from Package Database", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

    }

    public boolean deletePackageProducts() {
        if (facade.deletePackageProducts()) {
            JOptionPane.showMessageDialog(null, "Products deleted frm Package Database", "Success", JOptionPane.INFORMATION_MESSAGE);
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Error deleting Poducts from Package Database", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean deletePackage() {
        if (facade.deletePackage()) {
            JOptionPane.showMessageDialog(null, "Package deleted from Database", "Success", JOptionPane.INFORMATION_MESSAGE);

            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Error deleting Package from Database", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

    }
    

}
