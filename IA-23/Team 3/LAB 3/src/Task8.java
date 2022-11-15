public class Task8 {
    public static void main(String[] args) {
        printResults(0, 5, 9);
        printResults(0, 5, 10);
        printResults(-1, 5, 10);
        printResults(-1, 5, 9);
        printResults(1, 0, 4);
        printResults(1, -4, 5);
        printResults(5, 5, 0);
        printResults(Double.NaN, 100, Double.NaN);
        printResults(1, 100, Double.MAX_VALUE);
    }


    public static double sum(double t, int n, double l) {
        double result = 0;
        // t must can't be 0 so that we can divide by it
        if (t == 0) {
            throw new IllegalArgumentException("param t = " + t + " is not divisible");
        }
        // sum goes up to n
        for (int i = 1; i <= n; i++) {
            // l is odd
            if (l % 2 != 0) {
                result += 1 / t * l;
            }
            // l is even
            else {
                // t must be greater than 0 so that we can get the root of it
                if (t < 0) {
                    throw new IllegalArgumentException("param t = " + t + " impossible to get a root");
                }
                result += 1 / Math.sqrt(t) * l;
            }
        }
        return result;
    }


    public static void printResults(double t, int n, double l) {
        System.out.printf("a = %.2f, n = %d, l = %.2f, Sum: ", t, n, l);
        try {
            System.out.println(sum(t, n, l));
        } catch (IllegalArgumentException e){
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}
