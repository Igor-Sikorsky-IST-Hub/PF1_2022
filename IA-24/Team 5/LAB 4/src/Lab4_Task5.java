package lab4;

/**
 * Lab 4, Task 5
 *
 * @author Kiiko Anna
 */
public class Lab4_Task5 {

    /**
     * Entry point. Tests the method {@code task5(...)} by calling the helper
     * method {@code printResults(m)} few times with different arguments.
     *
     * @param args the standart parameter of the function.
     */
    public static void main(String[] args) {
        printResults(new double[] {});
        printResults(new double[] {1, 2, 4, 7, 8});
        printResults(new double[] {1, 2, 3, 4, -3, -7, 0});
        printResults(null);
    }

    /**
     * Returns the value for the array according to formula from the task
     *
     * @param m the parameter of the function.
     * @return the elements sum according to formula from the task.
     * @exception NullPointerException if array is null
     * @exception IllegalArgumentException if array is empty
     */
    public static double task5(double[] m) {
        if (null == m) {
            throw new NullPointerException("The array is null!");
        }
        if (m.length == 0) {
            throw new IllegalArgumentException("The array is empty!");
        }
        double sumRow = 0;
        for (double iterVal : m)
        {
            if (iterVal < 0) {
                sumRow += iterVal;
            }
        }
        return sumRow;
    }

    /**
     * Helper method for printing result of {@code task5(m)}.
     *
     * @param m the parameter of the function.
     */
    static void printResults(double[] m) {
        System.out.print("For { ");
        if (m == null) {
            System.out.print("NULL ");
        } else {
            for(double i : m) {
                System.out.print(i + "  ");
            }
        }
        System.out.print("} result: ");
        try {
            System.out.println(task5(m));
        } catch (Exception ex) {
            System.out.println("EXCEPTION! " + ex.getMessage());
        }
    }
}
