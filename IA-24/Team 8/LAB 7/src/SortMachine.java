package lab7;

public class SortMachine {
    Sorting typeOfSorting;
    long[] array;
    public void setTypeOfSorting(Sorting typeOfSorting) {
        this.typeOfSorting = typeOfSorting;
    }
    public void setArray(long[] array) {
        this.array = array;
    }
    public void executeSorting() {
        long[] result = typeOfSorting.sortSomething(array);
        typeOfSorting.printResult(result);
    }
}
