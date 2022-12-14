public class Task6 {
    public Task6() {
    }

    public static void main(String[] args) {
        printResults(1.0, 1);
        printResults(2.0, 2);
        printResults(4.0, 3);
        printResults(4.0, 4);
        printResults(0.0, 1);
        printResults(0.0, 2);
        printResults(0.0, 3);
        printResults(-1.0, 1);
        printResults(-1.0, 2);
        printResults(-1.0, 3);
        printResults(Double.NaN, 1);
        printResults(4.0, Integer.MAX_VALUE);
    }

    public static double axx(double t, int i) {
        if (i < 1) {
            throw new IllegalArgumentException("param i = " + i);
        } else {
            double expression = 0.0;
            switch (i) {
                case 1:
                    expression = Math.sqrt(t);
                case 2:
                    expression = 1.0 / Math.sqrt(t);
                default:
                    for(int k = 0; k <= i; ++k) {
                        expression += (double)k * t;
                    }

                    return expression;
            }
        }
    }

    static void printResults(double t, int i) {
        System.out.print("i:" + i + " t: " + t + " result: ");

        try {
            System.out.println(axx(t, i));
        } catch (IllegalArgumentException var4) {
            System.out.println("EXCEPTION! " + var4.getMessage());
        }

    }
}