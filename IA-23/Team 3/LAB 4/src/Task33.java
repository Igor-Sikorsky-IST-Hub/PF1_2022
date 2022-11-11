import java.util.Arrays;

public class Task33 {
    public static void main(String[] args) {
        printResults(new double[] {1, 2, 3, 4, 5});
        printResults(new double[] {1, 5, -1, 3});
        printResults(new double[] {-5, 0, -10});
        printResults(new double[] {-1, -2});
        printResults(null);
        printResults(new double[1]);
        printResults(new double[] {});
        printResults(new double[5]);
        printResults(new double[] {-1, 3, Double.NaN});
        printResults(new double[] {1, Double.MIN_VALUE, Double.MAX_VALUE});
    }
    public static boolean doubleNanCheck(double[] array) {
        for (double number:array) {
            if (Double.isNaN(number)) {
                return true;
            }
        }
        return false;
    }
    public static double sum(double[] array) {
        if (array==null || array.length < 2 || doubleNanCheck(array)) {
            throw new IllegalArgumentException("Invalid array");
        }
        double maxNumber=array[0];
        for (double number:array) {
            if (maxNumber<number) {
                maxNumber=number;
            }
        }
        if (maxNumber<=0) {
            throw new IllegalArgumentException("There are no positive numbers");
        }
        return array[1]+maxNumber;
    }
    public static void printResults(double[] array) {
        System.out.print("Array: " + Arrays.toString(array) + " result: ");
        try {
            System.out.println(sum(array));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}
