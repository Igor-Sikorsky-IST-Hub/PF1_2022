import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random(47);

        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.add(rand.nextInt(10));
        }

        // Making container of list of numbers below 10
        try {
            NumbersGreaterThanTenContainer container = new NumbersGreaterThanTenContainer(list);
            System.out.println(container);
        } catch (TooBigNumberExpression e) {
            e.printStackTrace();
        }

        // Making container of list that has number greater than 10
        list.add(11);
        try {
            NumbersGreaterThanTenContainer container = new NumbersGreaterThanTenContainer(list);
            System.out.println(container);
        } catch (TooBigNumberExpression e) {
            e.printStackTrace();
        } finally {
            System.out.println("Printing from the finally block (line 30)");
        }

        // Runtime index out of bound exception
        try {
            list.remove(11);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }

        // Runtime null pointer exception
        try {
            NumbersGreaterThanTenContainer container = new NumbersGreaterThanTenContainer(null);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Runtime illegal argument exception
        try {
            if (list.get(10) != 4) {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}

