import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("bread", 14);
        Product product2 = new Product("butter", 40);
        Product product3 = new Product("juice", 55);
        Product product4 = new Product("milk", 30);
        Product product5 = new Product("cheese", 70);

        List<Product> productsFromManufacture = new ArrayList<Product>();

        productsFromManufacture.addAll(List.of(product1, product2, product3, product4, product5));

        Shop shop = new Shop("Ціни від виробника: ", List.of(product1, product2, product3, product4, product5));
        System.out.println(shop);

        Product product11=new Product(product1.getProduct(),12);
        Product product12=new Product(product2.getProduct(),12);


        Shop shop1 = new Shop("jj", List.of(product5, product4, new Product("bread", 16)));
        Shop shop2 = new Shop("ABC", List.of(product11, product12));
        Shop shop3 = new Shop("Cool", List.of(product3, product4, new Product("butter", 77)));

        AllShop allShop = new AllShop();

        allShop.addShop(Arrays.asList(shop1, shop2, shop3));
        System.out.println(allShop);

        String nameProduct = "bread";
        int minpriceProduct = task1(nameProduct, allShop);
        System.out.println("minpriceProduct: "  + nameProduct + ": "+ minpriceProduct);
        List<Shop> shopListMinPriceOfProduct = task2(minpriceProduct, allShop, nameProduct);
        System.out.println("Можна купити по мінімальній ціні у: " + shopListMinPriceOfProduct);
        task3(productsFromManufacture, allShop);


    }


    public static int task1(String product, AllShop allShop) {
        int minprice = Integer.MAX_VALUE;
        for (Shop shop : allShop.getAllshops()) {
            for (Product p : shop.getList()) {
                if (p.getPrice() < minprice) {
                    minprice = p.getPrice();
                }
            }
        }
        return minprice;
    }

    public static List<Shop> task2(int minpriceProduct, AllShop allShop, String productMin) {
        List<Shop> shopMinPrice = new ArrayList<Shop>();
        boolean isProductWithMinPrice;
        for (Iterator i = allShop.getAllshops().iterator(); i.hasNext(); ) {

            Object o = i.next();
            if (o instanceof Shop) {
                Shop shop = (Shop) o;
                isProductWithMinPrice = false;
                for (Iterator p = shop.getList().iterator(); p.hasNext(); ) {

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

    public static void task3(List<Product> productsFromManufacture, AllShop allShop) {

        List<Shop> shopMinPrice = new ArrayList<Shop>();
        boolean isProductWithLessPriceManuf;
        for (Iterator<Shop> i = allShop.getAllshops().iterator(); i.hasNext(); ) {
            Shop shop = i.next();
            isProductWithLessPriceManuf = false;
            int countProduct = 0;
            for (Iterator<Product> p = shop.getList().iterator(); p.hasNext(); ) {
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

            if (countProduct == shop.getList().size()) {
                shopMinPrice.add(shop);
                System.out.println("У " + shop.getName() + " можна купити товари по цінам, дешевшим ніж рекомендована ціна виробника");
                System.out.println(shop);
            }
            else{
                System.out.println("У " + shop.getName() +" не можна купити товари по цінам, дешевшим ніж рекомендована ціна виробника");
            }

        }
    }

}