public class Task11 {
    public Task11() {
    }

    public static void main(String[] args) {
        printResults(0.0);
        printResults(1.0);
        printResults(10.0);
        printResults(11.0);
        printResults(21.0);
        printResults(12.0);
        printResults(40.0);
        printResults(3.0);
        printResults(31.0);
        printResults(2.0);
        printResults(4.0);
        printResults(2.147483647E9);
        printResults(0.4);
    }

    public static double axx(double eps) {
        double sum = 0.0;
        int i = 0;
        ++i;
        sum += (double)(1 / (i * i));
        if (eps <= Math.abs(1.0 / Math.pow((double)i, 2.0))) {
            throw new IllegalArgumentException("param eps = " + eps);
        } else {
            return sum;
        }
    }

    static void printResults(double eps) {
        System.out.print("Epsylon: " + eps + " Summary: ");

        try {
            System.out.println(axx(eps));
        } catch (IllegalArgumentException var3) {
            System.out.println("EXCEPTION! " + var3.getMessage());
        }

    }
}
