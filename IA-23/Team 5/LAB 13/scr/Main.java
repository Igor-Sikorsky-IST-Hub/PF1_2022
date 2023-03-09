import java.util.*;

public class Main {
    public static void main(String[] args) {
        part1();
        part2();
        part3(null);
        part4();
    }

    static Set<Good> listOfGoods() {
        TreeSet<Good> listOfGoods = new MyTreeSet<>();
        listOfGoods.add(new Good("PlayStation 5", 35));
        listOfGoods.add(new Good("Iphone 45X", 99));
        listOfGoods.add(new Good("Witcher 3", 19));
        return listOfGoods;
    }


    static void part1(){
        Set<Good> list = listOfGoods();
        try {
//            System.out.println(list);
//            list.add(new Good("Red Dead Redemption 3", -5));
            System.out.println(list);
            list.add(new Good("Red Dead Redemption 3", 14));
            System.out.println(list);
            list.add(new Good("Mouse", 40));
            System.out.println(list);
        }
        catch (IllegalStateException e){
            System.out.println("Досягнуто максимальної кількості товарів(4)");
        }
        catch (IllegalArgumentException e){
            System.out.println("Ціна товару не може бути від'ємною");
        }
        finally {
            System.out.println(list);
        }
    }
    static void part2(){
        Set<Good> listOfGoods = listOfGoods();
        listOfGoods.add(new Good(null, 60));
        System.out.println(listOfGoods);
    }
    static void part3(Integer a){
        List<String> list = new ArrayList<>();
        list.add("PlayStation 5");
        list.add("Iphone 45X");
        list.add("Witcher 3");
        list.add(null);

        System.out.println(a * 3);


    }

    static void part4(){
        int[] array = new int[5];
        System.out.println(array[5]);
    }
}


class Good implements Comparable<Good> {
    String nameOfGood;
    int recPrice;
    public Good(String nameOfGood, int recPrice) {
        if (recPrice < 0){
            throw new IllegalArgumentException("Ціна не може бути від'ємною");
        }
        this.nameOfGood = nameOfGood;
        this.recPrice = recPrice;
    }


    @Override
    public int compareTo(Good o) {
        return this.nameOfGood.compareTo(o.nameOfGood);
    }

    @Override
    public String toString() {
        return nameOfGood;
    }
}
class MyTreeSet<Good> extends TreeSet<Good>{
    public boolean add(Good good){
        if (this.size() >= 4){
            throw new IllegalStateException("Не можливо додати більше 4 товарів");
        }
        return super.add(good);
    }
}

