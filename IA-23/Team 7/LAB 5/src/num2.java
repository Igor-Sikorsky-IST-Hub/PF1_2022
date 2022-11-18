public class num2 {
    public static void main(String[] args) {
        printResult(new int[][] {{1, 2}, {1, 2}}, new int[][]{{2, 3}, {2, 3}});
        printResult(new int[][] {{1, 2, 3},{2, 3, 4}}, new int[][]{{1, 2, 3}, {2, 3, 4}, {5, 6, 7}});
        printResult(new int[][]{{1, 2, 3}, {2, 3}}, new int[][]{{1, 2}, {1, 2, 3}});
    }

    public static boolean array(int[][] a, int[][] b) {
        boolean t = true;
        if(a.length==0){
            t=false;
        }
        if(b.length==0){
            t=false;
        }
        for (int i = 0; i < a.length; ++i){
            if (a[0].length != a[i].length) {
                t = false;
            }
        }
        for (int i = 0; i < a.length; ++i) {
            if (b[0].length != b[i].length) {
                t = false;
            }
        }
        if (a[1].length != b.length) {
            t = false;
        }
        return t;
    }

    public static int[][] multiply(int[][] a, int[][] b) {
        if (array(a, b)) {
            int num = 0;
            int[][] c = new int[a.length][b[1].length];
            for (int i = 0; i < a.length; ++i) {
                for (int k = 0; k < b[0].length; ++k) {
                    for (int q = 0; q < a[1].length; ++q) {
                        num += a[i][q] * b[q][k];
                    }
                    c[i][k] = num;
                    num = 0;
                }
            }
            return c;
        }
        return null;
    }

    public static void printResult(int[][] a, int[][] b) {
        if (array(a, b)) {
            System.out.println("Матриця");
            for (int i = 0; i < multiply(a, b).length; i++) {
                for (int j = 0; j < multiply(a, b)[i].length; j++) {
                    System.out.print(multiply(a, b)[i][j] + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
        else{
            System.out.println("IllegalArgumentException");
        }
    }
}

