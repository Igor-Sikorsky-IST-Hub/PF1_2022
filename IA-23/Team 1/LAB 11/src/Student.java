public class Student  implements Comparable<Student> {
    String name;
    String surname;
    int number;
    double averageMark;
    public Student(String name,String surname,int number,double averageMark){
        this.name = name;
        this.surname = surname;
        this.number = number;
        this.averageMark = averageMark;
    }

    @Override
    public int compareTo(Student anotherStudent) {
        if(this.averageMark == anotherStudent.averageMark){
            return 0;
        } else if(this.averageMark > anotherStudent.averageMark){
            return -1;
        } else{
            return 1;
        }
    }
}
