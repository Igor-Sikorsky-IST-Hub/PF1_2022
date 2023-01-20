import java.util.Arrays;

public class Task2 {
    public static void result(short[] a){
        boolean first;
        short min = 0;
        short f = 0;
        short x;
        short y;
        for (short i = 0; i < a.length; i++) {
            short index =0;
            first = true;
            for (short j = f;j< a.length; j++){
                if(first){
                    min = a[j];
                    first = false;
                    index = j;
                }
                if (min > a[j]){
                    min = a[j];
                    index = j;
                }
            }

            x = min;
            y = a[i];

            a[i] = x;
            a[index] = y;

            f +=1;
        }
        System.out.println(Arrays.toString(a));
    }
    public static void main(String[] args) {
        System.out.println("Массив до сортуання вибором:");
        short[] a = {5,2,7,1,3,2,1,9,6,8,1,4};
        System.out.println(Arrays.toString(a));
        System.out.println("Массив після сортуання вибором:");
        result(a);
    }
}
