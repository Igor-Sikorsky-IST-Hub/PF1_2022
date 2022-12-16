import java.util.Arrays;

public class Student extends Person {
    private String group;
    private String course;
    private int[] marks;

    public Student() {
        this.group = "IA-23";
        this.course = "PF1";
        this.marks = new int[]{1};
    }

    public Student(String name, int age, String city, String group, String course, int[] marks) {
        super(name, age, city);
        this.group = group;
        this.course = course;
        this.marks = marks;
    }

    public Student(Person person, String group, String course) {
        super(person.getName(), person.getAge(), person.getCity());
        this.group = group;
        this.course = course;
        this.marks = new int[]{};
    }

    public String getCourse() {
        return course;
    }

    public String getGroup() {
        return group;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public void addMark(int mark) {
        marks = Arrays.copyOf(marks, marks.length + 1);
        marks[marks.length - 1] = mark;
    }

    public void addMark() {
        marks = Arrays.copyOf(marks, marks.length + 1);
        marks[marks.length - 1] = 5;
    }

    public void printMarks() {
        System.out.println(Arrays.toString(marks));
    }

    public float getAverageMark() {
        float sum = 0;
        for (int i : marks) {
            sum += i;

        }
        return sum / marks.length;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", city='" + getCity() + '\'' +
                ", group='" + group + '\'' +
                ", course='" + course + '\'' +
                ", marks=" + Arrays.toString(marks) +
                '}';
    }
}
