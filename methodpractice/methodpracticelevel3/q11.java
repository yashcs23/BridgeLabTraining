package methodpracticelevel3;

import java.util.Random;


class q11 {
    public static void main(String[] args) {
        double[][] employees = getEmployeeData();
        double[][] updatedEmployees = calculateBonus(employees);
        calculateAndDisplaySummary(employees, updatedEmployees);
    }

    public static double[][] getEmployeeData() {
        double[][] employees = new double[10][2];
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            employees[i][0] = 10000 + rand.nextInt(90000);
            employees[i][1] = rand.nextInt(11);
        }
        return employees;
    }

    public static double[][] calculateBonus(double[][] employees) {
        double[][] updatedEmployees = new double[10][2];
        for (int i = 0; i < 10; i++) {
            double oldSalary = employees[i][0];
            double yearsOfService = employees[i][1];
            double bonus;
            if (yearsOfService > 5) {
                bonus = oldSalary * 0.05;
            } else {
                bonus = oldSalary * 0.02;
            }
            updatedEmployees[i][0] = oldSalary + bonus;
            updatedEmployees[i][1] = bonus;
        }
        return updatedEmployees;
    }

    public static void calculateAndDisplaySummary(double[][] employees, double[][] updatedEmployees) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        for (int i = 0; i < 10; i++) {
            double oldSalary = employees[i][0];
            double newSalary = updatedEmployees[i][0];
            double bonus = updatedEmployees[i][1];

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

            System.out.println("Employee " + (i + 1) + ": Old Salary = " + oldSalary + ", New Salary = " + newSalary + ", Bonus = " + bonus);
        }

        System.out.println("Totals:");
        System.out.println("  Total Old Salary: " + totalOldSalary);
        System.out.println("  Total New Salary: " + totalNewSalary);
        System.out.println("  Total Bonus: " + totalBonus);
    }
}
