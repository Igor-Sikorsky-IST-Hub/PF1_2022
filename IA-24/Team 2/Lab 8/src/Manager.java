
public class Manager extends Employee {
    private float bonus;


    public Manager() {
        this.bonus = 3000*6;
    }

    public Manager(String name, int age, String education, String position, float salary, float bonus) {
        super(name, age, education, position, salary);
        this.bonus = bonus;
    }

    public Manager(Employee employee, String position, float bonus) {
        super(employee.getName(), employee.getAge(), employee.getEducation(), employee.getPosition(), employee.getSalary());
        this.bonus = bonus;
    }


    public float getBonus() {
        return bonus;
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
                ", position='" + getPosition() + '\'' +
                ", Total salary credited= " + getSalary() +
                ", Bonus of six mounth= " + bonus +
                '}';
     }

}
