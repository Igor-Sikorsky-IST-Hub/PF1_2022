public class Task1 {

    public static void main(String[] args) {
        printResults(-1);
        printResults(1);
        printResults(2);
        printResults(3);
        printResults(4);
        printResults(5);
        printResults(6);
        printResults(20);
        printResults(21);
        printResults(100);
        printResults(Double.MAX_VALUE);
        printResults(Double.MAX_VALUE);
        printResults(Double.NaN);
    }

    public static double m1(double m) {
        if (m < 0 ) {
            throw new IllegalArgumentException("param m = " + m);
        }
        double res = 0;
        for (int i = 1; i <= 30; i++){
            res += Math.sqrt(m/i) * Math.sin(m*i);
        }
        return res;
    }

    static void printResults(double m) {
        System.out.print("m:" + m + " result:");
        try {
            System.out.println(m1(m));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}
