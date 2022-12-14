public class Task66 {

    public static void main(String[] args) {
        printResults(2, 5);
        printResults(0, 1);
        printResults(10, 1);
    }

    public static String mass(int n, int m) {
        if (n < 1) {
            throw new IllegalArgumentException("param n = " + n);
        } else if (m < 1) {
            throw new IllegalArgumentException("param m = " + m);
        }

        int[] a = new int[n];
        int[] b = new int[m];
        int[] c = new int[n + m];

        for (int i = 0; i < n; i++) { a[i] = i; }
        for (int i = 0; i < m; i++) {
            b[i] = i * 2;
        }

        int i = 0;
        for (int x : a) {
            c[i] = x;
            i++;
        }
        for (int x : b) {
            c[i] = x;
            i++;
        }
        String res = "";
        for (int x : c) {
            res = res + x + " ";
        }

        return res;
    }

    static void printResults(int n, int m) {
        System.out.print("n:" + n + " m:" + m + " result: ");
        try {
            System.out.println(mass(n, m));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}