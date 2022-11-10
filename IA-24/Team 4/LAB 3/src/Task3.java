import static java.lang.Math.*;

public class Task3 {
    public static void main(String[] args) {
        printResults(1);
        printResults(10);
        printResults(0.05);
        printResults(0.003);
        printResults(0.0002);
        printResults(0.00008);
        printResults(Double.NaN);
        printResults(-1);
    }
    public static double function(double e) {
        if (e <= 0) {
            throw new IllegalArgumentException("param \u03b5:" + e);
        }
        double sum = 0;
        double val = 0;
        int i = 0;
        do {
            sum += val;
            val = pow(-2, i) / factorial(i) * (i + 1);
            i++;
        } while (abs(val) >= e);
        return sum;
    }
    public static long factorial(int a) {
        if (a == 0) {
            return 1;
        } else {
            long factorial = 1;
            for (int i = 2; i <= a; i++) {
                factorial *= i;
            }
            return factorial;
        }
    }
    private static void printResults(double e){
        System.out.print("\u03b5:" + e + " result:");
        try {
            System.out.println(function(e));
        } catch (IllegalArgumentException ex) {
            System.out.println("Exception! " + ex.getMessage());
        }
    }
}
