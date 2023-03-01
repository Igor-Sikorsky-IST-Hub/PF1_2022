import java.util.List;

public class Department {
    private String DepName;
    private List<String> EmployeeList;

    public Department(String DepName, List<String> EmployeeList) {
        this.DepName = DepName;
        this.EmployeeList = EmployeeList;
    }

    public void printEmployeeInfo() {
        System.out.print(this.DepName + ": ");
        for (String dep : this.EmployeeList) {
            System.out.print(dep + ", ");
        }
        System.out.println();
    }
}
