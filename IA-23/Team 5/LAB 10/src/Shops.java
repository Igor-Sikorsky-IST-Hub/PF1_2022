import java.util.*;

public class Shops{
    String nameShop;
    HashMap<String , Integer> prices = new HashMap<>();
    List<Goods> goodsList = new ArrayList<Goods>();
    public Shops(String nameShop){
        this.nameShop = nameShop;
    }
    public void addAllGoods(Collection<Goods> good){
        this.goodsList.addAll(good);
    }
    public void addGood(String nameGood, int price){
        int shopPrice = (int) (price * (Math.random() * 5));
        if(shopPrice == 0)
            shopPrice = (int) (price * 0.1);
        prices.put(nameGood, shopPrice);
    }
    public int price(String nameGood) {
        if (prices.containsKey(nameGood)) {
            return prices.get(nameGood);
        } else {
            return -99;
        }
    }

    @Override
    public String toString(){
        return nameShop + " -- " + goodsList;
    }

    public Set<String> products() {
        return prices.keySet();

    }

}
