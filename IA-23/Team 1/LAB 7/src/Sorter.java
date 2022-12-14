public class Sorter {
    ISort sorter;
    IPrint printer;

    public Sorter(ISort sorter, IPrint printer) {
        this.sorter = sorter;
        this.printer = printer;
    }

    public void execute(byte[] arr) {
        sorter.sort(arr);
        printer.print(arr);
    }
}
