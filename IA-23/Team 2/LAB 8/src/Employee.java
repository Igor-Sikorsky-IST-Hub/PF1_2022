public class Employee {
    private String name;
    private int age;
    private String car;

    public Employee() {
        this.name = "James Gosling";
        this.age = 67;
        this.car = "Tesla";
    }

    public Employee(String name, int age, String car) {
        this.name = name;
        this.age = age;
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public int getAge (){
        return age;
    }

    public String getCar (){
        return car;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge (int age){
        this.age = age;
    }

    public void setCar (String car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Employee{" + '\'' +
                "name= " + name + '\'' +
                ", age= " + age + '\'' +
                ", car= " + car + '\'' +
                "}";
    }
}
