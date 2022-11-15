package op.lab;

public class task_13 {
    public static void main(String[] args) {
        printResults(0);
        printResults(-1);
        printResults(9);
        printResults(0.019);
    }

    static double dodanok (int i) {
        double funk = 0;
        for (int k = 1; k <= i; k++) {
            funk += k;
        }
        return (Math.pow(-1, i) / funk);
    }

    public static double fid (double e) {
        if (e <= 0) {
            throw new IllegalArgumentException("param ε = " + e);
        }
        double res = 0;
        int i = 1;
        while (Math.abs(dodanok(i)) > e) {
            res += dodanok(i);
            i++;
        }
        return res;
    }

    static void printResults(double e) {
        System.out.print("e: " + e + " result ");
        try {
            System.out.println(fid(e));
        } catch (IllegalArgumentException er) {
            System.out.println("EXCEPTION! " + er.getMessage());
        }
    }
}



