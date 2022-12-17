public class num2 {
    //лаба6(2)
    public static void main(String[] args) {
        printResult(new short[] {1, 34, 56, 67, 78, 56, 12, -23, -98, 32});
        printResult(new short[] {98, 87, 76, 65, 54, 43, 32, 21});
        printResult(new short[] {});
    }

    public static short[] selectionsort(short[] a){
        if(a.length>0){
            short num = 0;
            short min = Short.MAX_VALUE;
            int x = 0;
            for (int i = 0; i < a.length; ++i) {
                min = Short.MAX_VALUE;
                for (int k = i; k < a.length; ++k) {
                    if (a[k] < min) {
                        x = k;
                        min = a[k];
                    }
                }
                num = a[x];
                a[x] = a[i];
                a[i] = num;
            }
            return a;
        }
        return null;
    }


    public static void printResult(short[] a){
        if(a.length>0){
            System.out.println("Матриця:");
            for (int i = 0; i < a.length; ++i) {
                System.out.print(" " + selectionsort(a)[i] + " ");
            }
            System.out.println();
        }
        else {
            System.out.println("IllegalArgumentException");
        }
    }
}
