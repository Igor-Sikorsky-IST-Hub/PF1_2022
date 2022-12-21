class Vehicle {
    private int weight;
    int peoples;
    String name;
    public Vehicle(String name) {

        this.name = name;
    }
    public Vehicle(String name , int weight){
        this.weight = weight;
        this.name = name;
    }
    public Vehicle(String name , int weight , int peoples){
        this.name = name;
        this.weight = weight;
        this.peoples = peoples;

    }
    public String toString(){

        return "Name: " + name;
    }
    public int road(int fuel, int speed){

        return fuel * speed;
    }
    public int getWeight(){
        return weight;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    public boolean equals(Vehicle boat){
        return this.peoples == boat.peoples;
    }
    public int road(int fuel){
        return fuel;
    }
    public int road(){
        return 2+2;
    }

}

class Car extends Vehicle {
    String garage;
    public Car(String name, String garage){
        super(name);
        this.garage = garage;
    }

    @Override
    public String toString(){
        return super.toString() + " Place: " + garage;
    }
    @Override
    public int road(int fuel, int speed){
        return fuel * speed;
    }

}
class Boat extends Vehicle {
    public Boat(String name) {
        super(name);
    }

    @Override
    public int road(int fuel, int speed){

        return fuel * speed;
    }





}

public class task{
    public static void main(String[] args){
        Vehicle lambo = new Car("Ламбо","Гараж");
        Vehicle liner = new Boat("Оксамит");
        Vehicle liner2G = new Boat("Перемога");
        Vehicle cross = new Vehicle("4x4",205,100);
        Vehicle lanos = new Vehicle("Devo",105);
        Vehicle jigul = new Vehicle("Заз");
        liner.peoples = 5;
        liner2G.peoples = 5;
        System.out.println("В лайнер Оксамит та Перемога помішається однакова кількість людей: " + liner.equals(liner2G));
        System.out.println("На цьому бензині я проїду: " + lambo.road(8,6) + " кілометрів");
        System.out.println("Another method: " + lambo.road(5));
        System.out.println("Another method x2:" + lambo.road());
        System.out.println(lambo.toString());
        liner.setWeight(1000);
        System.out.println("Корабель під назвою " + liner.name + " важить " + liner.getWeight() + " тонн");
        liner.setWeight(500);
        System.out.println("А інший корабель з такою самою назвою " + lambo.name + " важить " + liner.getWeight() + " тонн");


    }
}
