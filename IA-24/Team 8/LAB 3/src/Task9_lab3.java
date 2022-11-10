public class Task9_lab3 {
    private static double printResults(Integer t, Integer l) {
        double result = 0;
        if ((t < 1) | (l < 0)) {
            System.out.println("\nImpossible!!!!!!!!!!!!!!");
        }
        else {
            if (l % 2 != 0) {
                for (int i = 1; i <= t; i++) {
                    result += firstEquation(t, l);
                }
            } else {
                for (int i = 1; i <= t; i++) {
                    result += secondEquation(t, l);
                }
            }
            System.out.println("\nt = " + t);
            System.out.println("l = " + l);
            System.out.println("Result = " + result);
        }
        return 0;
    }

    private static double firstEquation(int x, int y) {
        return Math.sqrt(x * y);
    }

    private static double secondEquation(int x, int y) {
        return y / Math.sqrt(x);
    }

    public static void main(String[] args) {
        printResults(1,9);
        printResults(4, 8);
        printResults(-5, 0);
        printResults(10, -3);
    }
}