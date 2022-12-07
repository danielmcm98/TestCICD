package ie.atu;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeInput {




    public static void main(String[] args) {
        ArrayList<Employee> listEmployee = new ArrayList<Employee>();
        Scanner input = new Scanner((System.in));

        System.out.println("Enter name: ");
        String name = input.nextLine();
        System.out.println("Enter PPS ID: ");
        int pps = input.nextInt();
        System.out.println("Enter phone number: ");
        int phone = input.nextInt();
        System.out.println("Enter Gender by number (1. Man, 2. Woman, 3. Non-Binary): ");
        int gender = input.nextInt();
        System.out.println("Employment type (Full-time or Part-Time): ");
        String employment = input.nextLine();
        System.out.println("Age: ");
        int age = input.nextInt();

        Employee object = new Employee(name, pps, phone, gender, employment, age);
        listEmployee.add();

    }
}
    public class Employee<listEmployee> {


    }
