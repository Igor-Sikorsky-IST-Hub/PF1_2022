import java.util.Comparator;

public class ComparatorByAlph implements Comparator<Shop> {
    @Override
    public int compare(Shop o1, Shop o2) {
        return o1.nameOfShop.compareTo(o2.nameOfShop);
    }
}
