public class SortingArray {
    public static void main(String[] args) {
        Strategy sortingNow = new Strategy();
        short[] a = {-1, -2, -3, 12, -5, 1};
        sortingNow.setStrategy(new Selection());
        sortingNow.executeStrategy(a);
        short[] b = {11, 12, 17, -12, 0};
        sortingNow.setStrategy(new Bubble());
        sortingNow.executeStrategy(b);
        short[] c = {-23, -3, -23, -54, -11, 21};
        sortingNow.setStrategy(new Insertion());
        sortingNow.executeStrategy(c);
    }
}
