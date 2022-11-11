public class num1 {
    public static void main(String[] args) {
        multiply(new int[][] {{1, 2}, {1, 2}}, new int[][]{{2, 3}, {2, 3}});
        multiply(new int[][] {{1, 2, 3},{2, 3, 4}}, new int[][]{{1, 2, 3}, {2, 3, 4}, {5, 6, 7}});
    }

    public static void multiply(int[][] a, int[][] b){
        String t = "";
        for(int i = 0; i<a.length; ++i){
            if(a[0].length!=a[i].length){
                t = "IllegalArgumentException";
                System.out.println(t);
            }
        }
        for(int i = 0; i<a.length; ++i) {
            if (b[0].length != b[i].length) {
                t = "IllegalArgumentException";
                System.out.println(t);
            }
        }
        if(t!= "IllegalArgumentException"){
            if(a[1].length!=b.length){
                t = "IllegalArgumentException";
                System.out.println(t);
            }
        }
        if(t != "IllegalArgumentException"){
            int num = 0;
            int[][] c = new int[a.length][b[1].length];
            for(int i = 0; i<a.length; ++i){
                for(int k = 0; k<b[0].length; ++k){
                    for(int q = 0; q<a[1].length; ++q){
                        num += a[i][q] * b[q][k];
                    }
                    c[i][k] = num;
                    num = 0;
                }
            }
            System.out.println("Матриця");
            for (int i = 0; i < c.length; i++) {
                for (int j = 0; j < c[i].length; j++) {
                    System.out.print(c[i][j] + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
