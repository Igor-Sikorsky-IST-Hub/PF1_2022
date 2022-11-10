public class Main {
    public static void main(String[] args) {
        minElementInLargestColumn(new int[][]{{1, 2, 3, 4, 5, 6}, {1, 2, 3, 4, 5, 6}, {1, 2, 3, 4, 5, 6}});
        minElementInLargestColumn(new int[][]{{1, 4, 6},{1 ,2},{2, 4, 5}});
    }


    public static void minElementInLargestColumn(int[][] a) {
        System.out.println();
        String t = "";
        for (int i = 1; i < a.length; ++i) {
            if (a[0].length != a[i].length) {
                t = "IllegalArgumentException";
                System.out.println(t);
            }
        }
        if(t != "IllegalArgumentException") {
            int sumele = 0;
            int sum = 0;
            int min = 1000;
            for (int k = 0; k < a[0].length; ++k) {
                sumele = 0;
                for (int i = 0; i < a.length; ++i) {
                    sumele += Math.abs(a[i][k]);
                }
                if (sumele >= sum) {
                    sum = sumele;
                    for (int i = 0; i < a.length; ++i) {
                        min = 1000;
                        if (a[i][k] < min) {
                            min = a[i][k];
                        }
                    }
                }
            }
            System.out.println("Матриця:");
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[0].length; j++) {
                    System.out.print(" " + a[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("Найменший елемент: " + min);
        }
    }
}