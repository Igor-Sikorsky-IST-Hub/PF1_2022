public class ColumnPrint implements IPrint {
    public void print(byte[] arr) {
        for (int value : arr) {
            System.out.println(value);
        }
    }
}
