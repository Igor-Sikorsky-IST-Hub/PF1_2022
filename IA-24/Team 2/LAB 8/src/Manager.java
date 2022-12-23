
public class Manager extends Employee {
    private float bonus;
    private String position;

    public Manager() {
        this.bonus = 3000*6;
        this.position = "Junior SE";
    }

    public Manager(String name, int age, String education, String position, float salary, float bonus) {
        super(name, age, education, salary);
        this.position = position;
        this.bonus = bonus;
    }

    public Manager(Employee employee, String position, float bonus) {
        super(employee.getName(), employee.getAge(), employee.getEducation(), employee.getSalary());
        this.position = position;
        this.bonus = bonus;
    }

    public String getPosition() {
        return position;
    }

    public float getBonus() {
        return bonus;
    }

    public void setPosition(String position) {
        this.position = position;

    }
     public void setBonus(float bonus) {
        this.bonus = bonus;
     }

     @Override
    public String toString() {
        return "Employee{" +
                "name= " + getName() +
                ", age=" + getAge() +
                ", education= '" + getEducation() +'\'' +
                ", position='" + position + '\'' +
                ", Total salary credited= " + getSalary() +
                ", Bonus of six mounth= " + bonus +
                '}';
     }

}
