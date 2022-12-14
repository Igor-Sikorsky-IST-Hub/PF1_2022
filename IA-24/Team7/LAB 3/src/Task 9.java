mport static java.lang.Math.*;

public class Task9 {


    public static void printResult(int t, int n, int l) {
        System.out.println(expressionNine(t, n, l));
    }

    public static double expressionNine(int t, int n, int l) {
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            if (l % 2 == 0) {
                sum = l / sqrt(t);
            } else {
                sum = sqrt(t*l);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        printResult(10, 10, 4);
    }
}
