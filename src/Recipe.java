import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;

public class Recipe {
    private String name;
    private final Map<Product, Integer> products;
    private int totalCost;

    public Recipe(String name) {
        this.name=name;
        this.products=new HashMap();
        this.totalCost=0;
    }

    public void add(Product product){
        if (products.containsKey(product)){
            throw new IllegalArgumentException(" Такой продукт уже есть");
        }
        int productQuantity=1;
        products.put(product, productQuantity);
        totalCost+=productQuantity*product.getProductPrice();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(name, recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
