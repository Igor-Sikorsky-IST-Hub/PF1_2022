public class num2 {
    //лаба6(2)
    public static void main(String[] args) {
        printResult(new short[] {1, 34, 56, 67, 78, 56, 12, -23, -98, 32766});
        printResult(new short[] {98, 87, 76, 65, 54, 43, 32, 21});
        printResult(new short[] {});
    }

    public static boolean again(short[] a){
        boolean t = true;
        if(a.length == 0) {
            t = false;
        }
        return t;
    }

    public static short[] array(short[] a){
        if(again(a)){
            short num = 0;
            short min = 32767;
            int x = 0;
            for (int i = 0; i < a.length; ++i) {
                min = 32767;
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
        if(again(a)){
            System.out.println("Матриця:");
            for (int i = 0; i < a.length; ++i) {
                System.out.print(" " + array(a)[i] + " ");
            }
            System.out.println();
        }
        else {
            System.out.println("IllegalArgumentException");
        }
    }
}
