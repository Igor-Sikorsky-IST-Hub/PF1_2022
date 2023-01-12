import java.util.*;
import java.util.Iterator;

public class Employee {
    public String name;
    public double salary;
    public String department;
    private Boolean isDirector;
    private Boolean isHead;

    public Employee(String n, double salary, String d, Boolean isHead, Boolean isDirector) {
        name = n;
        this.salary = salary;
        department = d;
        this.isHead = isHead;
        this.isDirector = isDirector;
    }

    public double getSalary() {
        return salary;
    }

    public Boolean getisDirector() {
        return isDirector;
    }

    public String toString() {
        return "(" + name + ", " + ", " + salary + ", " + department + ", " + isHead + ", " + isDirector + ")";
    }

    public static void main(String[] args) {

    List<Employee> employeeList = new ArrayList<>();
            employeeList.add(new Employee("Tom Jones", 18000.00, "Marketing", true, false));
            employeeList.add(new Employee("Tommy Versace", 19000.00, "HR", true, false));
            employeeList.add(new Employee("Tom Ford", 17000.00, "HR", false, false));
            employeeList.add(new Employee("Ryan Gosling", 34000.00, "Legal", true, false));
            employeeList.add(new Employee("Harry Major", 20000.00, "Legal", false, false));
            employeeList.add(new Employee("Ethan Hardy", 30000.00, "Legal", false, false));
            employeeList.add(new Employee("Nancy Smith", 15000.00, "Marketing", false, false));
            employeeList.add(new Employee("Catherine Jones", 18000.00, "HR", false, false));
            employeeList.add(new Employee("James Elliot", 33000.00, "Operations", true, false));
            employeeList.add(new Employee("James Alvaro", 31000.00, "Operations", false, false));
            employeeList.add(new Employee("John White", 35000.00, "Operations", false, false));
            employeeList.add(new Employee("Frank Anthony", 17000.00, "Marketing", false, false));
            employeeList.add(new Employee("Michael Reeves", 45000.00, "Head of company", false, true));

            //TASK1
        List<Integer> Salarylist = new ArrayList<>();
        Salarylist.add(12000);
        Salarylist.add(19000);
        Salarylist.add(17000);
        Salarylist.add(34000);
        Salarylist.add(20000);
        Salarylist.add(30000);
        Salarylist.add(15000);
        Salarylist.add(18000);
        Salarylist.add(24000);
        Salarylist.add(31000);
        Salarylist.add(35000);
        Salarylist.add(32000);
        Salarylist.add(45000);
        Iterator listIterator = Salarylist.iterator();
        int max = 0;
        while(listIterator.hasNext()) {
            Integer i = (Integer)listIterator.next();
            if(i > max)
                max = i;
        }
        System.out.println("Max salary is " + max);

        //TASK3
        System.out.println("\nList of Employees");
        Iterator<Employee> iter = employeeList.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
