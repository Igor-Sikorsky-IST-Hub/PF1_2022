public class MainSorting {
    public static void main(String[] args) {
        Array insertion = new Array(new InsertionSorting());
        short[] insertionArray = {12, 45, 23, 22, 43};
        System.out.println("Insertion sort method: ");
        insertion.sort(insertionArray);
        insertion.toString(insertionArray);
        System.out.println();

        Array selection = new Array(new SelectionSorting());
        short[] selectionArray = {12, 45, 23, 22, 43};
        System.out.println("Selection sort method: ");
        selection.sort(selectionArray);
        selection.toString(selectionArray);
        System.out.println();

        Array bubble = new Array(new BubbleSorting());
        short[] bubbleArray = {12, 45, 23, 22, 43};
        System.out.println("Bubble sort method: ");
        bubble.sort(bubbleArray);
        bubble.toString(bubbleArray);
        System.out.println();

    }
}


