public class Employer implements Comparable<Employer>{
    final private String name;
    final private String surname;
    final private int salary;

    Employer(String name, String surname, int salary){
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }
    Employer(String name, String surname, int salary, Department department){
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        department.getEmployers().add(Employer.this);
    }

    public String getName(){
        return this.name;
    }



    public String getSurname(){
        return surname;
    }



    public int getSalary(){
        return salary;
    }



    @Override
    public String toString() {
        return name + " " + surname ;
    }

    @Override
    public int compareTo(Employer o) {
        return Integer.compare(this.salary, o.salary);
    }
}
