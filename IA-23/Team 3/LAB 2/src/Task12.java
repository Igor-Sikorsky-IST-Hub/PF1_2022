public class Task12 {
    public static void main(String[] args) {
        printResults(1, 2);
        printResults(0, 1);
        printResults(1, 0);
        printResults(1, 1);
        printResults(2, 1);
        printResults(1, 2);
        printResults(2, -10);
        printResults(20, 20);
        printResults(21, 21);
        printResults(1, 10);
        printResults(-1, 10);
        printResults(0, Double.MAX_VALUE);
        printResults(1, Double.MAX_VALUE);
        printResults(1, Double.NaN);
    }

    public static double axx(double a, double x) {
        if (a < 0 || a > 20) {
            throw new IllegalArgumentException("param a = " + a);
        }
        return a * x * x;
    }

    static void printResults(double a, double x) {
        System.out.print("a:" + a + " x:" + x + " result:");
        try {
            System.out.println(axx(a, x));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}

