public class function3 {
    public static void main(String[] args) {
        // double e = Math.pow (10, -6);
        printResults(-1);
        printResults(6);
        printResults(0);
        printResults(0.3);
        printResults(Double.MAX_VALUE);

    }

    public static double axx(double a) {
        double sum = 0;
        if (Math.pow(10, 6) > a || a > Math.pow(10, 6)) {
            throw new IllegalArgumentException("a = " + a);
        }
        for (int i = 1; i < a; i++) {
            double first = i * (i + 1);
            double second = 1 / first;
            sum += second;
            if (Math.abs(second) < a) {
                break;
            }
        }
        return sum;
    }

    static void printResults(double a) {
        System.out.print("result:" );
        try {
            System.out.println(axx(a));
        } catch (IllegalArgumentException e) {
            System.out.println(" EXCEPTION! " + e.getMessage());
        }
    }
}
