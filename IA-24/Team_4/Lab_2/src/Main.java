import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 39");
        double a = 4.88, b = -0.54, c = 1.25, d = 0.34;
        double y;
        y = log(abs(b / a * sqrt(abs(cos(c) / (log(sqrt(d)) / log(sqrt(c))))))) / log(c);
        System.out.println(y);

        System.out.println("Task 40");
        a = 21.58;
        b = 5.34;
        c = 2.65;
        d = 3.33;
        y = log(sin(c) / a * sqrt(abs(log(abs(a * b) * c) / (log(d) / log(sqrt(c)))))) / log(a);
        System.out.println(y);

        System.out.println("Task 1");
        a = -1.49;
        b = 23.4;
        c = 1.23;
        d = 2.542;
        y = sqrt(abs(sin(a) - 4 * log(b) / pow(c, d)));
        System.out.println(y);
    }
}