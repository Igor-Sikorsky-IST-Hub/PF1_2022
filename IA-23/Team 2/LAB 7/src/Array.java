public class Array {
    private Strategy strategy;

    public Array(Strategy strategy) {
        this.strategy = strategy;
    }

    public void sort(short[] array) {
        strategy.sort(array);
    }

    public void toString(short[] array) {
        for (short i : array) {
            System.out.print(i + " ");
        }
    }
}



