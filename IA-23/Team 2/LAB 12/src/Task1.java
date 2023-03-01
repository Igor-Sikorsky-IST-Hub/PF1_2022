import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("21000", "Tom Jones");
        map.put("22000", "Frank Anthony");
        map.put("34000", "Ryan Gosling");
        map.put("18000", "Catherine Jones");
        map.put("33000", "James Elliot");
        map.put("19000", "Tommy Versace");
        map.put("17000", "Tom Ford");
        map.put("20000", "Harry Major");
        map.put("30000", "Ethan Hardy");
        map.put("31000", "James Alvaro");
        map.put("35000", "John White");
        map.put("15000", "Nancy Smith");
        map.put("45000", "Michael Reeves");

        TreeMap<String, String> sorted = new TreeMap<>();

        sorted.putAll(map);
        for(Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Salary: " + entry.getKey() + "; Name: " + entry.getValue());
        }
    }
}