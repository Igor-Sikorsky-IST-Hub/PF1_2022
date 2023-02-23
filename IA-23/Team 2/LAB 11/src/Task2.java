import java.util.*;

public class Task2 {

    public static void main(String[] args) {

        TreeSet <Employee1> set = new TreeSet<>();
        set.add(new Employee1("Tom Jones", "Marketing", 18000));
        set.add(new Employee1("Frank Anthony", "Marketing", 17000));
        set.add(new Employee1("Ryan Gosling", "Legal", 34000));
        set.add(new Employee1("Catherine Jones", "HR", 18000));
        set.add(new Employee1("James Elliot", "Operations", 33000));
        set.add(new Employee1("Tommy Versace", "HR", 19000));
        set.add(new Employee1("Tom Ford", "HR", 17000));
        set.add(new Employee1("Harry Major", "Legal", 20000));
        set.add(new Employee1("Ethan Hardy", "Legal", 30000));
        set.add(new Employee1("James Alvaro", "Operations", 31000));
        set.add(new Employee1("John White", "Operations", 35000));
        set.add(new Employee1("Nancy Smith", "Marketing", 15000));
        System.out.println("\n" + "Sort elements in ascending order: " + set);

    }
}

class Employee1 implements Comparable<Employee1> {

     String name;
     String dep;
     Integer salary;

    public Employee1(String name, String dep, int salary) {
        super();
        this.name = name;
        this.dep = dep;
        this.salary = salary;
    }

    public String toString() {
        return ("\n" + this.name + "| " + this.dep + "| " + this.salary + "|");
    }

    @Override
    public int compareTo(Employee1 empl) {
        return this.salary.compareTo(empl.salary);
    }

}