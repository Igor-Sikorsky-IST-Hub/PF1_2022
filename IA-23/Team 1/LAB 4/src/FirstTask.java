public class FirstTask {

    public static void main(String[] args) {
        printResults(new int[] {});
        printResults(new int[] {0, 1, 2, 3, 4, 5});
        printResults(new int[] {-1, -2, -3, 5});
        printResults(new int[] {-3, -4, -5});
    }

    public static int firstTask(int[] array) {
        int sum = 0;

        if (array.length == 0) {
            throw new IllegalArgumentException("Type some values into array");
        }
        for (int i = 0; i < array.length; i++) {
           if (array[i] > 0) {
               sum+= array[i];
           }
       }

        return sum;
    }

    static void printResults(int[] array) {
        try {
            System.out.print("array:"  + " result: ");
            System.out.println(firstTask(array));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}



