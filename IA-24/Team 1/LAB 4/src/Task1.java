import java.util.Arrays;



public class Task1 {
        public static void main(String[] args) {
            printResults(new int[]{1, 2, 3, 4});
            printResults(new int[]{-1, 2, -8, -9});
            printResults(new int[]{9, 90, 153, 0});
            printResults(new int[]{-3, -7, -256, -8});
            printResults(new int[]{-25, 0, -4, 40});
            printResults(new int[]{2, 2, 2, 2});
            printResults(new int[]{-7, -7, -7, -7});
            printResults(new int[]{0, 0, 0, 0});
            printResults(new int[]{-9, 8, 7, 3});
            printResults(new int[]{-1, Integer.MAX_VALUE, 1});

        }
        public static int axx(int[] array) {
            int count = 0;
            for(int i : array) {
                if (i==0) {
                    throw new IllegalArgumentException("array number  = " + 0);
                } else if(i > 0) {
                    count+=1;
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
