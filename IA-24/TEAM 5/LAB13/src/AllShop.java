import java.util.*;
public class AllShop {
    private HashSet<Shop> Allshops = new HashSet<Shop>();

    public AllShop(HashSet<Shop> allshops) {
        this.Allshops = allshops;
    }

    public AllShop() {
    }

    public HashSet<Shop> getAllshops() {

        return Allshops;
    }

    public void setAllshops(HashSet<Shop> allshops) {
        this.Allshops = allshops;
    }

    public void addShop(Collection<Shop> shopsHashSet) {
        this.Allshops.addAll(shopsHashSet);
    }

    @Override
    public String toString() {
        return "Allshops: " + Allshops;
    }
}