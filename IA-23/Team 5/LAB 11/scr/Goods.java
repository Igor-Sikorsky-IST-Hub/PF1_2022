public class Goods implements Comparable<Goods>{
    String nameOfGood;
    int recPrice;

    public Goods(String nameOfGood, int recPrice) {
        this.nameOfGood = nameOfGood;
        this.recPrice = recPrice;
    }

    public String toString(){
        return nameOfGood;
    }

    public int toShowPrice(){
        return recPrice;
    }

    @Override
    public int compareTo(Goods o) {
        return this.nameOfGood.compareTo(o.nameOfGood);
    }
}
