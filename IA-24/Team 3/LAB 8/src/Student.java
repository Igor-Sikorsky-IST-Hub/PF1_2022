public class Student extends Person {
    String group;
    String speciality;
    public Student(String firstName, String lastName,String speciality,String group, int age){
        if (age < 0 || age > 100) {
            throw new IllegalArgumentException();
        }
        super.firstName=firstName;
        super.lastName=lastName;
        super.age=age;
        this.group=group;
        this.speciality=speciality;
    }
    public Student() {
        super.firstName=firstName;
        super.lastName=lastName;
        super.age=age;
        group="IA-21";
        speciality="FICT";
    }
    @Override
    public String toString() {
        return "Student(" + "First name=" + firstName + ", Last name=" + lastName + ", age=" + age +  ", Speciality=" + speciality+", Group=" + group + " )";
    }
}
