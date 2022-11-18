public class Main {
    //лаба 6(1)
    public static void main(String[] args) {
        printResult(new short[] {1, 34, 67, 23, 2, 78, 70});
        printResult(new short[] {-1, -45, 12, -34, -67, -89, -67});
        printResult(new short[] {98, 76, 65, 54, 43, 32, 21});
        printResult(new short[] {});
    }

    public static boolean again(short[] a){
        boolean t = true;
        if(a.length==0){
            t = false;
        }
        return t;
    }

    public static short[] array(short[] a){
        if(again(a)){
            short num = 0;
            for(int i = 0; i< a.length;++i){
                for(int k = 0; k<a.length - 1 - i; ++k){
                    if(a[k]>a[k + 1]){
                        num = a[k];
                        a[k] = a[k + 1];
                        a[k + 1] = num;
                    }
                }
            }
            return a;
        }
        else {
            return null;
        }
    }

    public static void printResult(short[] a){
        if(again(a)){
            System.out.println("Матриця:");
            for(int i = 0; i<a.length; ++i) {
                System.out.print(" " + array(a)[i] + " ");
            }
            System.out.println();
        }
        else {
            System.out.println("IllegalArgumentException");
        }
    }
}