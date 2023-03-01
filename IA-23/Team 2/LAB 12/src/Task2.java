import java.util.*;

public class Task2 {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(21000, "Tom Jones, Marketing");
        map.put(22000, "Frank Anthony, Marketing");
        map.put(34000, "Ryan Gosling, Legal");
        map.put(18000, "Catherine Jones, HR");
        map.put(33000, "James Elliot, Operations");
        map.put(19000, "Tommy Versace, HR");
        map.put(17000, "Tom Ford, HR");
        map.put(20000, "Harry Major, Legal");
        map.put(30000, "Ethan Hardy, Legal");
        map.put(31000, "James Alvaro, Operations");
        map.put(35000, "John White, Operations");
        map.put(15000, "Nancy Smith, Marketing");
        TreeMap<Integer, String> sorted = new TreeMap<>();

        sorted.putAll(map);
        for (Map.Entry<Integer, String> entry : sorted.entrySet())
            System.out.println("Salary: " + entry.getKey() + "; Name and department: " + entry.getValue());
    }
}

