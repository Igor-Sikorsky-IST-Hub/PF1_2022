import java.util.*;

public class Product implements Comparable<Product> {
    private int price;
    private String product;

    public Product(String product, int price) {
        this.product = product;
        this.price = price;
    }

    public Product() {
    }

    //implementation Comparable interface for using with Set
    @Override 
    public int compareTo(Product a) {
        return this.product.compareTo(a.product);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return product + " price: "+ price;
    }
}
