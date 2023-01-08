import java.util.*;

public class Main {
    public static void task1(String product) {
        //Створюємо нові товари -----------------------------------------------------
        Goods first = new Goods("PlayStation 5", 35);
        Goods second = new Goods("Iphone 45X", 99);
        Goods third = new Goods("Witcher 3", 19);
        Goods four = new Goods("Red Dead Redemption 3", 14);
        Goods five = new Goods("GTA 7", 11);
        //Створюємо нові магазини -----------------------------------------------------
        Shops shops1 = new Shops("Rozetka");
        Shops shops2 = new Shops("Foxtrot");
        //Створюємо список товарів в першому та другому магазині -----------------------------------------------------
        shops1.addGood(first.nameG, first.recPrice);
        shops1.addGood(second.nameG, second.recPrice);
        shops1.addGood(third.nameG, third.recPrice);
        shops2.addGood(four.nameG, four.recPrice);
        shops2.addGood(five.nameG, five.recPrice);
        shops2.addGood(third.nameG, third.recPrice);


        int firstPrice = 0;
        int secondPrice = 0;

        for (String names : shops1.products()) {
            for (String nameS : shops2.products()) {
                if (names.equals(product) & nameS.equals(product)) {
                    firstPrice = shops1.price(names);
                    secondPrice = shops2.price(nameS);
                    if (firstPrice < secondPrice) {
                        System.out.println("Найщина ціна у магазині: " + shops1.nameShop + " -- " + firstPrice + " Шекелів");
                    } else if (secondPrice < firstPrice) {
                        System.out.println("Найщина ціна у магазині: " + shops2.nameShop + " -- " + secondPrice + " Шекелів");
                    }
                }

            }
        }

    }
    public static void task2(String nameGood) {
        Goods first = new Goods("PlayStation 5", 35);
        Goods second = new Goods("Iphone 45X", 99);
        Goods third = new Goods("Witcher 3", 19);
        Goods four = new Goods("Red Dead Redemption 3", 14);
        Goods find = new Goods("", 0);
        //Створюємо нові магазини -----------------------------------------------------
        Shops shops1 = new Shops("Rozetka");
        Shops shops2 = new Shops("Foxtrot");
        Shops shops3 = new Shops("Steam");
        //Пошукові сервіси магазинів --------------------------------------------------
        SearchService hotline = new SearchService("Hotline");
        //Список магазинів
        List<String> shops = new ArrayList<String>();
        //Визначаємо чи є такий товар

        if (nameGood.equals(first.nameG))
            find = first;
        else if (nameGood.equals(second.nameG))
            find = second;
        else if (nameGood.equals(third.nameG))
            find = third;
        else if (nameGood.equals(four.nameG))
            find = four;

        //списки товарів в магазинах
        shops1.addAllGoods(Arrays.asList(first, second, third));
        shops2.addAllGoods(Arrays.asList(first,second,four));
        shops3.addAllGoods(Arrays.asList(first,third,four));
        hotline.addAllShops(Arrays.asList(shops1,shops2,shops3));

        //знаходженння товарів
        for (Iterator i = hotline.shopsList.iterator(); i.hasNext();){
            Object abc = i.next();
            if(abc.equals(shops1)){
                for (Iterator k = shops1.goodsList.iterator(); k.hasNext();){
                    Object ab = k.next();
                    if(ab.equals(find)){
                        shops.add(shops1.nameShop);
                    }

                }
            }
            if(abc.equals(shops2)){
                for (Iterator h = shops2.goodsList.iterator(); h.hasNext();){
                    Object mj = h.next();
                    if(mj.equals(find)){
                        shops.add(shops2.nameShop);
                    }

                }

            }
            if(abc.equals(shops3)){
                for(Iterator b = shops3.goodsList.iterator(); b.hasNext();){
                    Object jk = b.next();
                    if(jk.equals(find)){
                        shops.add(shops3.nameShop);
                    }

                }
            }

        }
        System.out.println("Список магазинів в яких можна купити "+ find.nameG + " : " + shops);


    }

    public static void task3(){
        Goods first = new Goods("PlayStation 5", 35);
        Goods second = new Goods("Iphone 45X", 99);
        Goods third = new Goods("Witcher 3", 19);
        Goods four = new Goods("Red Dead Redemption 3", 14);
        //Створюємо нові магазини -----------------------------------------------------
        Shops shops1 = new Shops("Rozetka");
        //Створюю список рекомендовних цін
        List<Goods> pricesList = new ArrayList<Goods>();
        //Пошукові сервіси магазинів --------------------------------------------------
        shops1.addAllGoods(Arrays.asList(first,second,third,four));
        pricesList.addAll(Arrays.asList(first,second,third,four));

        int sum = 0;
        for(Iterator<Goods> b = shops1.goodsList.iterator(); b.hasNext();){
            Goods abc = b.next();
            for(Iterator<Goods> a = pricesList.iterator(); a.hasNext();){
                Goods obj = a.next();
                if((abc.nameG.equals(obj.nameG)) &&(abc.changePrice() < obj.recPrice)){
                    sum += 1;
                } else {
                    sum += 0;
                }
            }
        }
        if(sum == 4)
            System.out.println(shops1.nameShop);
        else {
            System.out.println("Магазину який працює собі в збиток немає)");
        }
    }

    public static void main(String[] args) {
        task1("Witcher 3");
        task2("Witcher 3");
        task3();

    }
}