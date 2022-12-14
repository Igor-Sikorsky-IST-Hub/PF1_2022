public class function2 {
    public static void main(String[] args) {
        printResults(5, 8);
        printResults(0, 3);
        printResults(7, 5);
        printResults(5, 1);
        printResults(1, 4);
        printResults(5, 8);
        printResults(5, 2);
        printResults(12, 6);
        printResults(0, 0);
        printResults(100, -2);
        printResults(6, 6);
        printResults(Double.MAX_VALUE, 5);
        printResults(Double.MAX_VALUE, 0);
        printResults(Double.NaN, 3);


    }

    public static double function(double t, int i) {
        double result = 0;
        if (i < 1) {
            throw new IllegalArgumentException("param i = " + i + " is not available");
        }
        if (i == 2) {
            result = Math.log(t);
        }
        for (int k = 1; k < i; k++) {
            if (i > 2) {
                result = Math.sin(t) / k;
            }


        }
        return result;

    }


    static void printResults(double t, int i) {
        System.out.print("t:" + t + " i:" + i + " result:");
        try {
            System.out.println(function(t, i));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}
