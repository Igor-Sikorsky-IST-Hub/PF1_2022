public class Task11 {
    public static void main(String[] args) {
        double res = 0;
        double i=1;
        while (Math.abs(res)>Math.abs(1/i*i) ) {
            res += (1/i*i);
            i++;

        }
        System.out.println(res);
    }
}
