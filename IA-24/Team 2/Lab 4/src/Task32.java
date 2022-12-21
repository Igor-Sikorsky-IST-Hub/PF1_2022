

public class Task32 {

    public static void main(String[] args) {

        printResults(new int[]{2, 5, 7, 14, 8, 9, 6, 43, 45, 10});
        printResults(new int[]{1, 6, 3, 5, 9, 5, 7, 8, 1, 17});
        printResults(new int[]{1, 2, 4, 6, 12, 7, 8, 12, 13, 10});
        printResults(new int[]{15, 44, 7, 5, 10, 78, 6, 14, 11, 1});
        printResults(new int[]{1, 2, 3, 2, 13, 4, 15, 7, 9, 8});
    }


    public static int findsum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if ((i + 1) % 2 != 0) {
                if (array[i] % 2 == 0) {
                    sum += array[i];
                }
            }
        }

        if (sum == 0) {
            throw new IllegalArgumentException("Відсутні парні числа що стоять на непарних місцях");
        }
        return sum;
    }

    static void printResults(int[] array) {
        System.out.print("Сумма парних чисел що стоять на непарних місцях: ");
        try {
            System.out.println(findsum(array));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION " + e.getMessage());
        }
    }

}