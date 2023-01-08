import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Goods {
    String nameG;
    int recPrice;
    int shopPrice;

    public Goods(String nameGood, int recPrice) {
        this.nameG = nameGood;
        this.recPrice = recPrice;
    }

    public int changePrice() {
        shopPrice = (int) (recPrice * (Math.random() * 5));
        if (shopPrice == 0){
            shopPrice = recPrice;
            return shopPrice;
        }
        else{
            return shopPrice;
        }
    }

    public String toString() {
        return nameG + " -- " + changePrice();
    }
}
