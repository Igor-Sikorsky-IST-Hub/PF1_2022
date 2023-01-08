public class Person {
    String firstName;
    String lastName;
    int age;


    @Override
    public String toString() {
        return "Person(" + "First name=" + firstName + ", Last name=" + lastName + ", age=" + age + " )";
    }

    public Person() {
        firstName = "Ivan";
        lastName = "Ivanov";
        age = 18;
    }

    public Person(String firstName, String lastName, int age) {
        if (age < 0 || age > 100) {
            throw new IllegalArgumentException();
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
}

