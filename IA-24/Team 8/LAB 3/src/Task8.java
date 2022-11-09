import java.util.Arrays;

public class Task8 {
    public class Main {
        public static void main(String[] args) {
            int x[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

            int z = Arrays.stream(x).filter(y -> y % 3 == 0).sum();

            System.out.println(z);
        }
    }
}
