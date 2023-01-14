import javax.print.attribute.URISyntax;

public class Task3 {

    public static void main(String[] args) {
        printResults(-1);
        printResults(1);
        printResults(2);
        printResults(0.1);
    }

    public static long factorial(int number) {
        long result = 1;

        for (int factor = 2; factor <= number; factor++) {
            result *= factor;
        }

        return result;
    }

    public static double m1(double eps) {
        if (eps <= 0 ) {
            throw new IllegalArgumentException("param eps = " + eps);
        }
        double res = -99;
        int i = 1;
        double eps1 = 99;
        while (Math.abs(eps1) >= eps){
            res += eps1;
            eps1 = Math.pow(-1, i) / factorial(i);
            i++;
        }
        return res;
    }

    static void printResults(double eps) {
        System.out.print("eps: " + eps + " result: ");
        try {
            System.out.println(m1(eps));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}
