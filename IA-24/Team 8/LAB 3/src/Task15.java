package lab3;

public class Task15 {
    public static void main(String[] args) {
        printSum(0.01);
        printSum(0);
        printSum(-0.01);
        printSum(0.03);
        System.out.println("End");
    }

    public static double element(int i) {
        double result = Math.pow(-1, i + 1) / i / (i + 1) / (i + 2);
        return result;
    }

    public static double calculation(double e) {
        if (e <= 0) {
            throw new IllegalArgumentException("e must be > 0");
        }
        int i = 1;
        double current = element(i);
        double previous = 0;
        double sum = 0;
        while (Math.abs(current - previous) > e) {
            previous = current;
            i++;
            sum += current;
            current = element(i);
        }
        return sum;
    }

    public static void printSum(double e) {
        try {
            System.out.println(calculation(e));
        } catch (IllegalArgumentException y) {
            System.out.println("Exception: " + y.getMessage());
        }
    }
}
