import java.util.*;

public class Company {
    public static void main(String args[]) {
        System.out.println("Company name: GnomIT");
        System.out.println("Director name: Michael Reeves");
        List<String> list = new ArrayList<String>();
        list.add("MARKETING");
        list.add("LEGAL");
        list.add("HR");
        list.add("OPERATIONS");

        for (Iterator i = list.iterator(); i.hasNext();) {
            Object o = i.next();
            System.out.println(o);
        }
    }
}
