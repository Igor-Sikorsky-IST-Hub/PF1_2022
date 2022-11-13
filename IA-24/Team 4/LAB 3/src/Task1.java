package lab3;
import static java.lang.Math.*;

public class Task1 {
    public static void main(String[] args) throws Exception {
        printResults(4, 6, 20);
        printResults(8, 3, 30);
        printResults(3, -10, 4);
        printResults(4, 6, 40);
        printResults(4, 6, -5);
        printResults(4, Double.NaN, 20);
        printResults(Double.MAX_VALUE, 6, 20);
        printResults(Double.MIN_VALUE, 6, 20);
    }

    public static double sumFunc(double a, double b, int k) {
        if (k > 30) {
            throw new IllegalArgumentException("param k = " + k);
        }
        double sum = 0;
        for (int i = 1; i <= k; i++) {
            sum = sqrt(a * i * sqrt(b / i));
        }
        return sum;
    }

    static void printResults(double a, double b, int k) {
        System.out.print("a:" + a + " b:" + b + " k:" + k + " result:");
        try {
            System.out.println(sumFunc(a, b, k));
        } catch (IllegalArgumentException e) {
            System.out.println("Exception! " + e.getMessage());
        }
    }
}
