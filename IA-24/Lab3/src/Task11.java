public class Task11 {
    public static void main(String[] args) {
        printResults(0);
        printResults( 1);
        printResults(10);
        printResults(11);
        printResults(21);
        printResults(12);
        printResults(40);
        printResults(3);
        printResults(31);
        printResults(2);
        printResults(4);
        printResults(Integer.MAX_VALUE);
        printResults(0.4);
    }


    public static double axx(double eps) {
        double sum = 0.0;
        int i =0;
        for (; ;) {
            i++;
            sum+=1/(i*i);
            if (eps <= Math.abs(1/(Math.pow(i, 2))))
                throw new IllegalArgumentException("param eps = " + eps);
                break;
        }

        return sum;
    }


    static void printResults(double eps) {
        System.out.print("Epsylon: " +eps+" Summary: ");
        try {
            System.out.println(axx(eps));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}
