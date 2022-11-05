import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        printResults(new int[]{1, 3, 5, 10});
        printResults(new int[]{2, 0, 9, 10});
        printResults(new int[]{-1, 65, 25, 100});
        printResults(new int[]{});
    }

    public static double axx(int a[]) {
        if (a.length == 0) {
            throw new IllegalArgumentException("Type some values into array ");
        }
        for (int num : a) {
            if (num < 0) {
                throw new IllegalArgumentException("Element in array < 0 ");
            }
        }

        int n = a.length;
        int min = Arrays.stream(a).min().getAsInt();
        System.out.println("min elem: " + min);
        int mul = 1;
        for (int i = 0; i < n; i++) {
            if (min != 0 & min > 0) {
                mul = min;
            }
        }
        for (int i = 0; i < n; i++) {
            if (min == 0 & min >= 0) {
                a[i] = (-10);
                System.out.println(a[i] + " ");
            }
        }
        for (int i = 0; i < n; i++) {
            if (min > 0) {
                int x = (int) Math.floor(a[i] / mul);
                System.out.println(x + " ");
                //return a[];
            }
        }
        int literalynothing = 0;
        return literalynothing;
    }

    static void printResults(int a[]) {
        System.out.println("-----");
        try {
            System.out.println(axx(a));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}


