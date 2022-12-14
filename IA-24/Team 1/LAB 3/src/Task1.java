public class Task1 {
    public Task1() {
    }

    public static void main(String[] args) {
        printResults(0.0, 0);
        printResults(0.0, 1);
        printResults(1.0, 0);
        printResults(1.0, 1);
        printResults(2.0, 1);
        printResults(1.0, 2);
        printResults(2.0, 40);
        printResults(30.0, 30);
        printResults(31.0, 31);
        printResults(1.0, 10);
        printResults(32.0, 10);
        printResults(0.0, Integer.MAX_VALUE);
        printResults(1.0, Integer.MAX_VALUE);
    }

    public static double axx(double m, int k) {
        double expression = 0.0;
        if (k > 30) {
            throw new IllegalArgumentException("param k = " + k);
        } else {
            for(int i = 0; i <= k; ++i) {
                expression = Math.sqrt(m / (double)i) * Math.sin(m * (double)i);
            }

            return expression;
        }
    }

    static void printResults(double m, int k) {
        System.out.print("m:" + m + " x:" + k + " result:");

        try {
            System.out.println(axx(m, k));
        } catch (IllegalArgumentException var4) {
            System.out.println("EXCEPTION! " + var4.getMessage());
        }

    }
}
