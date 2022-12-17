public class Task13 {
    public static void main(String[] args) {
        printResults(0.05);
        printResults(0.5);
        printResults(-1);
        printResults(0);
        printResults(0.0000123);
        printResults(1);
        printResults(Double.NaN);
        printResults(2);
        printResults(1E-18);
    }
    public static long factorial(int i) {
        long factorial = 1;
        for (int j=2; j<=i; j++) {
            factorial *= j;
        }
        return factorial;
    }
    public static double infiniteSum(double E) {
        if (E<=0 || Double.isNaN(E)) {
            throw new IllegalArgumentException("param E = " + E);
        }
        double sum=0;
        for (int i=1; true; i++) {
            double add=Math.pow(-1, i)/factorial(i);
            if (Math.abs(add) < E) {
                break;
            }
            else {
                sum += add;
            }
        }
        return sum;
    }
    static void printResults(double E) {
        System.out.print("E:" + E + " result: ");
        try {
            System.out.println(infiniteSum(E));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}

