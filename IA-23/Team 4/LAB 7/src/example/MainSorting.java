package example;

public class MainSorting {
    public static void main(String[] args) {
        Array bubble = new Array(new BubbleSort());
        float[] bubbleArray = {12.4f, 46.54f, 24.2f, 22.43f, 43.32f, 92.35f};
        System.out.println("Bubble sort method: ");
        bubble.sort(bubbleArray);
        bubble.toString(bubbleArray);
        System.out.println();

        Array selection = new Array(new SelectionSort());
        float[] selectionArray = {12.4f, 46.54f, 24.2f, 22.43f, 43.32f, 92.35f};
        System.out.println("Selection sort method: ");
        selection.sort(selectionArray);
        selection.toString(selectionArray);
        System.out.println();

        Array insertion = new Array(new InsertionSort());
        float[] insertionArray = {12.4f, 46.54f, 24.2f, 22.43f, 43.32f, 92.35f};
        System.out.println("Insertion sort method: ");
        insertion.sort(insertionArray);
        insertion.toString(insertionArray);
        System.out.println();
    }
}
