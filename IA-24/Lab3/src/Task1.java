public class Task1 {
    public static void main(String[] args) {
        printResults(0, 0);
        printResults(0, 1);
        printResults(1, 0);
        printResults(1, 1);
        printResults(2, 1);
        printResults(1, 2);
        printResults(2, 40);
        printResults(30, 30);
        printResults(31, 31);
        printResults(1, 10);
        printResults(32, 10);
        printResults(0, Integer.MAX_VALUE);
        printResults(1, Integer.MAX_VALUE);
    }


    public static double axx(double m, int k) {
        double expression = 0.0;
        if (k > 30) {
            throw new IllegalArgumentException("param k = " + k);
        }
        for (int i = 0; i <= k; i++) {
            expression = Math.sqrt(m / i) * Math.sin(m * i);
        }
        return expression;
    }


    static void printResults(double m, int k) {
        System.out.print("m:" + m + " x:" + k + " result:");
        try {
            System.out.println(axx(m, k));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}




