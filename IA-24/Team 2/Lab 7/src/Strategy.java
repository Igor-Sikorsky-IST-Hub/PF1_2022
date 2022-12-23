public class Strategy {
    Sorting strategy;

    public void setStrategy(Sorting strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy(short[] array) {
        strategy.sort(array);
    }
}
