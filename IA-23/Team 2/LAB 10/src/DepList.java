import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class DepList {
    public static void main(String[] args) {
        //Creating departments
        String[] departments = {"HR", "OPERATIONS", "MARKETING", "LEGAL"};

        //HR
        List<String> DepEmployeeList = new ArrayList<>();
        String[] EmployeeList = {"Tommy Versace", "Catherine Jones", "Tom Ford"};
        Collections.addAll(DepEmployeeList, EmployeeList);
        Department hr = new Department(departments[0], DepEmployeeList);
        System.out.println("Head of HR: " + EmployeeList[0]);
        hr.printEmployeeInfo();

        //operations
        DepEmployeeList = new ArrayList<>();
        EmployeeList = new String[]{"James Elliot", "John White", "James Alvaro"};
        Collections.addAll(DepEmployeeList, EmployeeList);
        Department operations = new Department(departments[1], DepEmployeeList);
        System.out.println("\nHead of Operations: " + EmployeeList[0]);
        operations.printEmployeeInfo();

        //marketing
        DepEmployeeList = new ArrayList<>();
        EmployeeList = new String[]{"Tom Jones", "Nancy Smith", "Frank Anthony"};
        Collections.addAll(DepEmployeeList, EmployeeList);
        Department marketing = new Department(departments[2], DepEmployeeList);
        System.out.println("\nHead of Marketing: " + EmployeeList[0]);
        marketing.printEmployeeInfo();

        //legal
        DepEmployeeList = new ArrayList<>();
        EmployeeList = new String[]{"Ryan Gosling", "Harry Major", "Ethan Hardy"};
        Collections.addAll(DepEmployeeList, EmployeeList);
        Department legal = new Department(departments[2], DepEmployeeList);
        System.out.println("\nHead of Legal: " + EmployeeList[0]);
        legal.printEmployeeInfo();
    }
}