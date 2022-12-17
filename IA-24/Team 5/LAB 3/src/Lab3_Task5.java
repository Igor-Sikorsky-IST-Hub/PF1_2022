package lab3;

import static java.lang.Math.*;

/**
 * Lab 3, Task 5
 *
 * @author Kiiko Anna
 */
public class Lab3_Task5 {

    /**
     * Entry point. Tests the method {@code task5(...)} by calling the helper
     * method {@code printResults(z,k)} few times with different arguments.
     *
     * @param z the parameter of the function {@code task5(z,k)}.
     * @param k the argument of the function {@code task5(z,k)}.
     */
    public static void main(String[] args) {
        printResults(0, 0);
        printResults(0, 1);
        printResults(1, 0);
        printResults(1, 1);
        printResults(2, 1);
        printResults(1, 2);
        printResults(2, -10);
        printResults(20, 20);
        printResults(21, 21);
        printResults(1, 10);
        printResults(-1, 10);
        printResults(Double.NaN, 10);
        printResults(0, Integer.MIN_VALUE);
        printResults(1, Integer.MAX_VALUE);
    }

    /**
     * Returns the value of the rows sum according to formula from the task
     * Special cases:
     * If the second argument is not >= 1 and < 35, then
     * exception IllegarArgumentException is thrown.
     *
     * @param s the parameter of the function.
     * @param k the argument of the function, must be >= 1 and < 35.
     * @return the rows sum according to formula from the task.
     * @exception IllegalArgumentException if a&lt;1 or a&gt;35
     */
    public static double task5(double s, int k) {
        if (k < 1 || k >= 35) {
            throw new IllegalArgumentException("param k = " + k);
        }
        double sumRow = 0;
        for (int i = 1; i <= k; ++i)
        {
            sumRow += Math.log10(sqrt(s/(i*i)));
        }
        return sumRow;
    }

    /**
     * Helper method for printing result of {@code task5(z,k)}.
     *
     * @param z the parameter of the function.
     * @param k the argument of the function.
     */
    static void printResults(double z, int k) {
        System.out.print("z: " + z + " k: " + k + " result: ");
        try {
            System.out.println(task5(z, k));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}
