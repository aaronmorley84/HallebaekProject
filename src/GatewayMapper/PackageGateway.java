/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GatewayMapper;


import DBConnection.*;
import Domain.PackageList;
import Resources.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author Andrew and Aaron, v0.02 11-04-2013
 */
public class PackageGateway {
    PackageList packageList;
    

    /*This method builds an arrayList of Packages from the database. */
    public boolean buildPackageList() {
        boolean succes = false;
        Connection con = ConnectionTools.getInstance().getCurrentConnection();
        String SQLString1 = "SELECT * "
                + "FROM Packages";


        PreparedStatement statement = null;
        try {
            statement = con.prepareStatement(SQLString1);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                packageList.addToPackageList(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4));
            }
            succes = true;
        } catch (Exception e) {
            System.out.println("Something went wrong building Packagelist" + e.getMessage());
            succes = false;
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                System.out.println("Could'nt close Package connection: " + e.getMessage());
            }
        }

        return succes;
    }//end of buildPackageList

    /*This methode adds a package to the database*/
    public boolean addPackage(String name, String description, int price) {
        boolean succes = false;
        Connection con = ConnectionTools.getInstance().getCurrentConnection();
        String SQLString1 = "INSERT INTO Packages VALUES (packageseq.nextval,?,?,?)";


        PreparedStatement statement = null;
        try {
            statement = con.prepareStatement(SQLString1);
            statement.setString(1, name);
            statement.setString(2, description);
            statement.setInt(3, price);
            statement.executeQuery();
            succes = true;
        } catch (Exception e) {
            System.out.println("Something went wrong building Packagelist" + e.getMessage());
            succes = false;
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                System.out.println("Could'nt close Package connection: " + e.getMessage());
            }
        }
        System.out.println("New Package Added");
        return succes;
    }//end of addPackage
    /*This methode is for printing a list of the packages*/

    

    public boolean addProductsToPackageInDB() {
        boolean success = false;
        Connection con = ConnectionTools.getInstance().getCurrentConnection();
        String SQLString1 = "INSERT into package_product "
                + "VALUES (?,?,?)";
        PreparedStatement statement = null;
        for (int i = 0; i < currentPackage.packageProductList.size(); i++) {
            try {
                statement = con.prepareStatement(SQLString1);
                statement.setInt(1, currentPackage.getPackageID());
                statement.setInt(2, currentPackage.packageProductList.get(i).getProductID());
                statement.setInt(3, currentPackage.packageProductList.get(i).getQuantity());
                statement.executeUpdate();
                success = true;
            } catch (Exception e) {
                System.out.println("packages Insertion error!");
                System.out.println(e.getMessage());

            } finally {
                try {
                    statement.close();
                } catch (SQLException e) {
                    System.out.println("Statement close error!");
                    System.out.println(e.getMessage());
                }
            }
        }
        return success;
    }

    public boolean loadPackageProducts() {
        boolean success = false;
        Connection con = ConnectionTools.getInstance().getCurrentConnection();
        String SQLString1 = "SELECT products.productid,products.pname,products.pvolume,package_product.quanity,products.pdescription,products.pprice "
                + "fROM products JOIN package_product ON products.productid = package_product.productid "
                + "WHERE package_product.packageid = ?";
        

        PreparedStatement statement = null;
        try {
            statement = con.prepareStatement(SQLString1);
            statement.setInt(1, currentPackage.getPackageID());
            ResultSet rs = statement.executeQuery();
            while (rs.next()){
                currentPackage.packageProductList.add(new Product(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getString(5),rs.getInt(6)));
            }
        } catch (Exception e) {
            System.out.println("packages Insertion error!");
            System.out.println(e.getMessage());
        }

        return success;
    }
    public boolean deletePackageProducts(){
        boolean success = false;
        Connection con = ConnectionTools.getInstance().getCurrentConnection();
        String SQLString1 = "DELETE FROM package_product WHERE packageid = ?";
        
        PreparedStatement statement = null;
        try {
            statement = con.prepareStatement(SQLString1);
            statement.setInt(1, currentPackage.getPackageID());
            statement.executeUpdate();
        } catch (Exception e) {
            System.out.println("packages Delete error!");
            System.out.println(e.getMessage());
        }
        return success;
    }
    
    public boolean deletePackage(){
        boolean success = false;
        Connection con = ConnectionTools.getInstance().getCurrentConnection();
        String SQLString1 = "DELETE FROM packages WHERE packageid = ?";
        
        PreparedStatement statement = null;
        try {
            statement = con.prepareStatement(SQLString1);
            statement.setInt(1, currentPackage.getPackageID());
            statement.executeUpdate();
        } catch (Exception e) {
            System.out.println("packages Delete error!");
            System.out.println(e.getMessage());
        }
        return success;
    }
}//end of PackageGateway
