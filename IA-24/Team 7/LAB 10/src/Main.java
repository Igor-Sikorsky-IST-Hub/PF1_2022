import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CreateСlasses();
        printResult();

    }


    public static void CreateСlasses() {
        Employee employee1 = new Employee("name1", "surname1", 1000);
        Employee employee2 = new Employee("name2", "surname2", 1100);
        Employee employee3 = new Employee("name3", "surname3", 1200);
        Employee employee4 = new Employee("name4", "surname4", 1300);
        Employee employee5 = new Employee("name5", "surname5", 1400);
        Employee employee6 = new Employee("name6", "surname6", 1500);
        Department department1 = new Department("Department1", "Chief1");
        Department department2 = new Department("Department2", "Chief2");
        Department department3 = new Department("Department3", "Chief3");
        Firm firm1 = new Firm("Firm1", "Head1");
        Firm firm2 = new Firm("Firm2", "Head2");
        Firm firm3 = new Firm("Firm3", "Head3");
        Department.addEmployee(employee1);
        Department.addEmployee(employee2);
        Department.addEmployee(employee3);
        Department.addEmployee(employee4);
        Department.addEmployee(employee5);
        Department.addEmployee(employee6);
        firm1.addDepartment(department1);
        firm2.addDepartment(department2);
        firm3.addDepartment(department3);
        Firm.addFirm(firm1);
        Firm.addFirm(firm2);
        Firm.addFirm(firm3);
    }


    private static void printResult() {
        System.out.println("A list of all company workers : " + ListOfWorkers());

    }

    private static List<String> ListOfWorkers() {
        List<String> ListOfAllWorkers = new ArrayList<>();
        ArrayList<Employee> allEmployees = (ArrayList<Employee>) Department.getAllEmployees();
        for (Employee employee : allEmployees) {
            ListOfAllWorkers.add(employee.toString());
        }
        ArrayList<Department> allDepartment = (ArrayList<Department>) Firm.getAllDepartments();
        for (Department department : allDepartment){
            ListOfAllWorkers.add(department.getChief());
        }
        ArrayList<Firm> allFirms = (ArrayList<Firm>) Firm.getAllFirms();
        for (Firm firm : allFirms){
            ListOfAllWorkers.add(firm.getHead());
        }

        return ListOfAllWorkers;
    }
}
