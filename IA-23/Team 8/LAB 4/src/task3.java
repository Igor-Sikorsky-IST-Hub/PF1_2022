import java.util.Arrays;

public class task3 {
    public static void main(String[] args) {
        int[] a = {5,4,3,2,1};
        int[] b = {6, 4, 5, 1, 9};
        int[] a1 = {-1, -2, -3, 4, -5};
        int[] b1 = {4, 6, -1, 5, 9};
        int[] a2 = null;
        int[] b2 = {4, -6, 1, 5, 9};
        int[] a3 = {-1, -2, 3, 4, -5};
        int[] b3 = {4, -6, -1, 5, 9, 8};
        printResult(a, b);
        printResult(a1, b1);
        printResult(a2, b2);
        printResult(a3, b3);
    }
    public static int[] calculation(int[] a, int[] b) {
        if (a.length != b.length) {
            throw new IllegalArgumentException("different arrays length");
        }
        int[] c = new int[a.length];
        for (int i = 0; i < c.length; i++) {
            if (a[i] > 0 && b[i] > 0) {
               c[i] = a[i] + b[i];
            } else if (a[i] < 0 && b[i] < 0) {
                c[i] = a[i] * b[i];
            } else {
                c[i] = 0;
            }
        }
        return c;
    }
    public static void printResult(int[] a, int[] b) {
        try {
            System.out.println(Arrays.toString(calculation(a, b)));
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: "+ e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Exception: array is null");
        }
    }
}