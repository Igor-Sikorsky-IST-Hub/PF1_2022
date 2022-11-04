public class task5 {
    public static void main(String[] args){
        printResult(4,6);
        System.out.println("======================================");
        printResult(4,8);
        System.out.println("======================================");
        printResult(8,8);
        System.out.println("======================================");
        printResult(4,4);
    }
    public static void clearNE(int a, int b) {
            if (a == b){
                throw new IllegalArgumentException("Це не прямокутник!!!");
            }
            int[][] aa = new int[a][b];
            for(int i = 0; i < a; i++){
                for(int j = 0; j < b; j++){
                    aa[i][j] = i < j ? 0 : i > j ? 5 : 0;
                    System.out.print(aa[i][j]);
                }
                System.out.println(" ");
            }

    }
    static void printResult(int a,int b){
        try {
            clearNE(a,b);
        } catch (IllegalArgumentException e){
            System.out.println("Увага!" + e.getMessage());
        }

    }
}

