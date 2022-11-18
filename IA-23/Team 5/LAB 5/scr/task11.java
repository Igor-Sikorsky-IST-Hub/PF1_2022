public class task11 {

    public static void main(String[] args) {
        int[][] oneWin = { {0, 1, 2, 0, 2}, {1, 0, 2, 0, 2}, {1, 1, 0, 0, 1}, {1, 0, 2, 0, 2}, {2, 2, 1, 2, 0}};
        printResult(oneWin);
        int[][] twoWin = { {0, 1, 2, 0, 2}, {1, 0, 2, 0, 2}, {1, 1, 0, 1, 1}, {1, 0, 2, 0, 2}, {2, 2, 1, 2, 0}};
        printResult(twoWin);
        int[][] onlyWin = { {1, 1, 2, 0, 2}, {1, 0, 2, 1, 2}, {1, 1, 0, 1, 1}, {1, 2, 2, 0, 2}, {2, 2, 1, 2, 0}};
        printResult(onlyWin);
        int[][] onlyLose = { {0, 1, 2, 0, 2}, {1, 0, 2, 0, 2}, {1, 0, 0, 1, 1}, {1, 0, 2, 0, 2}, {2, 0, 1, 2, 0}};
        printResult(onlyLose);
    }
    public static void getFlawless(int[][] results){
            int i=0,j=0;
for (int k = 0; k < results.length; k++) {
            for (int m = 0; m < results[0].length; m++) {
                if (results[k][m] != 0 && k == m) {
                    throw new IllegalArgumentException("Таблиця не підходить!!!");
                }
            }
        }

        for (int[] l : results) {
            for (int s : l)
                if (s == 2)
                    i = i + 1;
                else if (s == 1) {
                    i = i + 1;
                }
            if (i >= 4)
                j = j + 1;
            i = 0;

        }

        System.out.println("В цьому сезоні стільки команд закінчило без програшів: " + j);
    }
    public static void printResult(int[][] results){
        try {
            getFlawless(results);
        } catch (IllegalArgumentException e){
            System.out.println("Увага! " + e.getMessage());
        }
    }
}


