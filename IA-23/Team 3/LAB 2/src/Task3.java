public class Task3 {
    public static void main(String[] args) {
        double a = 1.234, b = -3.12, c = 5.45, d = 2, y;
        y = Math.pow((2 * Math.sin(a) + Math.cos(Math.abs(b * Math.sqrt(c)))), d);
        System.out.print(y);
    }
}