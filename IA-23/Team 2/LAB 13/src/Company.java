import java.util.ArrayList;
public class Company {
    private static final int max = 4;
    ArrayList<Employee> comp = new ArrayList<>();

    public void addComp(Employee employee) throws CheckedException {
        if(comp.size() >= max) {
            throw new CheckedException("Too many employees in the list");
        }
        comp.add(employee);
    }
    private String getEmployee() {
        return comp.toString();
    }
    public static void main(String[] args) {
        Company company = new Company();
        try {
            company.addComp(new Employee("John"));
            company.addComp(new Employee("Tom"));
            company.addComp(new Employee("Tommy"));
            company.addComp(new Employee("Will"));
            company.addComp(new Employee("Sam"));
        } catch (CheckedException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Employee list: " + company.getEmployee());
        }
    }
}
