package lab3;

import static java.lang.Math.*;

/**
 * Lab 3, Task 15
 *
 * @author Kiiko Anna
 */
public class Lab3_Task15 {

    /**
     * Entry point. Tests the method {@code task15(e)} by calling the helper
     * method {@code printResults(e)} few times with different arguments.
     *
     * @param e the parameter of the function {@code task15(e)} as accuracy.
     */
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

    /**
     * Returns the value of the infinity sum according to formula from the task.
     * Special cases:
     * If the first argument is less than 0, then
     * exception IllegarArgumentException is thrown.
     *
     * @param e the parameter of the function as accuracy.
     * @return the infinity sum according to formula from the task fith actual accuracy (e).
     * @exception IllegalArgumentException if a&lt;0
     * @exception RuntimeException if result has accuracy less then then needed (e)
     */
    public static double task15(double e) {
        if ((e <= 0) || (Double.isNaN(e))) {
            throw new IllegalArgumentException("param e (accuracy) = " + e);
        }
        double sumResult = 0.0;
        double iterationVal = e;
        double powVal = -1; //need for optimization
        for(int i = 1; i < Integer.MAX_VALUE; ++i)
        {
            //iterationVal = pow(-1,i+1)/(i*(i+1)*(i+2)); //origin
            powVal *= -1;
            iterationVal = powVal/(i*(i+1)*(i+2)); //optimization 1
            sumResult += iterationVal;
            if (Math.abs(iterationVal) < e) break;
        }
        if (Math.abs(iterationVal) >= e) {
            throw new RuntimeException("Result accuracy not less then param e, actual accuracy is: " + iterationVal);
        }
        return sumResult;
    }

    /**
     * Helper method for printing result of {@code task15(a,x)}.
     *
     * @param e the parameter (accuracy) of the function.
     */
    static void printResults(double e) {
        System.out.print("e: " + e + " result: ");
        try {
            System.out.println(task15(e));
        } catch (Exception ex) {
            System.out.println("EXCEPTION! " + ex.getMessage());
        }
    }
}
