public class RuntimeException {
    public static void main(String[] args) {
        try {
            int a = 1 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error: Dividing by zero");
        }
        int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7};

        try {
            System.out.println(arr[8]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index");
        } finally {
            System.out.println("Array length is " + arr.length);
        }
    }
}
