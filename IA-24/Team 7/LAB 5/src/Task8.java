public class Task8 {

    public static void result(int[][]a, int[][]b){
        if (a[0].length == b.length){
            int x = b.length;
            int[][] c = new int[a.length][b[0].length];
            System.out.println("Множення матриць: ");
            for (int i = 0; i< c.length; i++){
                for(int j = 0; j<c[i].length; j++){
                    for(int f = 0; f<x; f++)
                        c[i][j] += (a[i][f]*b[f][j]);
                    System.out.print(c[i][j]+ " ");
                }
                System.out.println();
            }
        }
        else {
            System.out.println("Множення неможливе");
        }
    }
    public static void main(String[] args) {
        int[][] a = new int[5][3];
        int[][] b = new int[3][4];
        System.out.println("Перша матриця: ");
        int  t = 0;
        for (int i = 0; i< a.length; i++){
            for(int j = 0; j<a[i].length; j++){
                a[i][j] = t;
                t++;
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Друга матриця: ");
        for (int i = 0; i< b.length; i++){
            for(int j = 0; j<b[i].length; j++){
                b[i][j] = t;
                t++;
                System.out.print(b[i][j]+ " ");
            }
            System.out.println();
        }
        result(a,b);
    }
}
