public class Employer {
    private String name;
    private String surname;
    private int salary;

    Employer(String name, String surname, int salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    Employer(String name, String surname, int salary, Department department) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        department.getEmployers().add(Employer.this);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}