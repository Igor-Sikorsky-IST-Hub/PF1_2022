public class Main {
    public static void main(String[] args){
        Drop drop = new Drop("Краплі", 100, 100);
        Pill pill = new Pill(1, "pill", 50);
        Pill pill1 = new Pill(2, "pill", 50);
        pill.buy();
        pill1.buy();
        drop.newCost(40);
        drop.buy();
        drop.buy();
        System.out.println(drop.generalCost);
        System.out.println(pill.generalCost);
        System.out.println(pill1.equals(pill));
        System.out.println(drop.equals(pill1));
        System.out.println(pill.toString());

    }
}

abstract class Medicamente {
    double discount;
    final String name;
    double cost;
    double generalCost;

    public Medicamente(final String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public Medicamente(double discount,final String name, double cost) {
        this.discount = discount;
        this.name = name;
        this.cost = cost;
    }

    public double newCost() {
        if (discount > 0 & discount <= 100) {
            cost = cost - cost * discount / 100;
            return cost;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public double newCost(double discount) {
        this.discount = discount;
        if (discount > 0 & discount <= 100) {
            cost = cost - cost * discount / 100;
            return cost;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public double buy() {
        generalCost += cost;
        return generalCost;
    }

    public String getName() {
        return name;
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
}

class Pill extends Medicamente {
    public Pill(final double discount, final String name, double cost) {
        super(discount, name, cost);
    }

    public Pill(final String name, double cost) {
        super(name, cost);
    }
    @Override
    public String toString() {
        return "Pill{" + "discount=" + discount + ", name='" + name + '\'' + ", cost=" + cost + '}';
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Pill) {
            Pill pill = (Pill) obj;
            if(pill.getName().equals(getName()) && pill.cost == cost && pill.discount ==discount) {
                return true;
            } else {
                return false;
            }
        }
        else {
            return false;
        }
    }
}

class Drop extends Medicamente {
    double millilitersInOneBottle;

    private Drop(String name, double cost) {
        super(name, cost);
    }

    private Drop(double discount, String name, double cost) {
        super(discount, name, cost);
    }

    public Drop(final String name, double cost, double millilitersInOneBottle) {
        super(name, cost);
        this.millilitersInOneBottle = millilitersInOneBottle;
    }

    public Drop(final double discount,final String name, double cost, double millilitersInOneBottle) {
        super(discount, name, cost);
        this.millilitersInOneBottle = millilitersInOneBottle;
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

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Drop) {
            Drop drop = (Drop) obj;
            if (getMillilitersInOneBottle() == drop.getMillilitersInOneBottle()) {
                return super.equals(obj);
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }
}
