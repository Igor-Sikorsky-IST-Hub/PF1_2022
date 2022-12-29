import java.util.*;

public class Main {
	public static void main(String[] args) {
		Institute kpi = new Institute("КПІ ім. Ігоря Сікорського");
		
        Faculty FIOT = new Faculty("ФІОТ");
        Faculty FEL = new Faculty("ФЕЛ");
        
        Student student1 = new Student("Іван", "Зелінський", 1122, 90);
        Student student2 = new Student("Василь", "Петренко", 3228, 90.5);
        Student student3 = new Student("Петро", "Іванов", 4343, 95.9);
        Student student4 = new Student("София", "Шевченко", 4242, 70);
        Student student5 = new Student("Анна", "Петрова", 4433, 85.5);
        Student student6 = new Student("Єгор", "Бойко", 3229, 60.9);
        Student student7 = new Student("Віктор", "Мельник", 3227, 99.3);
        
        FIOT.addStudents(Arrays.asList(student1,student3,student5,student7));
        FEL.addStudents(Arrays.asList(student2,student4,student6));
        
        kpi.addFacs(Arrays.asList(FIOT,FEL));
        
		System.out.println("Кількість студентів, що навчається в " + kpi.getName() + ": " + task1(kpi));
        System.out.println("факультет, на якому навчається найбільша кількість студентів: " + task2(kpi).getName());
		System.out.println("Cписок студентів, у яких середній бал в діапазоні 95..100:");
        for(Student i:task3(kpi)){
        	System.out.println(i);
        }
	}

	public static int task1(Institute institute){
		int res = 0;
        for(Faculty i:institute.getAllFacs()){
        	res += i.getStudents().size();
        }
        return res;
	}
	
	public static Faculty task2(Institute institute){
		Faculty result = null;
		for (Iterator<Faculty> i = institute.getAllFacs().iterator(); i.hasNext();) {
			Faculty fac = i.next();
			result = fac;
            if (fac.getStudents().size() > result.getStudents().size()){
            	result = fac;
            }  

		}
		return result;
	}
	
	public static List<Student> task3(Institute institute){
		List<Faculty> Facs = institute.getAllFacs();
		List<Student> HightMarkStudents = new ArrayList<>();
		for(int i = 0; i<Facs.size(); i++){
			for(int j = 0; j<Facs.get(i).getStudents().size(); j++){
				if (Facs.get(i).getStudents().get(j).getMark() >= 95 & Facs.get(i).getStudents().get(j).getMark() <= 100){
					HightMarkStudents.add(Facs.get(i).getStudents().get(j));
				}
			}
		}
		return HightMarkStudents;
	}
}
