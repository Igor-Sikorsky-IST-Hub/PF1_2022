public class RowPrint implements IPrint {
    public void print(byte[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }

        System.out.println();
    }
}
