public class task1 {

    public static void main(String[] args) {
        printResults(new int[][] {
                {1, 2, 3},
                {0, -8, 4},
                {10, -12, -1},
        });
        printResults(new int[][] {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {-9, -10, -11, -2},
                {4, 2, -1, 8},
        });
        printResults(new int[][] {});
    }

    public static int[] addElementToArray(int arr[], int element) {

        int resultArr[] = new int[arr.length + 1];
        if (arr.length == 0) {
            resultArr[0] = element;
        } else {
            for (int i = 0; i < arr.length; i++) {
                resultArr[i] = arr[i];
            }
            resultArr[arr.length] = element;
        }


        return resultArr;
    }

    public static int minElementInLargestColumns(int[][] matrix) {

        if (matrix.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        
        int max = Integer.MIN_VALUE;
        int indexOfColumn = 0;
        int[] indexes = {};
        int min = 0;

        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix.length; j++) {
                sum += Math.abs(matrix[j][i]);
            }

            if (sum > max) {
                max = sum;
                indexOfColumn = i;
            }

        }
        indexes = addElementToArray(indexes, indexOfColumn);

        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix.length; j++) {
                sum += Math.abs(matrix[j][i]);
            }

            if (sum == max && indexOfColumn != i) {
                indexes = addElementToArray(indexes, i);
            }

        }

        min = matrix[0][indexes[0]];
        for (int i = 0; i < indexes.length; i ++) {
            for (int j = 1; j < matrix.length; j++) {
                if (min > matrix[j][indexes[i]]) min = matrix[j][indexes[i]];
            }
        }

        return min;
    }

    static void printResults(int[][] matrix) {
        try {
            System.out.print("result: ");
            System.out.println(minElementInLargestColumns(matrix));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION " + e.getMessage());
        }
    }
}
