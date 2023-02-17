import java.util.*;
public class Institute {
    String name;
    public static TreeSet<Faculty> allFaculties = new TreeSet<>();
    public Institute(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public static TreeSet<Faculty> getAllFaculties(){
        return allFaculties;
    }
    public void addFaculties(Faculty faculties){
        allFaculties.add(faculties);
    }
}
