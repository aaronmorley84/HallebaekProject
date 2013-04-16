/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GatewayMapper;
import Resources.Packages;
import DBConnection.*;
import Resources.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author Andrew and Aaron, v0.02 11-04-2013
 */
public class PackageGateway {
    
    ArrayList<Packages>packageList = new ArrayList<Packages>();
    Packages currentPackage;
   
    
    public Packages getPackageList(int i){
        return packageList.get(i);
    }
    public int getPackageListSize(){
        return packageList.size();
    }
    
    public void setCurrentPackage(Packages pack){
        currentPackage = pack;
    }
    
    public boolean addItemToPackageList(Product prod) {
        return currentPackage.addItemToPackageList(prod);
    }

    public void removeFromPackageList(Product prod) {
        currentPackage.removeFromPackageList(prod);
    }
    
    /*This method builds an arrayList of Packages from the database. */
    public boolean buildPackageList(){
        packageList.clear();
        boolean succes = false;
       Connection con = ConnectionTools.getInstance().getCurrentConnection();
        String SQLString1 = "SELECT * " 
                + "FROM Packages";


        PreparedStatement statement = null;
       try{
           statement = con.prepareStatement(SQLString1);
           ResultSet rs = statement.executeQuery();
           while(rs.next()){
               packageList.add(new Packages(
                       rs.getInt(1),
                       
                       rs.getString(2),
                       rs.getString(3),
                       rs.getInt(4)
                       ));
           }
           succes = true;
       }catch(Exception e){
           System.out.println("Something went wrong building Packagelist" + e.getMessage());
           succes = false;
       }
       finally{
           try{
               statement.close();
           }catch(SQLException e){
               System.out.println("Could'nt close Package connection: " + e.getMessage());
           }
       }
      
       return succes;
    }//end of buildPackageList
    
    /*This methode adds a package to the database*/
    public boolean addPackage(String name, String description, int price){
        boolean succes = false;
       Connection con = ConnectionTools.getInstance().getCurrentConnection();
        String SQLString1 = "INSERT INTO Packages VALUES (packageseq.nextval,?,?,?)";


        PreparedStatement statement = null;
       try{
           statement = con.prepareStatement(SQLString1);
            statement.setString(1, name);
            statement.setString(2, description);
            statement.setInt(3, price);
            statement.executeQuery();
           succes = true;
       }catch(Exception e){
           System.out.println("Something went wrong building Packagelist" + e.getMessage());
           succes = false;
       }
       finally{
           try{
               statement.close();
           }catch(SQLException e){
               System.out.println("Could'nt close Package connection: " + e.getMessage());
           }
       }
        System.out.println("New Package Added");
       return succes;
    }//end of addPackage
    /*This methode is for printing a list of the packages*/
    public String printList(){
        String temp = "";
        for (int i = 0; i < packageList.size(); i++) {
            temp = packageList.get(i).toString();
            
        }
        return temp;
    }//end of printlist
}//end of PackageGateway
