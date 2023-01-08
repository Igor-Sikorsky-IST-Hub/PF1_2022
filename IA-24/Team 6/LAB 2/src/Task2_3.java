package OP1.LAB2;

public class Task2_3 {
    public static void main(String[] args) {
        System.out.println("Завдання №2(18): " + task2(2.34, 0.756, 2.23, -1.653) );
        System.out.println("Завдання №3(3): " + task3(1.234, -3.12, 5.45, 2.0));
    }
    public static double task2(double a, double b, double c, double d) {
        double val1 = (Math.pow(Math.E, c) + 2 * Math.log(a)) / Math.sqrt(Math.pow(c, b));
        double val2 = val1 * Math.abs(Math.asin(d));
        return val2;
    }

    public static double task3(double a, double b, double c, double d) {
        double val1 = Math.pow(((2 * Math.sin(a)) + Math.cos(Math.abs(b * Math.sqrt(c)))), d);
        return val1;
    }


}
