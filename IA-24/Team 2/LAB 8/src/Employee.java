public class Employee {
    private String name;
    private int age;
    private String education;
    private float salary;

    public  Employee() {
        this.name = "Ivan Kovalenko";
        this.age = 21;
        this.education = "Bachelor";
        this.salary = 35000;
    }

    public Employee(String name, int age, String education, float salary) {
        this.name = name;
        this.age = age;
        this.education = education;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEducation() {
        return education;
    }

    public float getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name " + name + '\'' +
                ", age=" + age +
                ", education='" + education + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
