package lab4;

/**
 * Lab 4, Task 65
 *
 * @author Kiiko Anna
 */
public class Lab4_Task65 {

    /**
     * Entry point. Tests the method {@code task65(...)} by calling the helper
     * method {@code printResults(m)} few times with different arguments.
     *
     * @param args the standart parameter of the function.
     */
    public static void main(String[] args) {
        printResults(new int[] {});
        printResults(new int[] {1, 2, 4, 7, 8});
        printResults(new int[] {1, 2, 3, 4, -3, -7, 0});
        printResults(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11});
        printResults(new int[] {1, 2, 3, 4, -5, -6, -7, -8, -9, -10, -11});
        printResults(new int[] {0, 1, 2, 3, 4, 0, 0, 0, 0, 0, 0, 15});
        printResults(null);
    }

    /**
     * Returns the value for the array according to formula from the task
     *
     * @param m the parameter of the function.
     * @return the sum according to formula from the task.
     * @exception NullPointerException if array is null
     */
    public static int[] task65(int[] m) {
        if (null == m) {
            throw new NullPointerException("The array is null!");
        }
        int[] rezultArray = new int[m.length];
        int maxIndex = m.length -1;
        for (int indexArray = 0; indexArray <= maxIndex; ++indexArray) {
            rezultArray[indexArray] = m[maxIndex - indexArray];
        }
        return rezultArray;
    }

    /**
     * Helper method for printing result of {@code task65(m)}.
     *
     * @param m the parameter of the function.
     */
    static void printResults(int[] m) {
        System.out.print("For { ");
        if (m != null) {
            for(int i : m) {
                System.out.print(i + "  ");
            }
        } else {
            System.out.print("NULL ");
        }
        System.out.print("} result: { ");
        try {
            int[] t = task65(m);
            for(int i : t) {
                System.out.print(i + "  ");
            }
            System.out.println("}");
        } catch (Exception ex) {
            System.out.println("EXCEPTION! " + ex.getMessage());
        }
    }
}
