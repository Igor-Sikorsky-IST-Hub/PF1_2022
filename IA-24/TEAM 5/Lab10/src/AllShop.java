import java.util.*;

public class AllShop {
    private List<Shop> Allshops = new ArrayList<Shop>();

    public AllShop(List<Shop> allshops) {
        Allshops = allshops;
    }

    public AllShop() {
    }

    public List<Shop> getAllshops() {
        return Allshops;
    }

    public void setAllshops(List<Shop> allshops) {
        Allshops = allshops;
    }

    public void addShop(Collection<Shop> shopsCollection) {
        this.Allshops.addAll(shopsCollection);
    }

    @Override
    public String toString() {
        return "Allshops: " + Allshops;
    }
}
