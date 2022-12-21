public class LAB7 {

    public static void main(String[] args) {
        byte[] arr = { (byte) 5, (byte) 10, (byte) 4,
                (byte) 78, (byte) 1, (byte) 20, (byte) 10, (byte) -2, (byte) 127,
                (byte) 0, (byte) -35, (byte) 87, (byte) 10, (byte) 33, (byte) -5, (byte) -54, (byte) 1, (byte) -1 };
        PrintArray printer = new PrintArray(arr);
        printer.Print(new NonSorted());
        printer.Print(new SortByInsertion());
        printer.Print(new SortByBubble());
    }
}

/*

1й принцип SOLID (Single Responsibility Principle): PrintArray відповідає
лише за друк массиву arr, відсортованим за обраною стратегією.
5й принцип SOLID (Dependency Inversion Principle): PrintArray не залежить від
окремих класів з реалізацією того чи іншого сортування.
 */
class PrintArray {
    private byte[] arr;

    public PrintArray(byte[] arr) {
        this.arr = arr;
    }

    public void Print(Strategy strategy) {
        SortingStrategy sorting = new SortingStrategy(strategy);
        byte[] sortedArray = sorting.Sorting(arr);
        System.out.println(sorting.getContext());
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i] + " ");
        }
        System.out.println();
    }
}

/*

реалізація паттерну Стратегія: створення будь-якої кількості алгоритмів
сортування, залишаючи клас друку незалежним від використання довільного
алгоритму

 */
interface Strategy {
    byte[] Sorting(byte[] inArr);

    String getContext();
}

class SortingStrategy {
    Strategy strategy;

    public SortingStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public byte[] Sorting(byte[] inArr) {
        return strategy.Sorting(inArr);
    }

    public String getContext() {
        return strategy.getContext();
    }
}

class NonSorted implements Strategy {
    @Override
    public byte[] Sorting(byte[] inArr) {
        return inArr;
    }

    @Override
    public String getContext() {
        return "Print input array";
    }
}

class SortByBubble implements Strategy {
    @Override
    public byte[] Sorting(byte[] inArr) {
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

    @Override
    public String getContext() {
        return "Print array sorted by bubbleSort";
    }
}

class SortByInsertion implements Strategy {
    @Override
    // алгоритм взятий з https://uk.wikipedia.org/wiki/Сортування_включенням
    public byte[] Sorting(byte[] inArr) {
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

    @Override
    public String getContext() {
        return "Print array sorted by insertionSort";
    }
}