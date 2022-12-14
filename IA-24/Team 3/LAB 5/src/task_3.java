package op.lab;

public class task_3  {
    public static void main(String[] args) {
        printResults(new int[][]{{10, 2, 3}, {1, 10, -6}, {1, 8, 3}});
        printResults(new int[][]{{15, 16, 3}, {18, 10, -6}, {1, 8, 15}});
        printResults(new int[][]{{100, 2244, 3}, {Integer.MIN_VALUE, 120, -6}, {1, 25, 3}});
        printResults(new int[][]{{122, 2, 3}, {1, 121, -6}, {1, 8, 310}});
        printResults(new int[][]{{10, Integer.MAX_VALUE, 3}, {1, 120, -126}, {125, 8, 3}});
    }

    private static void printResults(int[][] matrix) {
        System.out.println("Нова матриця");
        try {
            int[][] swapedMatrix = swapColumns(matrix);
            for (int[] ints : swapedMatrix) {
                for (int anInt : ints) {
                    System.out.print(anInt + " ");
                }
                System.out.println();
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Увага! " + e.getMessage());
        }

    }

    static int[][] swapColumns( int[][] matrix){
        int min = 0;
        int columnOfMin = 0;
        int max = 0;
        int columnOfMax = 0;

        int numOfRows = matrix.length;
        int numOfColumns = matrix[0].length;
        for (int i = 0; i < numOfColumns; i++) {
            for (int j = 0; j < numOfRows; j++) {
                if (matrix[i][j] == Integer.MAX_VALUE | matrix[i][j] == Integer.MIN_VALUE) {
                    throw new IllegalArgumentException("Недопустимий елемент = " + matrix[i][j]);
                } else {
                    if (matrix[j][i] < min) {
                        min = matrix[j][i];
                        columnOfMin = i;
                    }
                    if (matrix[numOfColumns - (j + 1)][numOfRows - (i + 1)] > max) {
                        max = matrix[numOfColumns - (j + 1)][numOfRows - (i + 1)];
                        columnOfMax = numOfColumns - (j + 1);
                    }
                }
            }
        }


        int save;
        for (int i = 0; i < numOfRows; i++) {
            save = matrix[i][columnOfMin];
            matrix[i][columnOfMin] = matrix[i][columnOfMax];
            matrix[i][columnOfMax] = save;
        }

        return matrix;
    }

}