import java.util.*;

public class Shop {
    private String name;
    private List<Product> list = new ArrayList<Product>();

    public Shop(String name, List<Product> list) {
        this.name = name;
        this.list = list;
    }

    public Shop() {
    }

    public void addProduct(Collection<Product> productCollection) {
        this.list.addAll(productCollection);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getList() {
        return list;
    }

    public void setList(List<Product> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return name + " " + list.toString();
    }
}
