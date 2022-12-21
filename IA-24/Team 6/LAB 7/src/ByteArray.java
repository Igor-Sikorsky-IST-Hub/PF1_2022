public class ByteArray {
    byte[] arr;
    SortType sortType;

    public ByteArray(byte[] arr) {
        this.arr = arr;
    }

    public void selectSorting(SortType sortType) {
        this.sortType = sortType;
    }

    public void printArray() {
        System.out.print("Array: ");
        for (long element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    public void printResults(byte[] arr) {
    	System.out.println("Масив:");
    	for(byte i: arr) {
    		System.out.print(i + " ");
    	}
    	System.out.println();
    	System.out.println("Відсортований масив:");
    	for(byte i: sortType.sort(arr)) {
    		System.out.print(i + " ");
    	}
    	System.out.println();
    }
}

