import java.util.Arrays;

public class Task8 {
    public static int calculation(int[] a) {
        int z;
        z = Arrays.stream(a).filter(y -> y % 3 == 0).sum();
        return z;
    }
    public static void main(String[] args){
        int x[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Сума чисел, кратних 3: " + calculation(x));
    }
}
