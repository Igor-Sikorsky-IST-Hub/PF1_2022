import static java.lang.Math.*;
public class task3 {

    public static void main(String[] args) {
        printResults(-1);
        printResults(0);
        printResults(1);
        printResults(2);
        printResults(20);
        printResults(0.01);
        printResults(0.0001);
        printResults(0.000001);
        printResults(0.000000001);
        printResults(Double.NaN);
        printResults(Double.MIN_VALUE);
        printResults(Double.MAX_VALUE);
    }

    public static double task15(double e) {
        if ((e <= 0) || (Double.isNaN(e))) {
            throw new IllegalArgumentException("param e (accuracy) = " + e);
        }
        double sumResult = 0.0;
        double iterationVal = e;
        double powVal = -1;
        for(int i = 1; i < Integer.MAX_VALUE; ++i)
        {
            powVal *= -1;
            iterationVal = powVal/(i*(i+1)*(i+2));
            sumResult += iterationVal;
            if (Math.abs(iterationVal) < e) break;
        }
        if (Math.abs(iterationVal) >= e) {
            throw new RuntimeException("Result accuracy not less then param e, actual accuracy is: " + iterationVal);
        }
        return sumResult;
    }
    static void printResults(double e) {
        System.out.print("e: " + e + " result: ");
        try {
            System.out.println(task15(e));
        } catch (Exception ex) {
            System.out.println("EXCEPTION! " + ex.getMessage());
        }
    }
}
