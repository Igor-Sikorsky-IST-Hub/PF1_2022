import java.util.*;
public class Main {
    public static void main(String[] args) throws ProductNotFoundException {
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


        Shop shop1 = new Shop("jj", first, 18);
        Shop shop2 = new Shop("ABC", second, 23);
        Shop shop3 = new Shop("Cool", third, 19);


        HashSet<Shop> ALLSHOPS = new HashSet<Shop>();
        ALLSHOPS.addAll(Set.of(shop1, shop2, shop3));

        AllShop allShop = new AllShop(ALLSHOPS);
        System.out.println(allShop);

        String nameProduct = "";
        try {
            int minpriceProduct = task1(nameProduct, allShop);
            System.out.println("minpriceProduct: " + nameProduct + ": " + minpriceProduct);
        } catch (ProductNotFoundException e) {
            System.out.println(e.getMessage() + nameProduct);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Done 1 task");
            System.out.println();
        }
        try {
            int minpriceProduct = task1(nameProduct, allShop);
            HashSet<Shop> shopListMinPriceOfProduct = task2(minpriceProduct, allShop, nameProduct);
            System.out.println("Можна купити по мінімальній ціні у: " + shopListMinPriceOfProduct);
        } catch (ProductNotFoundException e) {
            System.out.println(e.getMessage() + nameProduct);
        } finally {
            System.out.println("Done 2 task");
        }
        System.out.println();

        task3(productsFromManufacture, allShop);
        System.out.println();

        task4(allShop);
        System.out.println();

        String my_fav_store = shop2.getName();
        PropositionOfWeek(allShop, my_fav_store);



    }


    public static int task1(String product, AllShop allShop) throws ProductNotFoundException {
        if (product == null ||product.isEmpty()) {
            throw new IllegalArgumentException("Неправильна назва продукту");
        }
        if (allShop == null) {
            throw new NullPointerException("'allShop' є null");
        }
        int minprice = Integer.MAX_VALUE;
        boolean isProductFound = false;
        for (Shop shop : allShop.getAllshops()) {
            for (Product p : shop.getHashSet()) {
                if (p.getProduct().equals(product)) {
                    isProductFound = true;
                    if (p.getPrice() < minprice) {
                        minprice = p.getPrice();
                    }
                }
            }
            if (!isProductFound) {
                throw new ProductNotFoundException("Продукт не знайдено в жодному магазині: ");
            }
        }
        return minprice;
    }



    public static HashSet<Shop> task2(int minpriceProduct, AllShop allShop, String productMin) throws ProductNotFoundException {
        HashSet<Shop> shopMinPrice = new HashSet<Shop>();
        boolean isProductWithMinPrice = false;
        for (Iterator i = allShop.getAllshops().iterator(); i.hasNext(); ) {
            Object o = i.next();
            if (o instanceof Shop) {
                Shop shop = (Shop) o;
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
                    isProductWithMinPrice = false;
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
        for (Shop shop : allShop.getAllshops()) {
            System.out.println(shop.getTime_closed());
        }
    }

    public static void PropositionOfWeek(AllShop allShop, String my_fav_store) {
        HashMap<String, String> hashMap = new HashMap<>();
        for (Shop shop : allShop.getAllshops()) {
            for (Product product : shop.getAllProducts()) {
                hashMap.put(shop.getName(), product.getProduct());
            }
        }
        System.out.println("PROPOSITION OF WEEK " +  (hashMap.get(my_fav_store).toUpperCase()  + "  in store  "  + my_fav_store.toUpperCase()));

    }
}