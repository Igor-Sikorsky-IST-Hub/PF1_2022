
public class Main {
    public static void main(String[] args) {
        Student defaultStudent = new Student();
        Student student1 = new Student("Danya Shyriaiev", 18, "Cherkassy", "IA-23", "PF1", new int[]{5, 5, 5, 5});
        System.out.println(defaultStudent.toString());
        System.out.println(student1.toString());
        student1.setName("Nikita Stepanov");
        student1.setCity("Brovary");
        System.out.println(student1.getName());
        System.out.println(student1.getCity());
        Person person1 = new Person("Semashko Sasha", 17, "Baranivka");
        System.out.println(person1.toString());
        Student student2 = new Student(person1, "IA-23", "PF1");
        System.out.println(student2.toString());
        student2.addMark();
        student2.addMark(4);
        student2.addMark(5);
        student2.printMarks();
        System.out.println(student2.getAverageMark());
        System.out.println(student1.equals(student2));
        System.out.println(student2.equals(defaultStudent));

    }
}
