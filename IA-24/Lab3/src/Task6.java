public class Task6 {
    public static void main(String[] args) {
        printResults(4, 1);
        printResults(2, 2);
        printResults(4, 3);
        printResults(4, 4);
        printResults(0,1);
        printResults(0, 2);
        printResults(0, 3);
        printResults(-1, 1);
        printResults(-1, 2);
        printResults(-1, 3);
        printResults(Double.NaN, 1);
        printResults(4, Integer.MAX_VALUE);
    }


    public static double axx(double t, int i) {
        if (i < 1) {
            throw new IllegalArgumentException("param i = " + i);
        }

        double expression = 0.0;
        switch (i) {
            case 1:
                expression = Math.sqrt(t);
            case 2:
                expression = 1 / (Math.sqrt(t));
            default:
                for (int k = 0; k <= i; k++) {
                    expression += k * t;
                }

        }

        return expression;
    }


    static void printResults(double t, int i) {
        System.out.print("i:"+ i + " t: "+t+" result: ");
        try {
            System.out.println(axx(t, i));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}

