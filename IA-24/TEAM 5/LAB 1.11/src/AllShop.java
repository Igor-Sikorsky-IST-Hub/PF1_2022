import java.util.*;

class ShopNameComparator implements Comparator<Shop>{
    public int compare(Shop s1,Shop s2){
        return s1.getName().compareTo(s2.getName());
    }
}

public class AllShop {
    private Set<Shop> Allshops = new TreeSet<Shop>(new ShopNameComparator());

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
