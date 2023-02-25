import java.util.*;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Product product1 = new Product("bread", 14);
        Product product2 = new Product("butter", 40);
        Product product3 = new Product("juice", 55);
        Product product4 = new Product("milk", 30);
        Product product5 = new Product("cheese", 70);

        TreeSet<Product> productsFromManufacture = new TreeSet<Product>();

        productsFromManufacture.addAll(Set.of(product1, product2, product3, product4, product5));

        Shop shop = new Shop("Ціни від виробника: ", Set.of(product1, product2, product3, product4, product5));
        System.out.println(shop);

        Product product11=new Product(product1.getProduct(),12);
        Product product12=new Product(product2.getProduct(),12);

        Shop shop1 = new Shop("jj", Set.of(product5, product4, new Product("bread", 16)));
        Shop shop2 = new Shop("ABC", Set.of(product11, product12));
        Shop shop3 = new Shop("Cool", Set.of(product3, product4, new Product("butter", 77)));

        AllShop allShop = new AllShop(
            Set.of(shop1, shop2, shop3));

        System.out.println(allShop);
        String nameProduct = "bread";
        int minpriceProduct = task1(nameProduct, allShop);
        System.out.println("minpriceProduct: "  + nameProduct + ": "+ minpriceProduct);
        Set<Shop> shopListMinPriceOfProduct = task2(minpriceProduct, allShop, nameProduct);
        System.out.println("Можна купити по мінімальній ціні у: " + shopListMinPriceOfProduct);
        task3(productsFromManufacture, allShop);

    }

    public static int task1(String product, AllShop allShop) {
        int minprice = Integer.MAX_VALUE;
        for (Shop shop : allShop.getAllshops()) {
            for (Product p : shop.getProducts()) {
                if (p.getPrice() < minprice) {
                    minprice = p.getPrice();
                }
            }
        }
        return minprice;
    }

    public static Set<Shop> task2(int minpriceProduct, AllShop allShop, String productMin) {
        TreeSet<Shop> shopMinPrice = new TreeSet<Shop>();
        boolean isProductWithMinPrice;
        for (Iterator i = allShop.getAllshops().iterator(); i.hasNext(); ) {
            Object o = i.next();
            if (o instanceof Shop) {
                Shop shop = (Shop) o;
                isProductWithMinPrice = false;
                for (Iterator p = shop.getProducts().iterator(); p.hasNext(); ) {
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

    public static void task3(Set<Product> productsFromManufacture, AllShop allShop) {
        Set<Shop> shopMinPrice = new TreeSet<Shop>();
        for (Iterator<Shop> i = allShop.getAllshops().iterator(); i.hasNext(); ) {
            Shop shop = i.next();
            int countProduct = 0;
            for (Iterator<Product> p = shop.getProducts().iterator(); p.hasNext(); ) {
                Product product = p.next();
                for (Iterator<Product> pm = productsFromManufacture.iterator(); pm.hasNext(); ) {
                    Product productM = pm.next();
                    if (product.getProduct().equals(productM.getProduct())) {
                        if (product.getPrice() < productM.getPrice()) {
                            countProduct++;
                        }
                    }
                }
            }
            if (countProduct == shop.getProducts().size()) {
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