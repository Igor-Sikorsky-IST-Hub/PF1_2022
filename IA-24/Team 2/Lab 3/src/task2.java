import static java.lang.Math.*;

public class Task2{

    public static void printResult(int k, int t, int s) {
        System.out.print("k:"+k+" t:"+t+" s:"+s+" result: ");
        try {
            System.out.println(expressionTwo(k, t, s));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static double expressionTwo(int k, int t, int s) {
        if (!(2 < k && k <= 25)) {
            throw new IllegalArgumentException("param k = " + k);
        }
        if (t > 0) {
            throw new IllegalArgumentException("param t = " + t);
        }
        double sum = 0.0;
        for (int i = 2; i <= k; i++) {
            sum += Math.log(-t * i) * cos(sqrt(s * (1.0 / t * t)));
        }
        return sum;
    }

    public static void main(String[] args) {
        printResult(10, -5, 8);
        printResult(-3, -5, 8);
        printResult(26, -5, 3);
        printResult(10, -5, -2);
        printResult(10, -5, 26);
    }
}