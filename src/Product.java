import java.util.HashSet;
import java.util.Objects;

public class Product {
    String productName;
    int productPrice;
    int productQuantity;

    public Product(String productName, int productPrice, int productQuantity) {
        setProductName(productName);
        setProductPrice(productPrice);
        setProductQuantity(productQuantity);
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        if (productName==null||productName.isEmpty()){
            throw new IllegalArgumentException(" Заполните карточку товара полностью ");
        }
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        if (productPrice<=0){
            throw new IllegalArgumentException(" Заполните карточку товара полностью ");
        }
        this.productPrice = productPrice;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        if (productQuantity<=0){
            throw new IllegalArgumentException(" Заполните карточку товара полностью ");
        }
        this.productQuantity = productQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return getProductName().equals(product.getProductName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProductName());
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", productQuantity=" + productQuantity +
                '}';
    }
}
