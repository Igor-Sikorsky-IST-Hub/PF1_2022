public class Main {
        public static void main(String[] args) {
            printResults(new int[]{});
            printResults(new int[]{2, 45, 37, 68, 25});
            printResults(new int[]{1, 3, 6, 7});
            printResults(new int[]{1, 2, 3, 4, 45, 5, 6,});
            printResults(new int[]{100, 200, 300});
            printResults(new int[]{0, 1, 2});
            printResults(new int[]{-1, 2, 3});
        }

        public static int arrays(int[] array) {
            int sum = 0;
            if (array.length == 0) {
                throw new IllegalArgumentException("Type some values into array");
            }
            for (int num : array) {
                if (num < 0) {
                    throw new IllegalArgumentException("Element in array <0 ");
                }
            }
            for (int num : array) {
                if (num > 3)
                    sum = sum + num;
            }
            return sum;
        }

        static void printResults(int[] array) {
            try {
                System.out.print("result: ");
                System.out.println(arrays(array));
            } catch (IllegalArgumentException e) {
                System.out.println("EXCEPTION! " + e.getMessage());
            }
        }
    }
