import java.util.*;

public class AllShop {
    private Set<Shop> Allshops = new TreeSet<Shop>();

    public AllShop(Set<Shop> allshops) {
        Allshops = allshops;
    }

    public AllShop() {
    }

    public Set<Shop> getAllshops() {
        return Allshops;
    }

    public void setAllshops(Set<Shop> allshops) {
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
