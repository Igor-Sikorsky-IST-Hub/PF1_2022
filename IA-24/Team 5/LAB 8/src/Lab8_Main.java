package lab8;

/**
 * Lab 8 Main class (need for checking task)
 *
 * @author Kiiko Anna
 */
public class Lab8_Main {

    /**
     * Entry point. Tests the different classes on this task.
     *
     * @param args the standart parameter of the function.
     */
    public static void main(String[] args) {
        try {
            System.out.println("---------------------------------------------------");
            System.out.println("\tLab 8. Team 5.");
            System.out.println("---------------------------------------------------");

            VehicleInterface interface1 = 
                new Automobile("Ferrari", "red", EngineType.Gasoline);          
            System.out.println("interface1.toString() => " + interface1.toString());
            System.out.println("---------------------------------------------------");
        
            Automobile automobile1 = 
                new Automobile("Renault Daster", "black", EngineType.Diesel);
            System.out.println("automobile1.toString() => " + automobile1.toString());
            automobile1.setRegistration("AA2022EX");
            System.out.println("Пiсля присвоєння реєстрацiйного номера - automobile1.toString() =>\n" + automobile1.toString());
            System.out.println("---------------------------------------------------");

            Automobile automobile2 = 
                new Automobile("Volkswagen Golf 5", "pink", EngineType.Diesel);
            System.out.println("automobile2.toString() => " + automobile2.toString());
            VehicleInterface interface2 = automobile2;

            automobile2.setRegistration("AX2020EX");
            automobile2.repainting("dark green");
            automobile2.updateFuelSystem(EngineType.Gas, 55.0);
            System.out.println("Пiсля виконання методiв - automobile2.toString() =>\n" + automobile2.toString());
            System.out.println("---------------------------------------------------");
            
            Ship ship1 = 
                new Ship("Ulsan (FFX Batch III)", "blue", EngineType.Nuclear, 3200);
            System.out.println("ship1.toString() => " + ship1.toString());
            VehicleInterface interface3 = ship1;
            System.out.println("---------------------------------------------------");

            System.out.println("Пiсля присвоєння реєстрацiйного номеру (з використанням методiв iнтерфейсу)...");
            interface1.setRegistration("AA0001AA");
            interface2.setRegistration("AA0002BB");
            interface3.setRegistration("AA0003CC");
            System.out.println("interface1.toString() => " + interface1.toString());
            System.out.println("interface2.toString() => " + interface2.toString());
            System.out.println("interface3.toString() => " + interface3.toString());

            System.out.println("---------------------------------------------------");
            System.out.println("interface1.equals(interface2): " + interface1.equals(interface2));
            System.out.println("interface1.equals(interface3): " + interface1.equals(interface3));
            System.out.println("---------------------------------------------------");

        } catch (Exception ex) {
            System.out.println("EXCEPTION! " + ex.getMessage());
        }
    }
}
