import java.util.*;

public class Main {
	public static void main(String[] args) {
		Institute kpi = new Institute("КПІ");
	
        Faculty FIOT = new Faculty("ФІОТ");
        Faculty FEL = new Faculty("ФЕЛ");
        
        Student S1 = new Student("Іван", "Зелінський", 1122, 98, 97, 90);
        
		System.out.println(S1.getMarks());
		
		
        FIOT.addStudent(S1);
        FIOT.addStudent(new Student("Василь", "Петренко", 3228, 95, 89, 90));
        FIOT.addStudent(new Student("Петро", "Іванов", 4343, 93, 100, 93));
        FIOT.addStudent(new Student("София", "Шевченко", 4242, 73, 88, 91));
        FEL.addStudent(new Student("Анна", "Петрова", 4433, 89, 76, 87));
        FEL.addStudent(new Student("Єгор", "Бойко", 3229, 71, 88, 69));
        FEL.addStudent(new Student("Віктор", "Мельник",3228, 98, 97, 99));
        
        kpi.addFac(FIOT);
        kpi.addFac(FEL);
        

        System.out.println("Кількість студентів, що навчається в " + kpi.getName() + ": " + task1(kpi));
        System.out.println("факультет, на якому навчається найбільша кількість студентів: " + task2(kpi).getName());
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
	
	public static Faculty task2(Institute institute){
		Iterator<Faculty> i = institute.getAllFacs().iterator();
		Faculty result = i.next();
		for (i = institute.getAllFacs().iterator(); i.hasNext();) {
			Faculty fac = i.next();
            if (fac.getSize() > result.getSize()){
            	result = fac;
            }  
		}
		return result;
	}
	
	public static HashSet<Student> task3(Institute institute){
		HashSet<Student> HightMarkStudents = new HashSet<>();
		for (Iterator<Faculty> i = institute.getAllFacs().iterator(); i.hasNext();) {
			Faculty fac = i.next();
			for(Iterator<Student> j = fac.getStudents().iterator(); j.hasNext();){
				Student Stud1 = j.next();
				if (Stud1.getvArageMark() >= 95 & Stud1.getvArageMark() <= 100){
					HightMarkStudents.add(Stud1);
				}
			}
		}
		return HightMarkStudents;
	}

}
