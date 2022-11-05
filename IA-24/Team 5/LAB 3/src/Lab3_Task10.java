package lab3;

import static java.lang.Math.*;

/**
 * Lab 3, Task 10
 *
 * @author Kiiko Anna
 */
public class Lab3_Task10 {

    /**
     * Entry point. Tests the method {@code funX(t,n)} by calling the helper
     * method {@code printResults(t,n)} few times with different arguments.
     *
     * @param t the parameter of the function {@code funX(t,n)}.
     * @param n the argument of the function {@code funX(t,n)}.
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
        printResults(Double.MIN_VALUE, 1000000);
        printResults(Double.MAX_VALUE, 1);
        printResults(Double.MAX_VALUE, 10);
        //printResults(1, Integer.MAX_VALUE);
    }

    /**
     * Returns the value of the rows sum according to formula from the task.
     * Special cases:
     * If the first argument is less than 1, then
     * exception IllegarArgumentException is thrown.
     *
     * @param t the parameter of the function.
     * @param n the argument of the function.
     * @return the rows sum according to formula from the task.
     * @exception IllegalArgumentException if a&lt;1
     */
    public static double funX(double t, int n) {
        if (n < 1) {
            throw new IllegalArgumentException("param n = " + n);
        }
        double sumRow = 0;
        if(t < 0)
        {// t < 0
            for (int i = 1; i <= n; ++i)
            {
                sumRow += t*t*i;
            }
        }
        else
        {// t >= 0
            for (int i = 1; i <= n; ++i)
            {
                sumRow += sqrt(t*i);
            }
        }
        return sumRow;
    }

    /**
     * Helper method for printing result of {@code funX(t,n)}.
     *
     * @param a the parameter of the function.
     * @param x the argument of the function.
     */
    static void printResults(double t, int n) {
        System.out.print("t: " + t + " n: " + n + " result: ");
        try {
            System.out.println(funX(t, n));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}
