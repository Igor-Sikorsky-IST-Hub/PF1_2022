public class Task2 {

    public static void main(String[] args) {
        printResults(1,3);
        printResults(1,2);
        printResults(11,2);
        printResults(11,0);
        printResults(-1,1);
        printResults(-1,4);
    }

    public static double m1(double t, int i) {
        if (i < 1 ) {
            throw new IllegalArgumentException("param i = " + i);
        } else if ((t <= 0) && (i < 3)) {
            throw new IllegalArgumentException("param i = " + i + " param t = " + t);
        }
        double res = 0;
        if (i < 3) {
            res = Math.log(t);
        }else {
            for (int k = 1; k <= i; k++){
                res += Math.sin(t) / k;
            }
            }
        return res;
    }

    static void printResults(double t, int i) {
        System.out.print("t:" + t + ", i:" + i + " result:");
        try {
            System.out.println(m1(t,i));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}
