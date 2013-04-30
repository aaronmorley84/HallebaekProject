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
    public boolean buildPackageList(PackageList packageList) {
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
    // method for locking packages
    public boolean lockPackage(int ID){
        boolean locked = false;
        Connection con = ConnectionTools.getInstance().getCurrentConnection();
        String sqlString = "SELECT * " 
                + "FROM packages "
                + "WHERE packageid = ? "
                + "FOR UPDATE NOWAIT";
        PreparedStatement statement = null;
        try {
            con.setAutoCommit(false);
            statement = con.prepareStatement(sqlString);
            statement.setInt(1, ID);
            statement.execute();
            locked = true;
            System.out.println("Product Locked");
        } catch (SQLException ex) {
            System.out.println("Error in lockProduct");
            System.out.println(ex.getMessage());
            }        
        return locked;
    }
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

    

    public boolean addProductsToPackageInDB(PackageList packageList) {
        boolean success = false;
        Connection con = ConnectionTools.getInstance().getCurrentConnection();
        String SQLString1 = "INSERT into package_product "
                + "VALUES (?,?,?)";
        PreparedStatement statement = null;
        for (int i = 0; i < packageList.getPackageListSize(); i++) {
            try {
                statement = con.prepareStatement(SQLString1);
                statement.setInt(1, packageList.getPackID());
                statement.setInt(2, packageList.getPackageProductList(i).getProductID());
                statement.setInt(3, packageList.getPackageProductList(i).getQuantity());
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

    public boolean loadPackageProducts(int packID, PackageList packageList) {
        boolean success = false;
        Connection con = ConnectionTools.getInstance().getCurrentConnection();
        String SQLString1 = "SELECT products.productid,products.pname,products.pvolume,package_product.quanity,products.pdescription,products.pprice "
                + "FROM products JOIN package_product ON products.productid = package_product.productid "
                + "WHERE package_product.packageid = ? ";
        
        

        PreparedStatement statement = null;
        try {
            statement = con.prepareStatement(SQLString1);
            statement.setInt(1, packID);
            ResultSet rs = statement.executeQuery();
            System.out.println("RS"+rs);
            while (rs.next()){
                packageList.addItemToPackageList(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getString(5),rs.getInt(6));
            }
            success = true;
        } catch (Exception e) {
            System.out.println("packages Insertion error!");
            System.out.println(e.getMessage());
        }

        return success;
    }
    public boolean deletePackageProducts(int packID){
        boolean success = false;
        Connection con = ConnectionTools.getInstance().getCurrentConnection();
        String SQLString1 = "DELETE FROM package_product WHERE packageid = ?";
        
        PreparedStatement statement = null;
        try {
            statement = con.prepareStatement(SQLString1);
            statement.setInt(1, packID);
            statement.executeUpdate();
            success = true;
        } catch (Exception e) {
            System.out.println("packages Delete error!");
            System.out.println(e.getMessage());
        }
        return success;
    }
    
    public boolean deletePackage(int packID){
        boolean success = false;
        Connection con = ConnectionTools.getInstance().getCurrentConnection();
        String SQLString1 = "DELETE FROM packages WHERE packageid = ?";
        
        PreparedStatement statement = null;
        try {
            statement = con.prepareStatement(SQLString1);
            statement.setInt(1, packID);
            statement.executeUpdate();
            success = true;
        } catch (Exception e) {
            System.out.println("packages Delete error!");
            System.out.println(e.getMessage());
        }
        return success;
    }
}//end of PackageGateway
