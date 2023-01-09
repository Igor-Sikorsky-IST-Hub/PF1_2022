import java.util.ArrayList;
public class Task61 {

    public static void main(String[] args) {
        printResults(new int[] {1, 2, 3, 4, 6}, new int[] {-1, 3, 0, -4, 5});
        printResults(new int[] {0, 2, 4}, new int[] {1, 2});
        printResults(new int[] {-1, -2, 4, 5}, new int[] {-6, -4, -2, 1});
    }

    public static ArrayList<Integer> task61(int[] firstArray, int[] secondArray) {
        ArrayList<Integer> resultArray = new ArrayList<Integer>();

        if (firstArray.length != secondArray.length) {
            throw new IllegalArgumentException("Error: arrays must have the same length");
        }

        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] > 0 && secondArray[i] > 0) {
                resultArray.add(firstArray[i] + secondArray[i]);
            } else if (firstArray[i] < 0 && secondArray[i] < 0) {
                resultArray.add(firstArray[i] * secondArray[i]);
            } else {
                resultArray.add(0);
            }
        }

        return resultArray;
    }

    static void printResults(int[] firstArray, int[] secondArray) {
        try {
            System.out.print("result: ");
            System.out.println(task61(firstArray, secondArray));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION" + e.getMessage());
        }
    }
}
