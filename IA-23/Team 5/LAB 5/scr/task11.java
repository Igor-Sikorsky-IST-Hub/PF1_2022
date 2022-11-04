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
            for(int[] l : results) {
                for (int s : l)
                    i = s == 2 ? i + 1 : s == 0 ? i : s == 1 ? i + 1 : i;
                j = i >= 4 ? j + 1 : j;
                i = 0;

            }
            if (j == 0){
                throw new IllegalArgumentException("Жодна з команд не закінчила сезон без програшів!");
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


