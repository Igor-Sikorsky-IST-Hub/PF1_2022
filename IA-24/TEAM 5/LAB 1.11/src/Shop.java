import java.util.*;

public class Shop implements Comparable<Shop> {
    private String name;
    private Set<Product> products = new TreeSet<Product>();

    public Shop(String name, Set<Product> products) {
        this.name = name;
        this.products = products;
    }

    public Shop() {
    }

    //implementation Comparable interface for using with Set
    @Override 
    public int compareTo(Shop a) {
        return this.name.compareTo(a.name);
    }

    public void addProduct(Collection<Product> productCollection) {
        this.products.addAll(productCollection);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return name + " " + products.toString();
    }
}
