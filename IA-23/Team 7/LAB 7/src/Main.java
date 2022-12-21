public class Main {
    public static void main(String[] args){
        Array array1 = new Array(new short[] {1, 4, 67, 45, 23});
        array1.sortingby(new BubbleSort());
        array1.printResult();
        System.out.println();

        Array array2 = new Array(new short[] {23, 56, 23, 45, 89, -23, -76, 124});
        array2.sortingby(new SelectionSort());
        array2.printResult();
        System.out.println();

        Array array3 = new Array(new short[] {23, 90, -12, -67, 34, 20, 7});
        array3.sortingby(new InsertSort());
        array3.printResult();

        Array array4 = new Array(new short[] {});
        array4.sortingby(new InsertSort());
        array4.printResult();
    }
}

class Array {
    short[] a;
    Sort sort;
    public Array(short[] array) {
        this.a = array;
    }
    public void sortingby(Sort sort) {
        this.sort = sort;
        if(a.length>0){
            sort.sorting(a);
        }
        else {
            throw new  IllegalArgumentException();
        }
    }
    public void printResult(){
        System.out.println("Матриця:");
        for(int i = 0; i<a.length; ++i) {
            System.out.print(" " + a[i] + " ");
        }
        System.out.println(sort.getClass());
    }
}

class SelectionSort implements Sort {
    @Override
    public void sorting(short[] a) {
        if(a.length>0){
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
        }
    }
}



class BubbleSort implements Sort {
    @Override
    public void sorting(short[] a) {
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
        }
    }
}

class InsertSort implements Sort{
    @Override
    public void sorting(short[] a) {
        if(a.length>0){
            short num;
            for(int i = 1; i<a.length; ++i){
                for (int k = 0; k<i; ++k){
                    if(a[i]<a[k]){
                        num = a[i];
                        for(int n = i; n>k; n -= 1){
                            a[n]=a[n-1];
                        }
                        a[k] = num;
                    }
                }
            }
        }
    }
}

interface Sort {
    void sorting(short[] a);
}