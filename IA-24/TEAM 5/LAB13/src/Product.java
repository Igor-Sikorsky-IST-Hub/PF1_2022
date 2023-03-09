import java.util.*;

public class Product {

    private int price;
    private String product;


    public Product(String product, int price) {
        this.product = product;
        this.price = price;

    }

    public Product() {
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
