/**
 *
 * @author Kris
 */
public class TestUS1 {

    public static void main(String[] args) {
        Product tent = new Product(1,"small tent",2,1,"a small tent",100);
        
        Controller control = new Controller();
        control.addProduct(tent);
    }
}
