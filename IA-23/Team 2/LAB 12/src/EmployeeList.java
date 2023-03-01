import java.util.*;

public class EmployeeList {
    public static void main(String[] args) {

        HashSet<Employee> employeeL = new HashSet<>();
        employeeL.add(new Employee("Tom Jones", 21000, "Marketing", true, false));
        employeeL.add(new Employee("Tommy Versace", 19000, "HR", true, false));
        employeeL.add(new Employee("Tom Ford", 17000, "HR", false, false));
        employeeL.add(new Employee("Ryan Gosling", 34000, "Legal", true, false));
        employeeL.add(new Employee("Harry Major", 20000, "Legal", false, false));
        employeeL.add(new Employee("Ethan Hardy", 30000, "Legal", false, false));
        employeeL.add(new Employee("Nancy Smith", 15000, "Marketing", false, false));
        employeeL.add(new Employee("Catherine Jones", 18000, "HR", false, false));
        employeeL.add(new Employee("James Elliot", 33000, "Operations", true, false));
        employeeL.add(new Employee("James Alvaro", 31000, "Operations", false, false));
        employeeL.add(new Employee("John White", 35000, "Operations", false, false));
        employeeL.add(new Employee("Frank Anthony", 22000, "Marketing", false, false));
        employeeL.add(new Employee("Michael Reeves", 45000, "Head of company", false, true));

        //TASK3
        System.out.println("List of employees: " + employeeL);
    }
}
class Employee implements Comparable<Employee> {
    String name;
    Integer salary;
    String department;
    Boolean isDirector;
    Boolean isHead;

    public Employee(String n, Integer salary, String d, Boolean isHead, Boolean isDirector) {
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


    @Override
    public int compareTo(Employee empl) {
        return this.name.compareTo(empl.name);
    }
}

