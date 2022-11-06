import java.util.Scanner;

public class Task6 {
    public static void Table(int[][] a, int n) {
        for (byte i = 0; i < n; i++) {
            for (byte j = 0; j < n; j++) {
                a[i][j] = (int) (Math.random() * 3);
            }
        }
        for (byte i = 0; i < n; i++) {
            for (byte j = 0; j < n; j++) {
                switch (a[i][j]) {
                    case 0:
                        a[i][j] = 2;
                        break;
                    case 1:
                        a[i][j] = 1;
                        break;
                    case 2:
                        a[i][j] = 0;
                        break;
                }
                if (i == j)
                    a[i][j] = 0;
                System.out.println(a[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();
        System.out.println("\n");
        if (n < 1) {
            throw new IllegalArgumentException("n must be positive");
        }
        int[][] array = new int[n][n];
        Table(array, n);
        System.out.println(FindWinTeams(array) + " teams won more than lost");
    }

    public static int FindWinTeams(int[][] matrix)
    {
        int winTeams = 0;
        for (int i = 0; i < matrix.length; i++) {
            int wins = 0;
            int loses = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if(i!=j)
                {
                    if(matrix[i][j] == 2)
                        wins++;
                    else if(matrix[i][j] == 0)
                        loses++;
                }
            }
            if(wins > loses)
                winTeams++;
        }
        return winTeams;
    }

}