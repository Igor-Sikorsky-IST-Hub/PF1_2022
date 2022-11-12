public class Task6 {
    public static void main(String[] args) {
        int[] arr = {10, 135, 3, -12, 4, -6, -10, -155, 12, 17, 34, 77, -83};
        int[] arr2 = {12, 13, 16, 17, 18, 19, 23};

        printResults(arr);
        printResults(arr2);
    }

    public static int getMin(int[] arr) {
        int res = Integer.MAX_VALUE;
        for (int elem : arr) {
            if (elem % 5 == 0) {
                res = Math.min(res, elem);
            }
        }
        if (res == Integer.MAX_VALUE) {
            throw new IllegalArgumentException("У даному масиві відсутні числа, що кратні 5");
        }
        return res;
    }


    static void printResults(int[] arr) {
        try {
            System.out.println("Найменнше число, що кратне 5: " + getMin(arr));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}
