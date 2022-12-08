public class Lab5 {
    public static void main(String[] args) {
        printResults(new int[][]{{3, 25, 20}, {0, 25, 10}, {0, 50, 70}});
        printResults(new int[][]{{0, 1, -10, 15}, {-3, -17, 0, 56}, {0, 12, 0, 98}, {Integer.MAX_VALUE, 0, 45, 948, 0}});
        printResults(new int[][]{{100, 2244, 3}, {Integer.MIN_VALUE, 120, -6}, {1, 25, 3}});
        printResults(new int[][]{{-15, 16, 3}, {-18, 10, -6}, {-111, 8, 15}});


    }


    private static double printResults(int[][] matrix) {
        System.out.println("Матриця");
        try {
            int min=minElement(matrix);
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("Мінімальний елемент - "+min);

        } catch (IllegalArgumentException e) {
            System.out.println("Увага! " + e.getMessage());
        }

        return 0;
    }

    static int minElement(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == Integer.MAX_VALUE | matrix[i][j] == Integer.MIN_VALUE) {
                    throw new IllegalArgumentException("Недопустимий елемент = " + matrix[i][j]);
                }
            }
        }
        int sum_column = 0;
        int sum = 0;
        int min=0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                sum += Math.abs(matrix[j][i]);
            }
            if (sum >= sum_column) {
                sum_column = sum;
                min = getMin(i, matrix);
            }
            sum = 0;
        }
        return min;
    }
    static int getMin(int i,int[][] matrix) {
        int min = matrix[0][i];
        for (int j = 0; j < matrix.length; j++) {
            if (min>matrix[j][i]){
                min= matrix[j][i];
            }
        }
        return min;
    }

}