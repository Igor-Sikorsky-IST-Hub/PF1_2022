public class ComparatorByPrice implements java.util.Comparator<Goods> {
    @Override
    public int compare(Goods o1, Goods o2) {
        return Integer.compare(o1.recPrice, o2.recPrice);
    }
}
