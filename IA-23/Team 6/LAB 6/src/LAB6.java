public class LAB6 {

    public static void main(String[] args) {
        byte[] arr = { (byte) 5, (byte) 10, (byte) 4,
                (byte) 78, (byte) 1, (byte) 20, (byte) 10, (byte) -2, (byte) 127,
                (byte) 0, (byte) -35, (byte) 87, (byte) 10, (byte) 33, (byte) -5, (byte) -54, (byte) 1, (byte) -1 };
        printArray("Print input array", arr);
        printArray("Print array sorted by insertionSort", insertionSort(arr));
        printArray("Print array sorted by bubbleSort", bubbleSort(arr));
    }

    static byte[] bubbleSort(byte[] inArr) {
        byte[] arr = inArr.clone(); // щоб не змінювати вихідний масив
        boolean сhange = true;
        while (сhange) { // виконуємо, поки відбуваються зміни в сортуванні
            сhange = false; // припускаємо, що змін не буде
            for (int i = 1; i < arr.length; i++) {
                if (arr[i - 1] < arr[i]) { // якщо лівий елемент менший за правого, міняємо їх місцями
                    byte temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    сhange = true; // відбулася зміна, цикл піде на наступне виконання
                }
            }
        }
        return arr;
    }

    // алгоритм взятий з https://uk.wikipedia.org/wiki/Сортування_включенням
    static byte[] insertionSort(byte[] inArr) {
        byte[] arr = inArr.clone(); // щоб не змінювати вихідний масив
        for (int i = 1; i < arr.length; i++) { // починаємо з другого елементу масиву
            byte key = arr[i]; // key - значення елементу, який ми зараз будемо рухати вліво
            int j = i;
            while ((j > 0) && (arr[j - 1] < key)) { // рухаємось вліво по масиву пока не дійдемо до початку або до
                // елемента, НЕ меншого за key
                byte temp = arr[j];
                arr[j] = arr[j - 1]; // елемент зліва менший за key, треба перемістити його вправо
                arr[j - 1] = temp;
                j--;
            }
            arr[j] = key; // вставляємо key на його нове місце
        }
        return arr;
    }

    static void printArray(String s, byte[] arr) {
        System.out.println(s);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}