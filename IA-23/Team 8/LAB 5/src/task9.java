public class task9 {
    public static void main(String[] args) {
        printResults(new int[][]{{1, 10, 0}, {0, 5, 0}, {0, 6, 10}});
        printResults(new int[][]{{0, 1, -10, 5}, {-3, 17, 0, 56}, {0, 2, 0, 98}, {Integer.MAX_VALUE, 0, 45, 1000, 0}});
        printResults(new int[][]{{100, 224, 3}, {Integer.MIN_VALUE, 140, -4}, {1, 25, 30}});
        printResults(new int[][]{{5, 6, 3}, {8, 10, -6}, {1, 8, 15}});
    }


    private static void printResults(int[][] matrix) {
        try {
            System.out.println("New matrix");
            int[] array = toArray(matrix);
            for (int i = 1; i < array.length + 1; i++) {
                if (i % 3 == 0) {
                    System.out.print("Element - " + array[i - 1] + " ");
                    System.out.println();
                } else if (i % 3 == 1) {
                    System.out.print("Column - " + array[i - 1] + " ");
                } else System.out.print("Row - " + array[i - 1] + " ");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Attention! " + e.getMessage());
        }

    }

    static int[] toArray(int[][] matrix) {
        int k = 0;
        int[] res = new int[count(matrix) * 3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == Integer.MAX_VALUE | matrix[i][j] == Integer.MIN_VALUE) {
                    throw new IllegalArgumentException("Invalid element = " + matrix[i][j]);
                }
                if (matrix[i][j] != 0) {
                    res[k] = i;
                    res[k + 1] = j;
                    res[k + 2] = matrix[i][j];
                    k = k + 3;
                    if (i == matrix.length - 1 & j == matrix[i].length - 1) {
                        return res;
                    }
                }
            }
        }
        return res;
    }

    static int count(int[][] matrix) {
        int b = 0;
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                if (anInt != 0) {
                    b++;
                }

            }
        }
        return b;
    }

}