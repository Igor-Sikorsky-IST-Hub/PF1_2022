
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("bread", 14);
        Product product2 = new Product("butter", 40);
        Product product3 = new Product("juice", 55);
        Product product4 = new Product("milk", 30);
        Product product5 = new Product("cheese", 70);

        HashSet<Product> productsFromManufacture = new HashSet<Product>();
        HashSet<Product> first = new HashSet<Product>();
        HashSet<Product> second = new HashSet<Product>();
        HashSet<Product> third = new HashSet<Product>();

        productsFromManufacture.addAll(Set.of(product1, product2, product3, product4, product5));

        first.addAll(Set.of(product1, product3));
        second.addAll(Set.of(product2, product4));
        third.addAll(Set.of(product5, product1));

        Shop shop = new Shop("Ціни від виробника: ", productsFromManufacture);
        System.out.println(shop);

        Product product11 = new Product(product1.getProduct(), 12);
        Product product12 = new Product(product2.getProduct(), 12);


        Shop shop1 = new Shop("jj", first, 18);
        Shop shop2 = new Shop("ABC", second, 23);
        Shop shop3 = new Shop("Cool", third, 19);


        HashSet<Shop> ALLSHOPS = new HashSet<Shop>();
        ALLSHOPS.addAll(Set.of(shop1, shop2, shop3));

        AllShop allShop = new AllShop(ALLSHOPS);
        System.out.println(allShop);

        String nameProduct = "bread";
        int minpriceProduct = task1(nameProduct, allShop);
        System.out.println("minpriceProduct: " + nameProduct + ": " + minpriceProduct);
        System.out.println();

        HashSet<Shop> shopListMinPriceOfProduct = task2(minpriceProduct, allShop, nameProduct);
        System.out.println("Можна купити по мінімальній ціні у: " + shopListMinPriceOfProduct);
        System.out.println();

        task3(productsFromManufacture, allShop);
        System.out.println();

        task4(allShop);
        System.out.println();

        String my_fav_store = shop2.getName();
        PropositionOfWeek(allShop, my_fav_store);



    }


    public static int task1(String product, AllShop allShop) {
        int minprice = Integer.MAX_VALUE;
        for (Shop shop : allShop.getAllshops()) {
            for (Product p : shop.getHashSet()) {
                if (p.getPrice() < minprice) {
                    minprice = p.getPrice();
                }
            }
        }
        return minprice;
    }



    public static HashSet<Shop> task2(int minpriceProduct, AllShop allShop, String productMin) {
        HashSet<Shop> shopMinPrice = new HashSet<Shop>();
        boolean isProductWithMinPrice;
        for (Iterator i = allShop.getAllshops().iterator(); i.hasNext(); ) {

            Object o = i.next();
            if (o instanceof Shop) {
                Shop shop = (Shop) o;
                isProductWithMinPrice = false;
                for (Iterator p = shop.getHashSet().iterator(); p.hasNext(); ) {

                    Object object = p.next();
                    if (object instanceof Product) {
                        Product product = (Product) object;
                        if (product.getProduct().equals(productMin)) {
                            if (product.getPrice() == minpriceProduct) {
                                isProductWithMinPrice = true;
                            }
                        }
                    }
                }
                if (isProductWithMinPrice) {
                    shopMinPrice.add(shop);
                }
            }
        }
        return shopMinPrice;
    }

    public static void task3(HashSet<Product> productsFromManufacture, AllShop allShop) {

        HashSet<Shop> shopMinPrice = new HashSet<Shop>();
        boolean isProductWithLessPriceManuf;
        for (Iterator<Shop> i = allShop.getAllshops().iterator(); i.hasNext(); ) {
            Shop shop = i.next();
            isProductWithLessPriceManuf = false;
            int countProduct = 0;
            for (Iterator<Product> p = shop.getHashSet().iterator(); p.hasNext(); ) {
                Product product = p.next();
                for (Iterator<Product> pm = productsFromManufacture.iterator(); pm.hasNext(); ) {
                    Product productM = pm.next();

                    if (product.getProduct().equals(productM.getProduct())) {
                        if (product.getPrice() < productM.getPrice()) {
                            isProductWithLessPriceManuf = true;
                            countProduct++;

                        }
                    }
                }
            }

            if (countProduct == shop.getHashSet().size()) {
                shopMinPrice.add(shop);
                System.out.println("У " + shop.getName() + " можна купити товари по цінам, дешевшим ніж рекомендована ціна виробника");
                System.out.println(shop);
            } else {
                System.out.println("У " + shop.getName() + " не можна купити товари по цінам, дешевшим ніж рекомендована ціна виробника");
            }

        }
    }

    public static void task4(AllShop allShop) {
        for (Iterator<Shop> i = allShop.getAllshops().iterator(); i.hasNext(); ) {
            Shop shop = i.next();
            System.out.println(shop.getTime_closed());
        }
    }

    public static void PropositionOfWeek(AllShop allShop, String my_fav_store) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        for (Iterator<Shop> i = allShop.getAllshops().iterator(); i.hasNext(); ) {
            Shop shop = i.next();
            for (Iterator<Product> f = shop.getAllProducts().iterator(); f.hasNext(); ) {
                Product product = f.next();
                hashMap.put(shop.getName(), product.getProduct());
            }
        }
        System.out.println("PROPOSITION OF WEEK " +  (hashMap.get(my_fav_store).toUpperCase()  + "  in store  "  + my_fav_store.toUpperCase()));

    }
}


