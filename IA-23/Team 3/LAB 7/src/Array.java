public class Array {
    long[] array;
    SortingType sortingType;

    public Array(long[] array) {
        this.array = array;
    }

    public void setSortingType(SortingType sortingType) {
        this.sortingType = sortingType;
    }

    public void sort() {
        sortingType.sort(array);
    }

    public void printArray() {
        System.out.print("Array: ");
        for (long element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
