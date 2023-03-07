import java.util.*;

public class Main {
    public static void main(String[] args) {
        task1("Iphone 45X");
        task2("Witcher 3");
        task3();
    }

    static Set<Good> listOfGoods() {
        Set<Good> listOfGoods = new HashSet<>();
        listOfGoods.add(new Good("PlayStation 5", 35));
        listOfGoods.add(new Good("Iphone 45X", 99));
        listOfGoods.add(new Good("Witcher 3", 19));
        listOfGoods.add(new Good("Red Dead Redemption 3", 14));
        return listOfGoods;
    }

    static Set<Shop> listOfGoodsInRzk() {
        Set<Shop> listOfGoodsInRzk = new HashSet<>();
        listOfGoodsInRzk.add(new Shop("PlayStation 5", 37));
        listOfGoodsInRzk.add(new Shop("Iphone 45X", 100));
        listOfGoodsInRzk.add(new Shop("Witcher 3", 23));
        listOfGoodsInRzk.add(new Shop("Red Dead Redemption 3", 19));
        return listOfGoodsInRzk;
    }

    static Set<Shop> listOfGoodsInFoxtrot() {
        Set<Shop> listOfGoodsInFoxtrot = new HashSet<>();
        listOfGoodsInFoxtrot.add(new Shop("PlayStation 5", 34));
        listOfGoodsInFoxtrot.add(new Shop("Iphone 45X", 98));
        listOfGoodsInFoxtrot.add(new Shop("Witcher 3", 18));
        listOfGoodsInFoxtrot.add(new Shop("Red Dead Redemption 3", 13));
        return listOfGoodsInFoxtrot;
    }

    static Set<Shop> listOfGoodsInAllo() {
        Set<Shop> listOfGoodsInAllo = new HashSet<>();
        listOfGoodsInAllo.add(new Shop("PlayStation 5", 39));
        listOfGoodsInAllo.add(new Shop("Iphone 45X", 115));
        listOfGoodsInAllo.add(new Shop("Witcher 3", 22));
        listOfGoodsInAllo.add(new Shop("Red Dead Redemption 3", 18));
        return listOfGoodsInAllo;
    }

    static Set<SearchService> listOfGoodsInShops() {
        Set<SearchService> listOfGoodsInShops = new HashSet<>();
        listOfGoodsInShops.add(new SearchService("Rozetka", listOfGoodsInRzk()));
        listOfGoodsInShops.add(new SearchService("Foxtrot", listOfGoodsInFoxtrot()));
        listOfGoodsInShops.add(new SearchService("Allo", listOfGoodsInAllo()));
        return listOfGoodsInShops;
    }

    static void task1(String needsGood) {
        Set<SearchService> listOfShopsAndGoods = listOfGoodsInShops();
        Set<Shop> sortedList = new HashSet<>();
        for (SearchService goodsInShop : listOfShopsAndGoods) {
            for (Shop goodInShop : goodsInShop.listOfGoodsInShop) {
                if (goodInShop.nameOfGood.equals(needsGood)) {
                    sortedList.add(new Shop(goodsInShop.nameOfShop, goodInShop.nameOfGood, goodInShop.price));
                }
            }
        }
        System.out.println("Мінімальна ціна на товар \"" + needsGood + "\" в магазині - " + sortedList.iterator().next().nameOfShop);
    }


    static void task2(String needsGood) {
        Map<Set<Shop>, String> mapOfShops = new HashMap<>();
        mapOfShops.put(listOfGoodsInRzk(), "Rozetka");
        mapOfShops.put(listOfGoodsInFoxtrot(), "Foxtrot");
        mapOfShops.put(listOfGoodsInAllo(), "Allo");
        Set<Shop> sortedSet = new HashSet<>();
        for (Iterator<Set<Shop>> goodsInShops = mapOfShops.keySet().iterator(); goodsInShops.hasNext(); ) {
            Set<Shop> goodsInShop = goodsInShops.next();
            for (Iterator goods = goodsInShop.iterator(); goods.hasNext(); ) {
                Object good = goods.next();
                if (good.toString().equals(needsGood)) {
                    for (Shop goodInShop : goodsInShop) {
                        if (goodInShop.nameOfGood.equals(good.toString())) {
                            sortedSet.add(new Shop(mapOfShops.get(goodsInShop), needsGood, goodInShop.price));
                        }
                    }
                }
            }
        }
        System.out.print("Список магазинів розташованих за зростанням ціни на товар \"" + needsGood + "\": ");
        for (Iterator<Shop> goods = sortedSet.iterator(); goods.hasNext(); ) {
            System.out.print(goods.next().nameOfShop + "  ");
        }
        System.out.println();
    }

    static void task3() {
        Set<Good> listOfGoods = listOfGoods();
        Set<SearchService> listOfShopsAndGoods = listOfGoodsInShops();
        for (Iterator<SearchService> shopsWithGoods = listOfShopsAndGoods.iterator(); shopsWithGoods.hasNext(); ) {
            SearchService shopWhithGoods = shopsWithGoods.next();
            int counter = 0;
            for (Iterator<Shop> goodsInShop = shopWhithGoods.listOfGoodsInShop.iterator(); goodsInShop.hasNext(); ) {
                Shop goodInShop = goodsInShop.next();
                for (Iterator<Good> goods = listOfGoods.iterator(); goods.hasNext(); ) {
                    Good good = goods.next();
                    if (goodInShop.nameOfGood.equals(good.nameOfGood) && goodInShop.price < good.recPrice) {
                        counter++;
                    }
                }
                if (counter == listOfGoods.size()) {
                    System.out.println("У магазині \"" + shopWhithGoods.nameOfShop + "\" можна придбати товари по цінам, дешевшим ніж рекомендована ціна виробника");
                }
            }
        }
    }
}


class SearchService {
    Set<Shop> listOfGoodsInShop = new HashSet<>();
    String nameOfShop;

    public SearchService(String nameOfShop, Set<Shop> listOfGoodsInShop) {
        this.listOfGoodsInShop = listOfGoodsInShop;
        this.nameOfShop = nameOfShop;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SearchService that = (SearchService) o;
        return nameOfShop.equals(that.nameOfShop);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfShop);
    }
}

class Shop {
    String nameOfShop;
    String nameOfGood;
    int price;

    public Shop(String nameOfGood, int price) {
        this.nameOfGood = nameOfGood;
        this.price = price;
    }


    public Shop(String nameOfShop, String nameOfGood, int price) {
        this.nameOfShop = nameOfShop;
        this.nameOfGood = nameOfGood;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shop shop = (Shop) o;
        return price == shop.price && nameOfShop.equals(shop.nameOfShop) && nameOfGood.equals(shop.nameOfGood);
    }

    @Override
    public int hashCode() {
        return price;
    }

    @Override
    public String toString() {
        return nameOfGood;
    }
}

class Good {
    String nameOfGood;
    int recPrice;

    public Good(String nameOfGood, int price) {
        this.nameOfGood = nameOfGood;
        this.recPrice = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Good good = (Good) o;
        return recPrice == good.recPrice && nameOfGood.equals(good.nameOfGood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfGood, recPrice);
    }
}