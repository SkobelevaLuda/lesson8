import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ProductList {
    private final Map<Product, Integer> products = new HashMap();
    public void add(Product product, int productQuantity){
        if (products.containsKey(product)){
            throw new IllegalArgumentException(" Такой продукт уже есть");
        }
        products.put(product,productQuantity);
    }
    public void add(Product product) {
        add(product,1);
        }
    }


