package Q1;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        FullTimeEmployee fte = new FullTimeEmployee(1, "Alina", 20000, 30000);
        fte.assignDepartment("HR");
        PartTimeEmployee pte = new PartTimeEmployee(2, "Chiku", 10000, 80, 150);
        pte.assignDepartment("IT");

        employees.add(fte);
        employees.add(pte);

        for (Employee emp : employees) {
            emp.displayDetails();
            if (emp instanceof Department) {
                System.out.println("Department: " + ((Department) emp).getDepartmentDetails());
            }
            System.out.println();
        }
    }
}
