package lab8;

/**
 * Lab 8: Ship class 
 *
 * @author Kiiko Anna
 */
public class Ship extends VehicleBase{
    public Ship(String model, String colour, EngineType typeEngin, int displacement_tons){
        super(model, colour, typeEngin);
        this.shipDisplacement = displacement_tons;
    }

    @Override
    public String toString(){
        return "Човен " + super.toString() + ". Човен має водоiзмiщення " + getShipDisplacement() + " тон.";
    }

    @Override
    public Boolean equals(VehicleInterface refMoovingTool){
        return (refMoovingTool instanceof Ship);
    }

    // the ship displacement in tons
    private Integer shipDisplacement;
    public Integer getShipDisplacement(){
        return shipDisplacement;
    }    
}
