public class Task31 {


    public static void main(String[] args) {
        printResults(new int[] {12, 0, 111, -1, 5, -2});
        printResults(new int[] {-1, -2, -5});
        printResults(new int[] {});
        printResults(new int[] {12, 5, -3, 3, 56});
    }

    public static int task(int[] array) {
        int sum = 0;
        int indexMin = 0;


        if (array.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        int minNum = array[0];

        for (int j : array) {
            if (j < minNum & j > 0) {
                minNum = j;
            }
        }

        if (minNum <= 0) {
            throw new IllegalArgumentException("The maximum element is negative");
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == minNum) {
                indexMin = i;
            }
        }

        sum = minNum + indexMin;
        return sum;
    }

    static void printResults(int[] array) {
        try {
            System.out.print("result: ");
            System.out.println(task(array));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }





}
