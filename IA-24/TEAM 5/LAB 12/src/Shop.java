import java.util.*;
public class Shop {

    private String name;
    private HashSet<Product> allProd = new HashSet<Product>();
    private int time_closed;

    public Shop(String name, HashSet<Product> hashSet, int clock) {
        this.name = name;
        this.allProd = hashSet;
        this.time_closed = clock;
        HashMap hashMap = new HashMap<>();
        hashMap.put(name, clock);
    }

    public Shop() {
    }

    public Shop(String name, HashSet<Product> hashSet) {
        this.name = name;
        this.allProd = hashSet;
    }

    public void addProduct(Collection<Product> productCollection) {
        this.allProd.addAll(productCollection);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashSet<Product> getHashSet() {
        return allProd;
    }

    public void setHashSet(HashSet<Product> hashSet) {
        this.allProd = hashSet;
    }

    @Override
    public String toString() {
        return name + " " + allProd.toString();
    }

    public String getTime_closed() {
        return "The magazine  " + name + " is closed in " + time_closed;
    }

    public HashSet<Product> getAllProducts() {

        return allProd;
    }
}
