
import java.util.Set;
import java.util.TreeSet;

public class SearchService{
    String nameOfShop;
    Set<Shop> listOfShops = new TreeSet<>();

    public SearchService(Set<Shop> listOfShops) {
        this.listOfShops = listOfShops;
    }

    @Override
    public String toString() {
        return "" + listOfShops;
    }
}
