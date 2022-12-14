package lab3;
import static java.lang.Math.*;

public class Task2 {
    public static void main(String[] args) {
        printResults(1, 1);
        printResults(1, 2);
        printResults(1, -1);
        printResults(-1, 1);
        printResults(23, 30);
        printResults(134545, 14355);
    }
    public static double x(int t, int l) {
        double sum = 0;
        for (int i = 0; i < t; i++) {            
            if (l % 2 == 1) {
                sum = sqrt(t * l);
            } else {
                sum = l / sqrt(t);
            }
        }
        return sum;
    }
    static void printResults(int t, int l) {
        System.out.println("t:" + t + " l:" + l + " result:" + x(t, l));
    }
}
