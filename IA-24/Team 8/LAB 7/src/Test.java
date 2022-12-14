package lab7;

public class Test {
    public static void main(String[] args) {
        SortMachine firstMachine = new SortMachine();

        firstMachine.setTypeOfSorting(new SelectionSort());
        firstMachine.setArray(new long[]{10293729, 42649321, 9238422, 948422, 2107846362, 3267843, 52, 10982347});
        firstMachine.executeSorting();

        firstMachine.setTypeOfSorting(new InsertionSort());
        firstMachine.setArray(new long[]{10293729, 42649321, 9238422, 948422, 2107846362, 3267843, 2378, 10982347});
        firstMachine.executeSorting();

        firstMachine.setTypeOfSorting(new BubbleSort());
        firstMachine.setArray(new long[]{10293729, 42649321, 9238422, 948422, 2107846362, 3267843, 182735, 10982347});
        firstMachine.executeSorting();
    }
}
