import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String firstname;
    private String surname;
    private int salary;

    public Employee(String firstname, String surname, int salary) {
        if (salary < 0) {
            throw new IllegalArgumentException();
        }
        this.firstname = firstname;
        this.surname = surname;
        this.salary = salary;
    }



    public String getName() {
        return this.firstname;
    }

    public String getSurname() {
        return this.surname;
    }

    public int getSalary() {
        return this.salary;
    }

    @Override
    public String toString() {
        return firstname + " " + surname;
    }


}
