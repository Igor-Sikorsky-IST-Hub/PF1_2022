import java.util.*;

public class Main {
	public static void main(String[] args) {
		Institute kpi = new Institute("КПІ");
	
        Faculty FIOT = new Faculty("ФІОТ");
        Faculty FEL = new Faculty("ФЕЛ");
        
        FIOT.addStudent(new Student("Іван", "Зелінський", 1122, 90));
        FIOT.addStudent(new Student("Василь", "Петренко", 3228, 90.5));
        FIOT.addStudent(new Student("Петро", "Іванов", 4343, 95.9));
        FIOT.addStudent(new Student("София", "Шевченко", 4242, 70));
        FEL.addStudent(new Student("Анна", "Петрова", 4433, 85.5));
        FEL.addStudent(new Student("Єгор", "Бойко", 3229, 60.9));
        FEL.addStudent(new Student("Віктор", "Мельник", 3227, 99.3));
        
        kpi.addFac(FIOT);
        kpi.addFac(FEL);
        

        System.out.println("Кількість студентів, що навчається в " + kpi.getName() + ": " + task1(kpi));
        System.out.println("факультет, на якому навчається найбільша кількість студентів: " + kpi.getAllFacs().last().getName());
        System.out.println("Cписок студентів, у яких середній бал в діапазоні 95..100:");
		for (Iterator<Student> i = task3(kpi).iterator(); i.hasNext();) {
			System.out.println(i.next());
		}
	}

	public static int task1(Institute institute){
		int res = 0;
        for(Faculty i:institute.getAllFacs()){
        	res += i.getSize();
        }
        return res;
	}
	
	public static TreeSet<Student> task3(Institute institute){
		TreeSet<Student> HightMarkStudents = new TreeSet<Student>();
		for (Iterator<Faculty> i = institute.getAllFacs().iterator(); i.hasNext();) {
			for (Iterator<Student> j = i.next().getStudents().iterator(); j.hasNext();) {
				HightMarkStudents.add(j.next());
			}
		}
		return (TreeSet<Student>) HightMarkStudents.tailSet(new Student("", "", 0, 95));
	}

}
