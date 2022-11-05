//Я враховував, що індексація елементів починається з нуля
//Тоді непарні місця - місця з індексом 1, 3, 5 і т.д.

public class Main3 {
    public static void main(String[] args) {
        printResults(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        printResults(new int[]{2, 1, 4, 3, 6, 5, 8, 7, 10, 9});
        printResults(new int[]{3, 65, 23, 344, 2, 9, 1, 111});
        printResults(new int[]{});
        printResults(new int[]{1, 2, 5, 4, 8, 22, 23});
        printResults(new int[]{43, 44, 45, 46, 76, 1, 2});
        printResults(new int[]{-1, 0, 1, 2, 3});

    }

    public static int arrays(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Type some values into array");
        }
        for (int num : array) {
            if (num < 0) {
                throw new IllegalArgumentException("Element in array < 0 ");
            }
        }
        int index = 0;
        int sumEvenNumbers = 0;
        int[] result = new int[array.length];
        for (int k = 1; k < array.length; k += 2) {
            result[index] = array[k];// array[k] - включає змінні, розташовані на непарних місцях

            if (array[k] % 2 == 0) {
                sumEvenNumbers += array[k]; // sumEvenNumbers - сума парних змінних на непарних місцях
            }
        }
        return sumEvenNumbers;
    }

    static void printResults(int[] array) {
        try {
            System.out.print("result: ");
            System.out.println(arrays(array));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}


