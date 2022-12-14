import java.util.Arrays;


public class Task31 {
    public static void main(String[] args) {
    printResults(new int[]{1, 0, 88, 7});
    printResults(new int[]{4, 88, 1, 7});
    printResults(new int[]{21, 20, 23, 24});
    printResults(new int[]{3, 5, 7, 2});
    printResults(new int[]{2, 3, 1, 4});
    printResults(new int[]{1, 2, 3, 4});
    printResults(new int[]{4, 3, 2, 1});
    printResults(new int[]{10, 11, 13, 14});
    printResults(new int[]{11, 12, 10, 14});
    printResults(new int[]{2, 12, 13, 1});
    printResults(new int[]{-1, -2, -3, -4});
    printResults(new int[]{120, 43, 13, 0});
    printResults(new int[]{-5, 0, -1, 23});
    printResults(new int[]{1, 1, 1, 1});

}
    public static int axx(int[] array) {
        int count = 0;
        int counter  = 0;
        for(int i : array) {
            if (i==0) {
                throw new IllegalArgumentException("array number = " + 0);
            } else if (i < 0) {
                throw new IllegalArgumentException("array number is negative");
            } else if(i > 0) {
                counter++; // якщо рахувати елементи масиву не з 0, а з 1
                int min = array[0];
                if (i < min) {
                    min = i;
                    count = min + counter;
                } else if (i == min) {
                    count = min+1;
                }
            }
        }
        return count;
    }
    static void printResults(int[] array) {

        System.out.print("Arrays:" + Arrays.toString(array) + " results:");
        try {
            System.out.println(axx(array));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}
