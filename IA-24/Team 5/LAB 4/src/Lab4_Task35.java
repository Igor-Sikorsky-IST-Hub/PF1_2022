package lab4;

/**
 * Lab 4, Task 35
 *
 * @author Kiiko Anna
 */
public class Lab4_Task35 {

    /**
     * Entry point. Tests the method {@code task35(...)} by calling the helper
     * method {@code printResults(m)} few times with different arguments.
     *
     * @param args the standart parameter of the function.
     */
    public static void main(String[] args) {
        printResults(new double[] {});
        printResults(new double[] {1, 2, 4, 7, 8});
        printResults(new double[] {1, 2, 3, 4, -3, -7, 0});
        printResults(new double[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11});
        printResults(new double[] {1, 2, 3, 4, -5, -6, -7, -8, -9, -10, -11});
        printResults(new double[] {0, 1, 2, 3, 4, 0, 0, 0, 0, 0, 0, 15});
        printResults(null);
    }

    /**
     * Returns the value for the array according to formula from the task
     * Special cases:
     * If the array not contain elements with the index [5;10], then
     * exception IndexOutOfBoundsException is thrown.
     *
     * @param m the parameter of the function.
     * @return the sum according to formula from the task.
     * @exception NullPointerException if array is null
     * @exception IllegalArgumentException if array is empty
     * @exception IndexOutOfBoundsException if array not contain elements with the index [5;10]
     */
    public static double task35(double[] m) {
        if (null == m) {
            throw new NullPointerException("The array is null!");
        }
        if (m.length == 0) {
            throw new IllegalArgumentException("The array is empty!");
        }
        if (m.length < 11) {
            throw new IllegalArgumentException("The array is not contain elements with the index [5;10]!");
        }
        double sumRow = 0;
        for (int indexArray = 0; indexArray < m.length; ++indexArray) {
            if ((indexArray >= 5) && (indexArray <= 10)) {
                sumRow += m[indexArray];
            }
        }
        return sumRow;
    }

    /**
     * Helper method for printing result of {@code task35(m)}.
     *
     * @param m the parameter of the function.
     */
    static void printResults(double[] m) {
        System.out.print("For { ");
        if (m != null) {
            for(double i : m) {
                System.out.print(i + "  ");
            }
        } else {
            System.out.print("NULL ");
        }
        System.out.print("} result: ");
        try {
            System.out.println(task35(m));
        } catch (Exception ex) {
            System.out.println("EXCEPTION! " + ex.getMessage());
        }
    }
}
