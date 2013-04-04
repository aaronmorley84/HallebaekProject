
import DBConnection.ConnectionTools;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Kris
 */
public class ProductrController {

    ArrayList<Product> products;
    ArrayList<Package> packages;

    public ProductrController() {
        products = new ArrayList<>();
        packages = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void addPackage(Package pack) {
        packages.add(pack);
    }

    public int getProductListsize() {
        return products.size();
    }

    public int getPackagetListsize() {
        return packages.size();
    }

    public Product showProducts(int index) {
        if (index < products.size()) {
            return products.get(index);
        } else {
            return null;
        }
    }

    public boolean getAllProducts() {
        Connection con = ConnectionTools.getInstance().getCurrentConnection();
        boolean success = false;
        String SQLstring = "SELECT * "
                + "FROM products";

        PreparedStatement statement = null;
        try {
            statement = con.prepareStatement(SQLstring);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                products.add(new Product(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getInt(4),
                        rs.getString(5),
                        rs.getInt(6)));
            }
            success = true;
        } catch (Exception e) {
            System.out.println("Retrieval error!");
            System.out.println(e.getMessage());
            success = false;
        }
        finally {
            try {
                statement.close();
            }catch(SQLException e) {
                System.out.println("Statement close error!");
                System.out.println(e.getMessage());
            }
        } 
        return success;
    }
}
