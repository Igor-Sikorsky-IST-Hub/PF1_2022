import java.util.ArrayList;
import java.util.List;

public class Firm {
    private String nameOfFirm;
    private String head;

    public Firm(String nameOfFirm, String head) {
        this.nameOfFirm = nameOfFirm;
        this.head = head;
    }

    private static final List<Firm> allFirms= new ArrayList();

    public static void addFirm(Firm firm) {
        allFirms.add(firm);
    }
    public static List<Firm> getAllFirms() {
        return allFirms;
    }

    public String getHead() {
        return this.head;
    }

    public String getName() {
        return this.nameOfFirm;
    }



    private static final List<Department> allDepartments = new ArrayList();

    public static void addDepartment(Department department) {
        allDepartments.add(department);
    }

    public static List<Department> getAllDepartments() {
        return allDepartments;
    }


    @Override
    public String toString() {
        return "Firm(" + "Name of firm=" + nameOfFirm + ", Head=" + head + " )";
    }
}
