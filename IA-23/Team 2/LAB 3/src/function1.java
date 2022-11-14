public class function1 {
    /**
     * Entry point. Tests the method {@code axx(k,z)} by calling the helper
     * method {@code printResults(k,z)} few times with different arguments.
     *
     * @param //k the parameter of the function {@code axx(k,z)}.
     * @param //z the argument of the function {@code axx(k,z)}.
     */

    public static void main(String[] args) {
        printResults(15, 15);
        printResults(15, 16);
        printResults(16, 15);
        printResults(16, 16);
        printResults(17, 16);
        printResults(16, 17);
        printResults(17, -10);
        printResults(16, 10);
        printResults(-16, 10);
        printResults(15, Double.MAX_VALUE);
        printResults(16, Double.MAX_VALUE);
        printResults(16, Double.NaN);
    }

    /**
     * Returns the value of the first argument multiplied by the square of the
     * second argument. Special cases:
     * <ul><li>If the first argument is less than 15, then
     * exception IllegarArgumentException is thrown.</ul>
     *
     * @param k the parameter of the function.
     * @param z the argument of the function.
     * @return a * x * x.
     * @throws IllegalArgumentException if a&lt;15
     */

    public static double axx(double k, double z) {
        if (k < 15) {
            throw new IllegalArgumentException("param k = " + k);

        }
        return (1 / Math.sqrt(z * 1) + Math.tan(1 / k));
    }

    static void printResults(double k, double z) {
        System.out.print("k:" + k + " z:" + z + " result:");
        try {
            System.out.println(axx(k, z));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }

    }
}

