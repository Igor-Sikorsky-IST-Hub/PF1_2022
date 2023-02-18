import java.util.*;

public class Main {
    public static void task1( String needsGood) {
        Set<Shop> setRzk = new TreeSet<>();
        setRzk.add(new Shop("PlayStation 5", 37));
        setRzk.add(new Shop("Iphone 45X", 100));
        setRzk.add(new Shop("Witcher 3", 23));
        setRzk.add(new Shop("Red Dead Redemption 3", 19));
        Shop rzk = new Shop("Rozetka", setRzk);


        Set<Shop> setFoxtrot = new TreeSet<>();
        setFoxtrot.add(new Shop("PlayStation 5", 34));
        setFoxtrot.add(new Shop("Iphone 45X", 98));
        setFoxtrot.add(new Shop("Witcher 3", 18));
        setFoxtrot.add(new Shop("Red Dead Redemption 3", 13));
        Shop foxtrot = new Shop("Foxtrot", setFoxtrot);

        Set<Shop> setAllo = new TreeSet<>();
        setAllo.add(new Shop("PlayStation 5", 39));
        setAllo.add(new Shop("Iphone 45X", 115));
        setAllo.add(new Shop("Witcher 3", 22));
        setAllo.add(new Shop("Red Dead Redemption 3", 18));
        Shop allo = new Shop("Allo", setAllo);

        ComparatorByAlph comparator1 = new ComparatorByAlph();
        Set<Shop> listOfShops = new TreeSet<>(comparator1);
        listOfShops.add(rzk);
        listOfShops.add(foxtrot);
        listOfShops.add(allo);
        SearchService list = new SearchService(listOfShops);
        System.out.println("Список магазинів: " + list);

        for (Iterator<Shop> rzkIterator = rzk.setOfGoods.iterator(); rzkIterator.hasNext();){
            Shop goodInRzk = rzkIterator.next();
            for (Iterator<Shop> foxtrotIterator = foxtrot.setOfGoods.iterator(); foxtrotIterator.hasNext();){
                Shop goodInFoxtrot = foxtrotIterator.next();
                for (Iterator<Shop> alloIterator = allo.setOfGoods.iterator(); alloIterator.hasNext();){
                    Shop goodInAllo = alloIterator.next();
                    if (goodInRzk.nameOfGood.equals(needsGood) && goodInFoxtrot.nameOfGood.equals(needsGood) && goodInAllo.nameOfGood.equals(needsGood)) {
                        if (goodInRzk.price < goodInFoxtrot.price && goodInRzk.price < goodInAllo.price)
                            System.out.println("Мінімальна ціна на товар \"" + needsGood + "\"" + " в мазазині " + rzk.nameOfShop);
                        else if (goodInRzk.price > goodInFoxtrot.price && goodInFoxtrot.price < goodInAllo.price)
                            System.out.println("Мінімальна ціна на товар \"" + needsGood + "\"" + " в мазазині " + foxtrot.nameOfShop);
                        else if (goodInRzk.price > goodInAllo.price && goodInFoxtrot.price > goodInAllo.price)
                            System.out.println("Мінімальна ціна на товар \"" + needsGood + "\"" + " в мазазині " + allo.nameOfShop);
                    }

                }

            }

        }
    }
    public static void task2( String needsListGoods) {
        Shop shops2 = new Shop("Foxtrot");
        shops2.newSetOfGoods.add(new Goods("PlayStation 5", 34));
        shops2.newSetOfGoods.add(new Goods("Iphone 45X", 98));
        shops2.newSetOfGoods.add(new Goods("Witcher 3", 18));
        shops2.newSetOfGoods.add(new Goods("Red Dead Redemption 3", 13));


        Shop shops3 = new Shop("Allo");
        shops3.newSetOfGoods.add(new Goods("PlayStation 5", 39));
        shops3.newSetOfGoods.add(new Goods("Iphone 45X", 115));
        shops3.newSetOfGoods.add(new Goods("Witcher 3", 22));
        shops3.newSetOfGoods.add(new Goods("Red Dead Redemption 3", 18));

        ComparatorByPrice comparator = new ComparatorByPrice();
        Set<Goods> sortedGoods = new TreeSet<>(comparator);

        Goods first = new Goods("PlayStation 5", 35);
        Goods second = new Goods("Iphone 45X", 99);
        Goods third = new Goods("Witcher 3", 19);
        Goods four = new Goods("Red Dead Redemption 3", 14);

        Shop shops1 = new Shop("Rozetka");

        shops1.newSetOfGoods.add(first);
        shops1.newSetOfGoods.add(second);
        shops1.newSetOfGoods.add(third);
        shops1.newSetOfGoods.add(four);

        for (Iterator shopRzk = shops1.newSetOfGoods.iterator(); shopRzk.hasNext();) {
            Object abc = shopRzk.next();

            for (Iterator shopAllo = shops2.newSetOfGoods.iterator(); shopAllo.hasNext();) {
                Object adc = shopAllo.next();

                for (Iterator shopFxt = shops3.newSetOfGoods.iterator(); shopFxt.hasNext();) {
                    Object acc = shopFxt.next();

                    if (abc.toString().equals(needsListGoods) && adc.toString().equals(needsListGoods) && acc.toString().equals(needsListGoods)) {
                        for (Goods names: shops1.newSetOfGoods) {
                            if(abc.equals(names)) {
                                sortedGoods.add(names);
                            }}

                        for (Goods names1: shops2.newSetOfGoods){
                            if(adc.equals(names1)) {
                                sortedGoods.add(names1);
                                }}

                        for (Goods names2: shops3.newSetOfGoods){
                            if(acc.equals(names2)) {
                                sortedGoods.add(names2);
                                    }
                        }
                        System.out.print("Список магазинів розташованих за зростанням ціни на товар \"" + needsListGoods + "\": ");
                        for (Goods nameOfShop : sortedGoods) {
                            for (Goods goodNames : shops1.newSetOfGoods) {
                                if (nameOfShop.recPrice == goodNames.recPrice && nameOfShop.equals(goodNames)) {
                                    System.out.println(shops1.nameOfShop + " -- " + nameOfShop.recPrice);
                                }
                                }
                            for (Goods goodNames1 : shops2.newSetOfGoods){
                                if (nameOfShop.recPrice == goodNames1.recPrice && nameOfShop.equals(goodNames1)) {
                                    System.out.println(shops2 + " -- " + nameOfShop.recPrice);
                                }
                            }
                            for (Goods goodNames2 : shops3.newSetOfGoods){
                                if (nameOfShop.recPrice == goodNames2.recPrice && nameOfShop.equals(goodNames2)) {
                                    System.out.println(shops3.nameOfShop + " -- " + nameOfShop.recPrice);
                                }
                            }


                        }

                    }
                }
            }
        }
    }
    public static void task3() {
        Goods good1 = new Goods("PlayStation 5", 35);
        Goods good2 = new Goods("Iphone 45X", 99);
        Goods good3 = new Goods("Witcher 3", 19);
        Goods good4 = new Goods("Red Dead Redemption 3", 14);
        Set<Goods> setOfGoods = new TreeSet<>();
        setOfGoods.add(good1);
        setOfGoods.add(good2);
        setOfGoods.add(good3);
        setOfGoods.add(good4);


        Set<Shop> setRzk = new TreeSet<>();
        setRzk.add(new Shop(good1.nameOfGood, 37));
        setRzk.add(new Shop(good2.nameOfGood, 100));
        setRzk.add(new Shop(good3.nameOfGood, 23));
        setRzk.add(new Shop(good4.nameOfGood, 19));
        Shop rzk = new Shop("Rozetka", setRzk);


        Set<Shop> setFoxtrot = new TreeSet<>();
        setFoxtrot.add(new Shop(good1.nameOfGood, 34));
        setFoxtrot.add(new Shop(good2.nameOfGood, 98));
        setFoxtrot.add(new Shop(good3.nameOfGood, 18));
        setFoxtrot.add(new Shop(good4.nameOfGood, 13));
        Shop foxtrot = new Shop("Foxtrot", setFoxtrot);

        Set<Shop> setAllo = new TreeSet<>();
        setAllo.add(new Shop(good1.nameOfGood, 39));
        setAllo.add(new Shop(good2.nameOfGood, 115));
        setAllo.add(new Shop(good3.nameOfGood, 22));
        setAllo.add(new Shop(good4.nameOfGood, 18));
        Shop allo = new Shop("Allo", setAllo);
        int number = setOfGoods.size();
        int counterRzk = 0;
        int counterFoxtrot = 0;
        int counterAllo = 0;
        for (Goods good : setOfGoods){
            for (Shop goodInShop : rzk.setOfGoods){
                if (good.nameOfGood.equals(goodInShop.nameOfGood) && good.recPrice > goodInShop.price) {
                    counterRzk++;
                    if (counterRzk == number)
                        System.out.println("У магазині \"" + rzk.nameOfShop + "\" можна придбати товари по цінам, дешевшим ніж рекомендована ціна виробника");
                }
            }
            for (Shop goodInShop : foxtrot.setOfGoods){
                if (good.nameOfGood.equals(goodInShop.nameOfGood) && good.recPrice > goodInShop.price) {
                    counterFoxtrot++;
                    if (counterFoxtrot == number)
                        System.out.println("У магазині \"" + foxtrot.nameOfShop + "\" можна придбати товари по цінам, дешевшим ніж рекомендована ціна виробника");
                }
            }
            for (Shop goodInShop : allo.setOfGoods){
                if (good.nameOfGood.equals(goodInShop.nameOfGood) && good.recPrice > goodInShop.price) {
                    counterAllo++;
                    if (counterAllo == number)
                        System.out.println("У магазині \"" + allo.nameOfShop + "\" можна придбати товари по цінам, дешевшим ніж рекомендована ціна виробника");
                }
            }
        }

    }

    public static void main(String[] args) {
        task1("PlayStation 5");
        task2("Red Dead Redemption 3");
        task3();
    }
}