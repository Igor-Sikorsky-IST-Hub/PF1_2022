import java.util.Set;
import java.util.TreeSet;

public class Shop implements Comparable<Shop>{
    String nameOfShop;
    String nameOfGood;
    Set<Shop> setOfGoods = new TreeSet<>();
    Set<Goods> newSetOfGoods = new TreeSet<>();
    int price;

    public Shop(String nameOfShop, Set setOfGoods) {
        this.nameOfShop = nameOfShop;
        this.setOfGoods = setOfGoods;
    }

    public Shop(String nameOfShop) {
        this.nameOfShop = nameOfShop;
    }

    @Override
    public String toString() {
        return nameOfShop ;
    }
    public Shop(String nameOfGood, int price) {
        this.nameOfGood = nameOfGood;
        this.price = price;
    }


    public String toStringNameGood() {
        return "--" + newSetOfGoods;
    }

    public Shop(String nameOfShop, String nameOfGood, int price) {
        this.nameOfShop = nameOfShop;
        this.nameOfGood = nameOfGood;
        this.price = price;
    }

    @Override
    public int compareTo(Shop o) {
        return this.nameOfGood.compareTo(o.nameOfGood);
    }
}

