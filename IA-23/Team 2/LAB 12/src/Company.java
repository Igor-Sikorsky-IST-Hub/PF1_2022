import java.util.*;

public class Company {
    public static void main(String args[]) {
        System.out.println("Company name: GnomIT");
        System.out.println("Director name: Michael Reeves");
        Set set = new HashSet();
        set.add("MARKETING");
        set.add("LEGAL");
        set.add("HR");
        set.add("OPERATIONS");

        System.out.println(set);
    }
}
