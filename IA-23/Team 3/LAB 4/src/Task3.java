import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        printResult(new double[]{1, 2, 3, 5, 11, 55});
        printResult(new double[]{1, 2, 4, 5});
        printResult(new double[]{6, 5, -1, 3});
        printResult(new double[]{-5, 11, -10});
        printResult(new double[]{-2,-1, -10,-0,5});
        printResult(null);
        printResult(new double[]{});
        printResult(new double[]{-1, 3, Double.NaN});
        printResult(new double[1]);
        printResult(new double[5]);
        printResult(new double[]{Double.MIN_VALUE, 1, Double.MAX_VALUE});
    }

    public static boolean CheckDoubleNan(double[] array) {
        for (double number : array) {
            if (Double.isNaN(number)) {
                return true;
            }
        }
        return false;
    }

    public static double TheBiggestElement(double[] array) {
        if ( array == null|| CheckDoubleNan(array) ||array.length < 2 ) {
            throw new IllegalArgumentException("Incorrectly entered array ");
        }
        double maxNumber = array[0];
        for (double number : array) {
            if (maxNumber < number) {
                maxNumber = number;
            }
        }
        return maxNumber;
    }

    public static void printResult(double[] array) {
        System.out.print("Array: " + Arrays.toString(array) + " result: ");
        try {
            System.out.println(TheBiggestElement(array));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}
