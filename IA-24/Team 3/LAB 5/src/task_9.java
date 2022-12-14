package op.lab;

public class task_9 {
    public static void main(String[] args) {
        printResults(new int[][]{{3, 10, 0}, {0, 15, 0}, {0, 6, 100}});
        printResults(new int[][]{{0, 1, -10, 15}, {-3, -17, 0, 56}, {0, 12, 0, 98}, {Integer.MAX_VALUE, 0, 45, 948, 0}});
        printResults(new int[][]{{100, 2244, 3}, {Integer.MIN_VALUE, 120, -6}, {1, 25, 3}});
        printResults(new int[][]{{15, 16, 3}, {18, 10, -6}, {1, 8, 15}});
    }


    private static void printResults(int[][] matrix) {
        try {
            System.out.println("Нова матриця");
            int[] array = toArray(matrix);
            for (int i = 1; i < array.length + 1; i++) {
                if (i % 3 == 0) {
                    System.out.print("Eлемент - " + array[i - 1] + " ");
                    System.out.println();
                } else if (i % 3 == 1) {
                    System.out.print("Cтовпець - " + array[i - 1] + " ");
                } else System.out.print("Рядок - " + array[i - 1] + " ");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Увага! " + e.getMessage());
        }

    }

    static int[] toArray(int[][] matrix) {
        int k = 0;
        int[] res = new int[count(matrix) * 3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == Integer.MAX_VALUE | matrix[i][j] == Integer.MIN_VALUE) {
                    throw new IllegalArgumentException("Недопустимий елемент = " + matrix[i][j]);
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
