public class Main {
    public static void main(String[] args) {
        byte[] firstArray = {4, -1, 11, 0, 7};
        byte[] secondArray = {5, 4, 3, 6, 1};
        byte[] thirdArray = {10, -3, 1 ,5, -4};

        Sorter bubbleRow = new Sorter(new BubbleSort(), new RowPrint());
        Sorter selectionColumn = new Sorter(new SelectionSort(), new ColumnPrint());
        Sorter insertionRow = new Sorter(new InsertionSort(), new RowPrint());

        bubbleRow.execute(firstArray);
        selectionColumn.execute(secondArray);
        insertionRow.execute(thirdArray);
    }
}