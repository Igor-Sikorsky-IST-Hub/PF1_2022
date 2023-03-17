import java.util.*;

public class Lab13 {
    public static void main(String[] args) {
        try {
            Worker petro = new Worker(null, null, 0);
        }catch (NullPointerException ex){
            System.out.println("NullPointerException");
        }
        Worker elonMusk = new Worker("Elon", "Musk", 1);
        Worker johnStenly = new Worker("John", "Stenly", 15000);
        Worker ivanLeleka = new Worker("ivan", "Leleka", 11000);
        Worker siLon = new Worker("Si", "Lon", 12000);
        Worker abdulaMarin = new Worker("Abdula", "Marin", 9000);
        Worker fridrichWurst = new Worker("Fridrich", "Wurst", 125000);
        Worker pedroRiviero = new Worker("Pedro", "Riviero", 12345);
        Worker antuanLambre = new Worker("Antuan", "Lambre", 2500);
        Worker nassimTaleb = new Worker("Nassim", "Taleb", 1);
        Worker franciskoAmerotti = new Worker("Francisko", "Amerotti", 23000);
        Worker saimonCosta = new Worker("Saimon", "Costa", 5000);
        Worker jannetToulon = new Worker("Jannet", "Toulon", 10000);
        Worker abrachamTuire = new Worker("Abracham","Tuire",6000);
        Worker retroPetrenko = new Worker("Petro", "Petrenko", 6000);
        Worker igorSikorsky = new Worker("Igor","Sikorsky", 20000);
        Worker benuaBelo = new Worker("Benua", "Belo", 5500);
        Worker richardChan = new Worker("Richard", "Chan", 5000);

        HashSet<Worker> workersOfMarketing = new HashSet();
        HashSet<Worker> sellers = new HashSet();
        HashSet<Worker> workersOfPlant = new HashSet();

        workersOfMarketing.add(johnStenly);
        workersOfMarketing.add(siLon);
        workersOfMarketing.add(abdulaMarin);
        workersOfMarketing.add(fridrichWurst);
        workersOfMarketing.add(pedroRiviero);
        workersOfMarketing.add(antuanLambre);

        sellers.add(franciskoAmerotti);
        sellers.add(saimonCosta);
        sellers.add(jannetToulon);

        workersOfPlant.add(abrachamTuire);
        workersOfPlant.add(retroPetrenko);
        workersOfPlant.add(benuaBelo);
        workersOfPlant.add(richardChan);

        Department plant = null;
        try {
            plant = new Department("Plant", igorSikorsky, workersOfPlant);
        } catch (SmallNumberOfWorkersException e) {
            System.out.println("Замало працівників у департаменті");
        }


        Department departmentOfSelling = null;
        try {
            departmentOfSelling = new Department("DepartmentOfSelling", nassimTaleb, sellers);
        } catch (SmallNumberOfWorkersException e) {
            System.out.println("Замало працівників у департаменті");
        }


        Department departmentOfMarketing = null;
        try {
            departmentOfMarketing = new Department("Marketing", ivanLeleka, workersOfMarketing);
        } catch (SmallNumberOfWorkersException e) {
            System.out.println("Замало працівників у департаменті");
        }

        HashSet<Department> departments = new HashSet<>();

        if (plant != null){
            departments.add(plant);
        }

        if(departmentOfMarketing != null){
            departments.add(departmentOfMarketing);
        }

        if(departmentOfSelling != null){
            departments.add(departmentOfSelling);
        }


        Company tesla = new Company("Tesla", departments, elonMusk);

        System.out.println(tesla.generalList());
        System.out.println(tesla.highestSalary());
        System.out.println(tesla.salaryIsHigherThanSalaryOfBoss());
        System.out.println(tesla.listSurnameWithSalary());

    }
}