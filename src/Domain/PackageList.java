/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import GatewayMapper.Facade;
import Resources.Packages;
import Resources.Product;
import java.util.ArrayList;

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
        currentPackage = packageList.get(i);
        return currentPackage;
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
    public Product getProductList(int i){
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
    
    //communication to customerGateway
    public boolean buildPackageList(PackageList packageList){
        return facade.buildPackageList(packageList);
    }
    public boolean addPackage(String packName, String packDesc, int packPrice){
        return facade.addPackage(packName, packDesc, packPrice);
    }
    public boolean addProductsToPackageInDB(){
        return facade.addProductsToPackageInDB();
    }
    public boolean loadPackageProducts(){
        return facade.loadPackageProducts();
    }
    public boolean deletePackageProducts(){
        return facade.deletePackageProducts();
    }
    public boolean deletePackage(){
        return facade.deletePackage();
    }
    
    
    
    
    
    public Product getPackageProductList(int i) {
        return currentPackage.packageProductList.get(i);
    }

    public int getPackageProductListSize() {
        return currentPackage.packageProductList.size();
    }
   
    public void setCurrentPackage(Packages pack) {
        currentPackage = pack;
    }

    public boolean addItemToPackageList(Product prod) {
        return currentPackage.addItemToPackageList(prod);
    }

    public void removeFromPackageList(Product prod) {
        currentPackage.removeFromPackageList(prod);
    } 
    
    
    
    
    
    
    
    
    
    
//    public Packages getPackageList(int i) {
//        return packageList.get(i);
//    }
}
