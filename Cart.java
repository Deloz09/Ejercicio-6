import java.util.ArrayList;

public class Cart {
    static ArrayList<Product> products = new ArrayList<Product>();
    
    public static ArrayList<Product> getProducts() {
        return products;
    }

    public static void addProduct(Product product){
        products.add(product);
    }


}
