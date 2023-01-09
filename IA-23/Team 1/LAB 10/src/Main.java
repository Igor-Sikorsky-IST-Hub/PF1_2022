import java.util.*;
import java.util.Arrays;



public class Main {



    public static void main(String[] args) {
        Institute inst = new Institute();
        Faculty fbmi = new Faculty();
        Faculty fict = new Faculty();
        Faculty fsp = new Faculty();
        int CountStudentsFict = countStudentsFaculty(fict);
        int CountStudentsFsp = countStudentsFaculty(fsp);
        int CountStudentsFbmi = countStudentsFaculty(fbmi);

        Student student1 = new Student("Andrii", "Tiuska", 26, 80.3);
        Student student2 = new Student("Maxim", "Khokhol", 5, 98.7);
        Student student3 = new Student("David", "Pozhar", 25, 96.5);
        Student student4 = new Student("Yevhenii", "Voroniuk", 12, 95);
        Student student5 = new Student("Vadim", "Voloshyn", 34, 100);
        Student student6 = new Student("Serhii", "Kalyna", 19, 87);
        fbmi.addStudents(Arrays.asList(student1, student4));
        fict.addStudents(Arrays.asList(student2, student5, student6));
        fsp.addStudents(Arrays.asList(student3));
        inst.addStudents(Arrays.asList(student1, student2, student3, student4, student5, student6));

        System.out.println("Students with an average mark of 95-100");
        task3(inst);

        System.out.println("Total amount of all students in institute");
        System.out.println(task1(inst));

        System.out.println("the largest count of students in " +
                task2(CountStudentsFict, CountStudentsFsp, CountStudentsFbmi));



    }

    public static void task3(Institute institute) {
        for (Student x : institute.students) {
            if (x.averageMark >= 95) {
                System.out.print(x.name + " " + x.surname);
                System.out.println(" ");
            }
        }
    }
    public static int task1(Institute institute) {
        int count = 0;
        Iterator iterator = institute.students.iterator();

        while (iterator.hasNext()) {
            count++;
            iterator.next();
        }

        return count;
    }
    public static int countStudentsFaculty(Faculty faculty) {
        int count = 0;
        Iterator<String> iterator = faculty.students.iterator();

        while (iterator.hasNext()) {
            count++;
            iterator.next();
        }
        return count;
    }
    public static String task2(int CountStudentsFict, int CountStudentsFsp, int CountStudentsFbmi) {
        int array[] = new int[]{CountStudentsFict, CountStudentsFsp, CountStudentsFbmi};
      if (getMax(array) == CountStudentsFict) {
            return "Fict";
      } else if (getMax(array) == CountStudentsFsp) {
            return "Fsp";
      }
      else {
          return "Fbmi";
      }
    }

    public static int getMax(int[] inputArray){
        int maxValue = inputArray[0];
        for(int i=1;i < inputArray.length;i++){ if(inputArray[i] > maxValue){
            maxValue = inputArray[i];
        }
        }
        return maxValue;
    }

}