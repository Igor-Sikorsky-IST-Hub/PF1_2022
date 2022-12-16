public class Task67 {
    public static void printResult(int A[],int B[]){
        // Ініціалізація змінних
        int a = 0;
        int b = 0;
        int t = 0;
        // додаємо до масиву однакову кулькість елементів з двох масивів
        int[] C = new int[B.length + A.length];
        while ((a < A.length) && (b < B.length)){
            C[t] = A[a];
            a++;
            t++;
            C[t] = B[b];
            b++;
            t++;
        }

        // якщо кількість елементів у масивах не однакова то решта елементів у більшому масиві просто допишемо до кінця С
        if ((a == A.length) && (b != B.length)){
            while (b < B.length){
                C[t] = B[b];
                t++;
                b++;
            }
        }
        else if ((b == B.length) && (a != A.length)) {
            while (a < A.length){
                C[t] = A[a];
                t++;
                a++;
            }
        }
        // виводимо результат у один рядок речер пробіл
        for (int i = 0; i < C.length; i++){
            System.out.print(C[i] + " ");
        }
    }


    public static void main(String[] args) {
        // Ініціалізація масивів
        int[] A = {1,2,3,4,5,6,7,8,9};
        int[] B = {11,12,13,14,15,16,17,18,19,20,21,22};
        //використовуємо функції
        printResult(A,B);

    }}