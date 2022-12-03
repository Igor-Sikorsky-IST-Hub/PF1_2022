public class Main {
    public static void main(String[] args){
        Drop drop = new Drop("Краплі", 123, 50);
        Pill pill = new Pill("Таблетки", 234);
        Pill pill1 = new Pill("Краплі в ніс", 250);
        pill.buy();
        drop.setDiscount(50);
        drop.newCost();
        drop.buy();
        System.out.println(Drop.generalCost);
        System.out.println(drop);
        System.out.println(pill);

    }
}

abstract class Medicamente {
    double discount;
    final String name;
    double cost;
    static double generalCost;

    public Medicamente(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public Medicamente(double discount, String name, double cost) {
        this.discount = discount;
        this.name = name;
        this.cost = cost;
    }
    public double newCost() {
        if (discount > 0 & discount<=100) {
            cost = cost * discount / 100;
            return cost;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public double newCost(double discount) {
        this.discount = discount;
        if (discount > 0 & discount<=100) {
            cost = cost * discount / 100;
            return cost;
        } else {
            throw new IllegalArgumentException();
        }
    }



    public double buy() {
        generalCost += cost;
        return generalCost;
    }

    public String setName() {
        return this.name;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object obj) {
        boolean flag = false;
        if (obj instanceof Medicamente) {
            Medicamente medicamente = (Medicamente) obj;
            if(medicamente.setName().equals(((Medicamente) obj).setName())) {
                flag = true;
            } else {
                flag = false;
            }
        }
        else {
            flag = false;
        }
        return flag;
    }


}

class Pill extends Medicamente {
    public Pill(final double discount, String name, double cost) {
        super(discount, name, cost);
    }

    public Pill(String name, double cost) {
        super(name, cost);
    }

    @Override
    public double buy() {
        return super.buy();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

class Drop extends Medicamente{
    double millilitersInOneBottle;

    private Drop(String name, double cost) {
        super(name, cost);
    }

    private Drop(double discount, String name, double cost) {
        super(discount, name, cost);
    }

    public Drop(String name, double cost, double millilitersInOneBottle) {
        super(name, cost);
        this.millilitersInOneBottle = millilitersInOneBottle;
    }

    public Drop(final double discount, String name, double cost, double millilitersInOneBottle) {
        super(discount, name, cost);
        this.millilitersInOneBottle = millilitersInOneBottle;
    }

    @Override
    public double buy() {
        return super.buy();
    }

    @Override
    public String toString() {
        return "Drop{" + "millilitersInOneBottle=" + millilitersInOneBottle + ", discount=" + discount + "%" + ", name='" + name + '\'' + ", cost=" + cost + '}';
    }



    public double getMillilitersInOneBottle() {
        return millilitersInOneBottle;
    }

    public void setMillilitersInOneBottle(double millilitersInOneBottle) {
        this.millilitersInOneBottle = millilitersInOneBottle;
    }


}