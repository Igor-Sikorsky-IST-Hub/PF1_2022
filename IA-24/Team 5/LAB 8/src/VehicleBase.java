package lab8;

/**
 * Lab 8: abstract class with the base methods for vehicles
 *
 * @author Kiiko Anna
 */
abstract class VehicleBase implements VehicleInterface{
    /** 
     * The parametrized constructor (can be used only in heirs)
     */
    protected VehicleBase(String model, String colour, EngineType typeEngin){
        this.model = model;
        this.colour = colour;
        this.typeEngin = typeEngin;
    }

    /** 
     * The method for making String with information about the vehicle 
     * (base parameters for the abstract class), but not well that the interface not 
     * extracted to diferent GUI class, it will be better according to SOLID-principies etc.
     * 
     * @return String with base information about the vehicle
     */
    public String toString(){
        String prepStr = "'" + regNumber + "'";
        prepStr += ", модель: " + model;
        prepStr += ", колiр: " + colour;
        prepStr += ", тип двигуна: ";
        switch(typeEngin) {
            case UndefinedEngine:
                prepStr += "Undefined";
                break;
            case Diesel:
                prepStr += "Diesel";
                break;
            case Gasoline:
                prepStr += "Gasoline";
                break;
            case Gas:
                prepStr += "Gas";
                break;
            case Electro:
                prepStr += "Electro";
                break;
            case Nuclear:
                prepStr += "Nuclear";
                break;
            default:
                prepStr += "UNKNOWN";
                break;
        }
        prepStr += " з мiсткiстю паливного бака " + capacityFuel.toString();
        return prepStr;
    }

    private String model;
    private String colour;
    protected Double capacityFuel = 0.0; //can be updated into heirs constructors.
    private EngineType typeEngin = EngineType.UndefinedEngine;
    private String regNumber;

    /**
     * Update the fuel system (all setter for fuel system information)
     *
     * @param newEngineType the new engine type (after upgrade).
     * @param newCapacityFuel new fuel capacity (after upgrade).
     * @exception NullPointerException if parameters are null
     * @exception IllegalArgumentException if capacityFuel is negative
     */
    public void updateFuelSystem(EngineType newEngineType, Double capacityFuel){
        if ((null == newEngineType) || (null == capacityFuel)) {
            throw new NullPointerException("Arguments are null!");    
        }   
        if (capacityFuel < 0.0) {
            throw new IllegalArgumentException("The capacityFuel cannot be negative!");
        }
        typeEngin = newEngineType;
        this.capacityFuel = capacityFuel;
    }

    /**
     * Update the fuel system (part setter) -> перевантаження (overloading)
     *
     * @param newCapacityFuel new fuel capacity (after upgrade).
     * @exception NullPointerException if newCapacityFuel is null
     * @exception IllegalArgumentException if newCapacityFuel is negative
     */
    public void updateFuelSystem(Double newCapacityFuel){ //перевантаження (overloading) updateFuelSystem()
        if (null == newCapacityFuel) {
            throw new NullPointerException("The capacityFuel is null!");
        }
        if (newCapacityFuel < 0.0) {
            throw new IllegalArgumentException("The capacityFuel cannot be negative!");
        }
        capacityFuel = newCapacityFuel;
    }

    /**
     * Repainting the vehicle colour (as setter)
     *
     * @param newColor the new colour for the vehicle
     * @exception NullPointerException if newColor is null
     */
    public void repainting(String newColor){
        if (null == newColor) {
            throw new NullPointerException("The newColor is null!");
        }
        colour = newColor;
    }

    /**
     * Setter for the vehicle registration number
     *
     * @param regNumber the new registration number (government)  for the vehicle
     * @exception NullPointerException if regNumber is null
     */
    public void setRegistration(String regNumber){
        if (null == regNumber) {
            throw new NullPointerException("The regNumber is null!");
        }
        this.regNumber = regNumber;
    }

    /**
     * Getter for the vehicle registration number
     *
     */
    public String getRegistration(){
        return this.regNumber;
    }
}
