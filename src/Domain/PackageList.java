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
    
    public void addToPackageList(int packageID, String name, String description, int price){
        packageList.add(new Packages(packageID, name, description, price));
    }

    public Packages getPackageList(int i) {
        return packageList.get(i);
    }

    public int getPackageListSize() {
        return packageList.size();
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
}
