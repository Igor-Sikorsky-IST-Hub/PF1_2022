package lab8;

enum EngineType {
    UndefinedEngine,    //Невизначеного типу (або відсутній)
    Diesel,             //ДВЗ - дизель
    Gasoline,           //ДВЗ - бензин
    Gas,                //ДВЗ - газ
    Electro,            //Електромобіль
    Nuclear             //Атомний (наразі актуально тільки для човнів :)
}
//-----------------------------------------------------------------------------

/**
 * Lab 8: interface class for the abstract vehicle
 *
 * @author Kiiko Anna
 */
public interface VehicleInterface {
    /** 
     * The method for checking to equals different vehicles
     * 
     * @return Boolean, True if equals
     */
    public Boolean equals(VehicleInterface refMoovingTool);
    
    /** 
     * The method for making String with information about the vehicle 
     * 
     * @param refMoovingTool the different interface to vehicle
     * @return String with base information about the vehicle
     */
    public String toString();

    /**
     * Getter for the vehicle registration number
     *
     */
    public String getRegistration();

    /**
     * Setter for the vehicle registration number
     *
     * @param regNumber the new registration number (government)  for the vehicle
     * @exception NullPointerException if regNumber is null
     */
    public void setRegistration(String regNumber);
}
