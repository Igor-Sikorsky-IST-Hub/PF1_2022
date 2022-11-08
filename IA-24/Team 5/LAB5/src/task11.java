package lab.five;

public class task11 {
}
    class results {
        public static void main(String args[]) {
            int[][] results1 = {
                    {0, 1, 2, 0},
                    {2, 0, 2, 1},
                    {1, 2, 0, 2},
                    {0, 2, 0, 0},
            };
            int[][] results2 = {
                    {0, 1, 2, 0},
                    {0, 0, 2, 1},
                    {1, 0, 0, 2},
                    {0, Integer.MAX_VALUE, 0, 0},
            };
            printtResults(results1);
            printtResults(results2);
        }

        public static String getFlawless(int[][] results) {
            System.out.print("The teams, which played with no one lose: ");
            int len = results.length;
            int[] resul = new int[len];
            for (int i = 0; i < len; i++) {
                int k = 0;
                for (int j = 0; j < len; j++) {
                    if (i == j) continue;
                    if (results[i][j]== Integer.MAX_VALUE) {
                        throw new IllegalArgumentException();
                    } else if (results[i][j] > 0) k++;
                }
                if (k == len - 1) {
                    resul[i] = i + 1;
                    System.out.print(resul[i] + "  ");
                }
            }
            return " ";
        }

        public static void printtResults(int[][] results) {
            try {
                System.out.println(getFlawless(results));
            } catch (IllegalArgumentException e) {
                System.out.println("Exception!!!! Change the results of some game");
            }
        }
    }






