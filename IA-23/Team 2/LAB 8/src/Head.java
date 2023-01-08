public class Head extends Employee {
    private String company;
    private String position;

    public Head() {
        this.company = "Google";
        this.position = "Java Senior SE";
    }

    public Head(String name, int age, String car, String company, String position) {
        super(name, age, car);
        this.company = company;
        this.position = position;
    }

    public Head(Employee employee, String company, String position) {
        super(employee.getName(), employee.getAge(), employee.getCar());
        this.company = company;
        this.position = position;
    }

    public String getCompany() {
        return company;
    }

    public String getPosition() {
        return position;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Head{" + '\'' +
                "name= " + getName() + '\'' +
                ", age= " + getAge() + '\'' +
                ", car= " + getCar() + '\'' +
                ", company= " + company + '\'' +
                ", position= " + position + '\'' +
                "}";
    }
}
