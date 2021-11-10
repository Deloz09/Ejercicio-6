import java.util.ArrayList;

/**
 * Clase Cart
 * Encargada de simular al carro de compra, es el que maneja los productos (agrega y elimina), ordena el carrito y genera la factura.
 * 
 * @version 1.0, 08/11/2021
 * finalizacion 09/11/2021
 * 
 * @author 
 * Diego E. Lemus L. - 21469
 * Gustavo A. Gonzales P. - 21438
 */

public class Cart {
    static ArrayList<Product> products = new ArrayList<Product>();
    
    public static ArrayList<Product> getProducts() {
        return products;
    }

    public static void addProduct(Product product){
        products.add(product);
    }


}
