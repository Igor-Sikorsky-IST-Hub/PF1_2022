package op.lab;

public class task_3 {

    public static void main(String[] args) {
        int[] a = {6, 1, -9, -3, 8, 7};
        printResults(a);

    }
    static int result(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (Double.isNaN(i)) {
                throw new IllegalArgumentException("Недопустимий елемент = " + i);
            }
            max = Math.max(max, a[i]);
        }
        return max;
    }
    private static void printResults(int[] a) {
        System.out.print("Максимальний елемент = " );
        try {
            System.out.println(result(a));
        } catch (IllegalArgumentException e) {
            System.out.println("Увага! " + e.getMessage());
        }
    }
}

