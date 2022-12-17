package lab8;

/**
 * Lab 8: Automobile class
 *
 * @author Kiiko Anna
 */
public class Automobile extends VehicleBase implements VehicleInterface{
    public Automobile(String model, String colour, EngineType typeEngin){
        super(model, colour, typeEngin);
        super.capacityFuel = 40.0;
    }

    // перевантаження (overloading) конструктору
    public Automobile(String model, String colour, EngineType typeEngin, int seatsNumber){ 
        this(model, colour, typeEngin); // can be used super(model, colour, typeEngin) instead of this()
        this.seatsNumber = seatsNumber;
    }

    @Override
    public String toString(){
        return "Автомобiль " + super.toString() + ", " + getSeatsNumber() + " мiсця (мiсць).";
    }

    @Override
    public Boolean equals(VehicleInterface refMoovingTool){
        return (refMoovingTool instanceof Automobile);
    }

    private int seatsNumber = 4;
    public int getSeatsNumber(){
        return seatsNumber;
    }

}
