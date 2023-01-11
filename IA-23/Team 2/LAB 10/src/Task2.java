import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task2 {

    public static void main(String[] args) {

        List<Employee1> listOfEmployee = new ArrayList<>();
        listOfEmployee.add(new Employee1("Tom Jones", "Marketing", 18000));
        listOfEmployee.add(new Employee1("Frank Anthony", "Marketing", 17000));
        listOfEmployee.add(new Employee1("Ryan Gosling", "Legal", 34000));
        listOfEmployee.add(new Employee1("Catherine Jones", "HR", 18000));
        listOfEmployee.add(new Employee1("James Elliot", "Operations", 33000));
        listOfEmployee.add(new Employee1("Tommy Versace", "HR", 19000));
        listOfEmployee.add(new Employee1("Tom Ford", "HR", 17000));
        listOfEmployee.add(new Employee1("Harry Major", "Legal", 20000));
        listOfEmployee.add(new Employee1("Ethan Hardy", "Legal", 30000));
        listOfEmployee.add(new Employee1("James Alvaro", "Operations", 31000));
        listOfEmployee.add(new Employee1("John White", "Operations", 35000));
        listOfEmployee.add(new Employee1("Nancy Smith", "Marketing", 15000));


        int maxSalary = 0;
        for (int i = 0; i < listOfEmployee.size(); i++) {
            if (listOfEmployee.get(i).getSalary() > maxSalary)
                maxSalary = listOfEmployee.get(i).getSalary();
        }
        System.out.println("The maximum salary is "
                + maxSalary);
        Employee1 max = Collections.max(listOfEmployee);
        System.out.println("Department: " + max.getDep());

    }
}

class Employee1 implements Comparable<Employee1> {

    private String name;
    private String dep;
    private int salary;

    public Employee1(String name, String dep, int salary) {
        super();
        this.name = name;
        this.dep = dep;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDep() {
        return dep;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Employee1 o) {
        if (this.getSalary() > o.getSalary()) {
            return 1;
        } else if (this.getSalary() < o.getSalary()) {
            return -1;
        }
        return 0;
    }

}