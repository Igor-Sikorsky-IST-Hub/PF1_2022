import java.util.*;

public class Institute {
    String name;
    static HashMap<Integer, String> putFaculties = new HashMap<>();

    public Institute(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public static HashMap<Integer, String> getAllFaculties(){
        return putFaculties;
    }

}
