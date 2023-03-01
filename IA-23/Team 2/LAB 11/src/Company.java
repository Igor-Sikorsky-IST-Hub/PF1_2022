import java.util.*;

public class Company {
    public static void main(String args[]) {
        System.out.println("Company name: GnomIT");
        System.out.println("Director name: Michael Reeves");
        TreeSet set = new TreeSet();
        set.add("MARKETING");
        set.add("LEGAL");
        set.add("HR");
        set.add("OPERATIONS");

        for (Iterator i = set.iterator(); i.hasNext();) {
            Object o = i.next();
            System.out.println(o);
        }
    }
}
