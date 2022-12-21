public class Main {
    public static void main(String[] args) {
        Array array1 = new Array(new long[]{8, 6, 2, 1, 6, 0, 4});
        array1.printArray();
        array1.setSortingType(new BubbleSorting());
        array1.sort();
        array1.printArray();

        Array array2 = new Array(new long[]{4, 2, 8, 0, 4, 6});
        array2.printArray();
        array2.setSortingType(new SelectionSorting());
        array2.sort();
        array2.printArray();

        Array array3 = new Array(new long[] {5, 2, 8, 1, 9, 1, 9, 5, 8, 3});
        array3.printArray();
        array3.setSortingType(new InsertionSorting());
        array3.sort();
        array3.printArray();
    }
}
