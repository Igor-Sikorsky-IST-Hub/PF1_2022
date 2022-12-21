public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person);
        Person person1 = new Person("Ugen", "Zakharchyk ", 20);
        System.out.println(person1);
        Student student=new Student();
        System.out.println(student);
        Student student1 = new Student("Taras", "Petrushevich","FICT","IA-24", 25);
        System.out.println(student1);
    }
}
