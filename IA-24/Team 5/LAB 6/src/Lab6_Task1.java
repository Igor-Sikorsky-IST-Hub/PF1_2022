package lab6;

/**
 * Lab 6, Task 1 (Selection sort)
 *
 * @author Kiiko Anna
 */
public class Lab6_Task1 {

    /**
     * Entry point. Tests the method {@code task1(...)} by calling the helper
     * method {@code printResults(m)} few times with different arguments.
     *
     * @param args the standart parameter of the function.
     */
    public static void main(String[] args) {
        printResults(new double[] {});
        printResults(new double[] {10, 1.0, 2, 9, 4, 7, 8});
        printResults(new double[] {1, 2, 3, 4, -3, -7, 0});
        printResults(null);
    }

    /**
     * Makes sorted the input array
     *
     * @param m the array for sorting.
     * @exception NullPointerException if array is null
     * @exception IllegalArgumentException if array is empty
     */
    public static void task1(double[] m) {
        if (null == m) {
            throw new NullPointerException("The array is null!");
        }
        if (m.length == 0) {
            throw new IllegalArgumentException("The array is empty!");
        }
        for (int i = 0; i < m.length - 1; ++i) {
            int minPos = i;
            for (int j = i + 1; j < m.length; ++j) {
                if (m[j] < m[minPos]) {
                    minPos = j;
                }
            }
            if (minPos != i) {
                double saveValue = m[minPos];
                m[minPos] = m[i];
                m[i] = saveValue;
            }
        }
    }

    /**
     * Helper method for printing result of {@code task1(m)}.
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
        System.out.print("} result: {");
        try {
            task1(m);
            for(double i : m) {
                System.out.print(i + "  ");
            }            
            System.out.println("}");
        } catch (Exception ex) {
            System.out.println("EXCEPTION! " + ex.getMessage());
        }
    }
}
