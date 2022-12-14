public class task2 {

    public static void main(String[] args) {

        printResults(new int[] {1, 3, 4, 5, 7, 9, 6, 4324});
        printResults(new int[] {1, 3, 3, 5, 3, 5, 7, 8, 1, 6});
        printResults(new int[] {1, 2, 4, 6, 4, 7});
        printResults(new int[] {0, -3, -4, -6, -99});
        printResults(new int[] {1, 2, 3, 2, -3});
    }

    public static int findsum(int[] arr){
        int sum = 0;
        for (int i : arr) {
            if (i > 3){
                sum += i;
            }
        }

        if (sum == 0){
            throw new IllegalArgumentException("Відсутні числа більші за 3");
        }
        return sum;
    }

    static void printResults(int[] arr) {
        System.out.println();
        try {
            System.out.println("Сумма елементів більших за 3: " + findsum(arr));
        } catch (IllegalArgumentException er) {
            System.out.println("EXEPTION " + er.getMessage());
        }
    }

}